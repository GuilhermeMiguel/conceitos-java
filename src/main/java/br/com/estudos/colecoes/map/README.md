# 🗺️ Map - Estruturas Chave-Valor

## Conceitos Fundamentais

### O que é um Map?
Interface que mapeia chaves únicas para valores. Não permite chaves duplicadas.

### Principais Implementações

| Implementação | Ordenação | Performance | Thread-Safe |
|---------------|-----------|-------------|-------------|
| `HashMap`     | ❌        | O(1)        | ❌          |
| `LinkedHashMap` | Inserção | O(1)        | ❌          |
| `TreeMap`     | Natural   | O(log n)    | ❌          |
| `ConcurrentHashMap` | ❌   | O(1)        | ✅          |

## Exemplos Práticos

### HashMap - Mais Comum
```java
Map<String, Integer> idades = new HashMap<>();

// Adicionar elementos
idades.put("João", 25);
idades.put("Maria", 30);
idades.put("Pedro", 28);

// Acessar elementos
Integer idade = idades.get("João"); // 25
Integer idadeDefault = idades.getOrDefault("Ana", 0); // 0

// Verificar existência
boolean temJoao = idades.containsKey("João"); // true
boolean tem25Anos = idades.containsValue(25); // true

// Iterar
for (Map.Entry<String, Integer> entry : idades.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}

// Java 8+ forEach
idades.forEach((nome, idade) -> 
    System.out.println(nome + ": " + idade));
```

### TreeMap - Ordenado
```java
Map<String, String> paises = new TreeMap<>();
paises.put("BR", "Brasil");
paises.put("US", "Estados Unidos");
paises.put("AR", "Argentina");

// Sempre ordenado pelas chaves
// Output: AR, BR, US
```

### LinkedHashMap - Ordem de Inserção
```java
Map<String, String> cores = new LinkedHashMap<>();
cores.put("vermelho", "#FF0000");
cores.put("verde", "#00FF00");
cores.put("azul", "#0000FF");

// Mantém ordem de inserção
// Output: vermelho, verde, azul
```

## Métodos Úteis (Java 8+)

### Operações Condicionais
```java
Map<String, Integer> estoque = new HashMap<>();

// Adicionar se não existir
estoque.putIfAbsent("produto1", 10);

// Computar valor
estoque.compute("produto1", (key, val) -> val == null ? 1 : val + 1);

// Computar se presente
estoque.computeIfPresent("produto1", (key, val) -> val * 2);

// Merge - combinar valores
estoque.merge("produto1", 5, Integer::sum);
```

### Transformações
```java
Map<String, String> nomes = Map.of(
    "joao", "João Silva",
    "maria", "Maria Santos"
);

// Transformar valores
Map<String, String> maiusculas = nomes.entrySet().stream()
    .collect(Collectors.toMap(
        Map.Entry::getKey,
        entry -> entry.getValue().toUpperCase()
    ));
```

## Padrões Comuns

### Cache Simples
```java
public class Cache<K, V> {
    private final Map<K, V> cache = new ConcurrentHashMap<>();
    
    public V get(K key, Function<K, V> loader) {
        return cache.computeIfAbsent(key, loader);
    }
}
```

### Agrupamento
```java
List<Pessoa> pessoas = Arrays.asList(/*...*/);

// Agrupar por idade
Map<Integer, List<Pessoa>> porIdade = pessoas.stream()
    .collect(Collectors.groupingBy(Pessoa::getIdade));

// Contar por categoria
Map<String, Long> contagem = pessoas.stream()
    .collect(Collectors.groupingBy(
        Pessoa::getCategoria,
        Collectors.counting()
    ));
```

## Arquivos de Exemplo

- [`MapTeste.java`](MapTeste.java) - Operações básicas
- [`TreeMapTeste.java`](TreeMapTeste.java) - Map ordenado
- [`UsoHashMap.java`](UsoHashMap.java) - Casos práticos
- [`ConsumidorMapTeste.java`](ConsumidorMapTeste.java) - Exemplo com objetos

## 💡 Boas Práticas

1. **Use HashMap** para a maioria dos casos
2. **Use TreeMap** quando precisar de ordenação
3. **Use LinkedHashMap** para manter ordem de inserção
4. **Use ConcurrentHashMap** em ambientes multi-thread
5. **Implemente equals() e hashCode()** corretamente nas chaves
6. **Prefira Map.of()** para maps imutáveis pequenos (Java 9+)
