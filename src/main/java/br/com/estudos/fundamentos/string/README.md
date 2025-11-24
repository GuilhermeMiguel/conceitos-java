# 🔤 Manipulação de Strings

## Conceitos Fundamentais

### String vs StringBuilder vs StringBuffer

- **String**: Imutável, cada operação cria um novo objeto
- **StringBuilder**: Mutável, não thread-safe, mais rápido
- **StringBuffer**: Mutável, thread-safe, mais lento

## Exemplos Práticos

### Performance Comparison
```java
// ❌ Ineficiente - cria muitos objetos
String resultado = "";
for (int i = 0; i < 1000; i++) {
    resultado += "texto";
}

// ✅ Eficiente - usa buffer interno
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append("texto");
}
String resultado = sb.toString();
```

### Métodos Úteis
```java
String texto = "Java Programming";

// Verificações
texto.isEmpty()           // false
texto.isBlank()          // false (Java 11+)
texto.length()           // 16

// Manipulação
texto.charAt(0)          // 'J'
texto.substring(0, 4)    // "Java"
texto.toLowerCase()      // "java programming"
texto.replace("Java", "Python") // "Python Programming"

// Divisão e junção
String[] palavras = texto.split(" ");
String junto = String.join("-", palavras); // "Java-Programming"
```

## Arquivos de Exemplo

- [`StringTeste.java`](StringTeste.java) - Operações básicas
- [`StringPerformanceTeste.java`](StringPerformanceTeste.java) - Comparação de performance

## 💡 Dicas

1. Use `StringBuilder` para concatenações em loops
2. Use `String.format()` ou text blocks para formatação
3. Prefira `equals()` ao invés de `==` para comparação
4. Use `intern()` com cuidado (pool de strings)
