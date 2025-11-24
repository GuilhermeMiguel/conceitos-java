# ⚡ Threads e Concorrência

## Conceitos Fundamentais

### O que são Threads?
Threads permitem execução paralela de código, melhorando performance em operações I/O e processamento.

### Criação de Threads

```java
// Método 1: Estendendo Thread
class MinhaThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread executando: " + getName());
    }
}

// Método 2: Implementando Runnable
class MinhaTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task executando");
    }
}

// Método 3: Lambda (Java 8+)
Thread thread = new Thread(() -> {
    System.out.println("Lambda thread");
});
```

## Sincronização

### Synchronized
```java
public class Contador {
    private int valor = 0;
    
    // Método sincronizado
    public synchronized void incrementar() {
        valor++;
    }
    
    // Bloco sincronizado
    public void decrementar() {
        synchronized(this) {
            valor--;
        }
    }
}
```

### Locks (java.util.concurrent)
```java
private final ReentrantLock lock = new ReentrantLock();

public void metodoComLock() {
    lock.lock();
    try {
        // código crítico
    } finally {
        lock.unlock();
    }
}
```

## Comunicação entre Threads

### Wait/Notify
```java
public class Buffer {
    private boolean disponivel = false;
    private Object dado;
    
    public synchronized void produzir(Object item) {
        while (disponivel) {
            try {
                wait(); // Espera consumir
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        dado = item;
        disponivel = true;
        notifyAll(); // Notifica consumidores
    }
    
    public synchronized Object consumir() {
        while (!disponivel) {
            try {
                wait(); // Espera produzir
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        disponivel = false;
        notifyAll(); // Notifica produtores
        return dado;
    }
}
```

## Deadlock

### O que é Deadlock?
Situação onde duas ou mais threads ficam bloqueadas esperando umas pelas outras.

```java
// ❌ Código propenso a deadlock
public void metodo1() {
    synchronized(recurso1) {
        synchronized(recurso2) {
            // trabalho
        }
    }
}

public void metodo2() {
    synchronized(recurso2) {
        synchronized(recurso1) { // Ordem diferente!
            // trabalho
        }
    }
}

// ✅ Prevenção: sempre mesma ordem
public void metodo1() {
    synchronized(recurso1) {
        synchronized(recurso2) {
            // trabalho
        }
    }
}

public void metodo2() {
    synchronized(recurso1) { // Mesma ordem
        synchronized(recurso2) {
            // trabalho
        }
    }
}
```

## Executor Framework

```java
// Thread Pool
ExecutorService executor = Executors.newFixedThreadPool(4);

// Submeter tarefas
Future<String> future = executor.submit(() -> {
    return "Resultado da tarefa";
});

// Obter resultado
String resultado = future.get();

// Finalizar
executor.shutdown();
```

## Arquivos de Exemplo

- [`ThreadTeste.java`](ThreadTeste.java) - Criação e uso básico
- [`SincronismoTeste.java`](SincronismoTeste.java) - Sincronização
- [`DeadLockTeste.java`](DeadLockTeste.java) - Exemplo de deadlock
- [`NotifyAndWait/`](NotifyAndWait/) - Comunicação entre threads

## 💡 Boas Práticas

1. **Use Executor Framework** ao invés de criar threads manualmente
2. **Evite synchronized desnecessário** - use classes thread-safe
3. **Sempre libere recursos** em blocos finally
4. **Trate InterruptedException** adequadamente
5. **Use Virtual Threads (Java 21)** para alta concorrência
