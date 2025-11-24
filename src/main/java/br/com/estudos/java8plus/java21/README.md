# 🚀 Java 21 LTS - Novas Features

## Records (Java 14+)

### O que são Records?
Classes de dados imutáveis com menos boilerplate.

```java
// ✅ Com Record (conciso)
public record Pessoa(String nome, int idade, String email) {
    // Compact constructor para validação
    public Pessoa {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
    }
}

// ❌ Classe tradicional (verbosa)
public class PessoaTradicional {
    private final String nome;
    private final int idade;
    private final String email;
    
    // Constructor, getters, equals, hashCode, toString...
}
```

## Sealed Classes (Java 17+)

### Controle de Hierarquia
```java
// Define quais classes podem implementar/estender
public sealed interface Forma permits Circulo, Retangulo, Triangulo {
    double area();
}

public record Circulo(double raio) implements Forma {
    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
```

## Pattern Matching

### Switch Expressions (Java 21)
```java
// Pattern matching com switch
String resultado = switch (forma) {
    case Circulo c -> "Círculo com área: " + c.area();
    case Retangulo r -> "Retângulo com área: " + r.area();
    case Triangulo t -> "Triângulo com área: " + t.area();
};
```

### instanceof Pattern Matching
```java
// Java 16+
if (obj instanceof String s) {
    System.out.println("String length: " + s.length());
    // 's' está disponível neste escopo
}
```

## Virtual Threads (Java 21)

### Threads Leves
```java
// Criação de virtual threads
Thread.ofVirtual().start(() -> {
    System.out.println("Virtual Thread: " + Thread.currentThread());
});

// Para alta concorrência
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    for (int i = 0; i < 1_000_000; i++) {
        executor.submit(() -> {
            // Tarefa leve
        });
    }
}
```

## Text Blocks (Java 15+)

### Strings Multilinha
```java
String json = """
    {
        "nome": "João",
        "idade": 30,
        "email": "joao@email.com"
    }
    """;
```

## Arquivos de Exemplo

- [`Java21Features.java`](Java21Features.java) - Demonstração completa das features

## 🎯 Quando Usar

- **Records**: Para DTOs, Value Objects, dados imutáveis
- **Sealed Classes**: Para hierarquias controladas, state machines
- **Pattern Matching**: Para código mais legível e type-safe
- **Virtual Threads**: Para alta concorrência com I/O
- **Text Blocks**: Para SQL, JSON, HTML, templates

## 💡 Benefícios

1. **Menos Boilerplate**: Records eliminam código repetitivo
2. **Type Safety**: Pattern matching reduz erros
3. **Performance**: Virtual threads para milhões de tarefas concorrentes
4. **Legibilidade**: Text blocks para strings complexas
