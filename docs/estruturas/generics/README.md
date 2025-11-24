# 🔧 Generics - Type Safety

## Conceitos Fundamentais

### O que são Generics?
Permitem criar classes, interfaces e métodos que trabalham com tipos parametrizados, fornecendo type safety em tempo de compilação.

### Antes vs Depois dos Generics

```java
// ❌ Sem Generics (Java < 5)
List lista = new ArrayList();
lista.add("String");
lista.add(123); // Aceita qualquer Object
String item = (String) lista.get(0); // Cast necessário

// ✅ Com Generics (Java 5+)
List<String> lista = new ArrayList<>();
lista.add("String");
// lista.add(123); // Erro de compilação!
String item = lista.get(0); // Sem cast
```

## Sintaxe Básica

### Classes Genéricas
```java
public class Caixa<T> {
    private T conteudo;
    
    public void guardar(T item) {
        this.conteudo = item;
    }
    
    public T retirar() {
        return conteudo;
    }
}

// Uso
Caixa<String> caixaTexto = new Caixa<>();
caixaTexto.guardar("Hello");
String texto = caixaTexto.retirar();
```

### Múltiplos Parâmetros
```java
public class Par<T, U> {
    private T primeiro;
    private U segundo;
    
    public Par(T primeiro, U segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
    
    // getters...
}

// Uso
Par<String, Integer> nomeIdade = new Par<>("João", 25);
```

## Bounded Types (Tipos Limitados)

### Upper Bounds
```java
// T deve ser Number ou subclasse
public class Calculadora<T extends Number> {
    public double somar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

// Uso
Calculadora<Integer> calcInt = new Calculadora<>();
Calculadora<Double> calcDouble = new Calculadora<>();
// Calculadora<String> calcString = new Calculadora<>(); // ERRO!
```

### Multiple Bounds
```java
// T deve implementar Comparable E Serializable
public class Ordenador<T extends Comparable<T> & Serializable> {
    public void ordenar(List<T> lista) {
        Collections.sort(lista);
    }
}
```

## Wildcards

### Upper Bounded Wildcards (? extends)
```java
// Pode ler, mas não escrever
public void processarNumeros(List<? extends Number> numeros) {
    for (Number num : numeros) {
        System.out.println(num.doubleValue());
    }
    // numeros.add(10); // ERRO! Não pode adicionar
}

// Uso
List<Integer> inteiros = Arrays.asList(1, 2, 3);
List<Double> decimais = Arrays.asList(1.1, 2.2, 3.3);
processarNumeros(inteiros);  // OK
processarNumeros(decimais);  // OK
```

### Lower Bounded Wildcards (? super)
```java
// Pode escrever, leitura limitada
public void adicionarNumeros(List<? super Integer> lista) {
    lista.add(10);
    lista.add(20);
    // Integer num = lista.get(0); // ERRO! Retorna Object
    Object obj = lista.get(0); // OK
}

// Uso
List<Number> numeros = new ArrayList<>();
List<Object> objetos = new ArrayList<>();
adicionarNumeros(numeros);  // OK
adicionarNumeros(objetos);  // OK
```

### Unbounded Wildcards (?)
```java
public void imprimirLista(List<?> lista) {
    for (Object item : lista) {
        System.out.println(item);
    }
}
```

## Métodos Genéricos

```java
public class Utilitarios {
    // Método genérico estático
    public static <T> void trocar(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    // Método com bounded type
    public static <T extends Comparable<T>> T maximo(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}

// Uso
String[] nomes = {"Ana", "Bruno", "Carlos"};
Utilitarios.trocar(nomes, 0, 2); // ["Carlos", "Bruno", "Ana"]

String maior = Utilitarios.maximo("Java", "Python"); // "Python"
```

## Type Erasure

### O que é?
Java remove informações de tipo genérico em tempo de execução por compatibilidade.

```java
List<String> strings = new ArrayList<>();
List<Integer> integers = new ArrayList<>();

// Em runtime, ambos são apenas List
System.out.println(strings.getClass() == integers.getClass()); // true
```

### Implicações
```java
// ❌ Não funciona - type erasure
// if (lista instanceof List<String>) { }

// ✅ Funciona
if (lista instanceof List<?>) { }

// ❌ Não pode criar array de tipo genérico
// T[] array = new T[10];

// ✅ Workaround
@SuppressWarnings("unchecked")
T[] array = (T[]) new Object[10];
```

## Arquivos de Exemplo

- [`GenericsTeste.java`](GenericsTeste.java) - Conceitos básicos
- [`TiposLimitadosTeste.java`](TiposLimitadosTeste.java) - Bounded types
- [`WildCardsTeste.java`](WildCardsTeste.java) - Wildcards
- [`ExemploGenericTeste.java`](ExemploGenericTeste.java) - Exemplo prático

## 💡 Boas Práticas

1. **Use nomes descritivos**: `T` (Type), `E` (Element), `K` (Key), `V` (Value)
2. **Prefira wildcards** em APIs públicas para flexibilidade
3. **PECS**: Producer Extends, Consumer Super
4. **Evite raw types** - sempre use parametrização
5. **Cuidado com arrays** e generics - preferir Collections
