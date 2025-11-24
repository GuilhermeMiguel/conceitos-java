# ☕ Conceitos Java - Guia Completo

> **Projeto de estudos abrangente sobre Java 21 LTS com exemplos práticos e documentação detalhada**

[![Java](https://img.shields.io/badge/Java-21%20LTS-orange.svg)](https://openjdk.java.net/projects/jdk/21/)
[![Maven](https://img.shields.io/badge/Maven-3.11.0-blue.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

## 🎯 Sobre o Projeto

Este repositório contém uma coleção completa de conceitos Java organizados de forma didática, desde fundamentos até features avançadas do Java 21 LTS. Cada tópico inclui:

- 📝 **Documentação detalhada** com explicações teóricas
- 💻 **Exemplos práticos** executáveis
- 🎯 **Casos de uso reais**
- 💡 **Boas práticas** e dicas

---

## 📚 Índice de Conteúdo

### 🔧 Fundamentos
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Strings** | Manipulação, performance, StringBuilder vs StringBuffer | [📖 Ver Docs](src/main/java/br/com/estudos/fundamentos/string/README.md) |
| **Wrapper Classes** | Autoboxing, unboxing, classes wrapper | [📖 Ver Docs](src/main/java/br/com/estudos/fundamentos/wrapper/) |
| **Enumeradores** | Enums, métodos, casos de uso | [📖 Ver Docs](src/main/java/br/com/estudos/fundamentos/enumeradores/) |
| **Assertions** | Debugging com assertions | [📖 Ver Docs](src/main/java/br/com/estudos/fundamentos/assertivas/) |
| **Conceitos Úteis** | Varargs, método main, dicas gerais | [📖 Ver Docs](src/main/java/br/com/estudos/fundamentos/conceitos/) |

### 🎯 Orientação a Objetos (OOP)
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Herança** | Extends, super, this, hierarquias | [📖 Ver Docs](src/main/java/br/com/estudos/oop/heranca/README.md) |
| **Classes Abstratas** | Abstract classes, métodos abstratos | [📖 Ver Docs](src/main/java/br/com/estudos/oop/classes_abstratas/) |
| **Interfaces** | Contratos, métodos default, múltiplas interfaces | [📖 Ver Docs](src/main/java/br/com/estudos/oop/interfaces/) |
| **Polimorfismo** | Sobrescrita, sobrecarga, dynamic binding | [📖 Ver Docs](src/main/java/br/com/estudos/oop/polimorfismo/) |
| **Modificadores** | Static, final, access modifiers | [📖 Ver Docs](src/main/java/br/com/estudos/oop/modificadores/) |
| **Equals & HashCode** | Implementação correta, contratos | [📖 Ver Docs](src/main/java/br/com/estudos/oop/equals_hashcode/) |

### 📚 Coleções (Collections)
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Set** | HashSet, TreeSet, LinkedHashSet | [📖 Ver Docs](src/main/java/br/com/estudos/colecoes/set/) |
| **Map** | HashMap, TreeMap, LinkedHashMap | [📖 Ver Docs](src/main/java/br/com/estudos/colecoes/map/) |
| **Queue** | Filas, Deque, PriorityQueue | [📖 Ver Docs](src/main/java/br/com/estudos/colecoes/queue/) |
| **Stack** | Pilhas, LIFO operations | [📖 Ver Docs](src/main/java/br/com/estudos/colecoes/stack/) |
| **List** | ArrayList, LinkedList, Vector | [📖 Ver Docs](src/main/java/br/com/estudos/colecoes/list/) |

### ⚡ Concorrência
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Threads** | Criação, ciclo de vida, estados | [📖 Ver Docs](src/main/java/br/com/estudos/concorrencia/threads/README.md) |
| **Sincronização** | Synchronized, locks, atomic | [📖 Ver Docs](src/main/java/br/com/estudos/concorrencia/sincronizacao/) |
| **Deadlock** | Prevenção, detecção, resolução | [📖 Ver Docs](src/main/java/br/com/estudos/concorrencia/deadlock/) |
| **Wait/Notify** | Comunicação entre threads | [📖 Ver Docs](src/main/java/br/com/estudos/concorrencia/wait_notify/) |

### 💾 Entrada/Saída (I/O)
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **I/O Clássico** | File, FileReader, BufferedReader | [📖 Ver Docs](src/main/java/br/com/estudos/io/classico/) |
| **NIO** | Path, Files, Channels, selectors | [📖 Ver Docs](src/main/java/br/com/estudos/io/nio/) |
| **Serialização** | Serializable, transient, versionUID | [📖 Ver Docs](src/main/java/br/com/estudos/io/serializacao/) |

### 🚀 Java 8+ Features
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Lambdas** | Expressões lambda, functional interfaces | [📖 Ver Docs](src/main/java/br/com/estudos/java8plus/lambdas/) |
| **Streams** | Stream API, collectors, parallel streams | [📖 Ver Docs](src/main/java/br/com/estudos/java8plus/streams/) |
| **Optional** | Evitando NullPointerException | [📖 Ver Docs](src/main/java/br/com/estudos/java8plus/optional/) |
| **Data/Hora** | LocalDate, LocalTime, ZonedDateTime | [📖 Ver Docs](src/main/java/br/com/estudos/java8plus/data_hora/) |
| **Method Reference** | Referências de método | [📖 Ver Docs](src/main/java/br/com/estudos/java8plus/method_reference/) |
| **🆕 Java 21** | Records, Sealed Classes, Virtual Threads | [📖 Ver Docs](src/main/java/br/com/estudos/java8plus/java21/README.md) |

### 🏗️ Estruturas de Dados
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Lista Ligada** | Implementação própria, algoritmos | [📖 Ver Docs](src/main/java/br/com/estudos/estruturas/lista_ligada/) |
| **Generics** | Type parameters, wildcards, bounded types | [📖 Ver Docs](src/main/java/br/com/estudos/estruturas/generics/) |

---

## 🚀 Como Usar Este Projeto

### Pré-requisitos
- ☕ **Java 21 LTS** ou superior
- 📦 **Maven 3.11.0** ou superior
- 🔧 **IDE** de sua preferência (IntelliJ, Eclipse, VS Code)

### Executando os Exemplos

```bash
# Clonar o repositório
git clone https://github.com/GuilhermeMiguel/conceitos-java.git
cd conceitos-java

# Compilar o projeto
mvn clean compile

# Executar exemplo específico
java -cp src/main/java br.com.estudos.fundamentos.string.StringTeste

# Executar features Java 21 (com preview)
java --enable-preview -cp src/main/java br.com.estudos.java8plus.java21.Java21Features
```

### Estrutura do Projeto
```
src/main/java/br/com/estudos/
├── 🔧 fundamentos/          # Conceitos básicos
├── 🎯 oop/                  # Orientação a Objetos
├── 📚 colecoes/             # Collections Framework
├── ⚡ concorrencia/         # Threads e Concorrência
├── 💾 io/                   # Entrada e Saída
├── 🚀 java8plus/            # Features modernas
└── 🏗️ estruturas/          # Estruturas de Dados
```

---

## 🎯 Destaques do Java 21

### 🆕 Principais Features
- **Records**: Classes de dados concisas
- **Sealed Classes**: Hierarquias controladas
- **Pattern Matching**: Switch expressions poderosas
- **Virtual Threads**: Concorrência massiva
- **Text Blocks**: Strings multilinha

### 💡 Exemplo Rápido
```java
// Record com validação
public record Pessoa(String nome, int idade) {
    public Pessoa {
        if (idade < 0) throw new IllegalArgumentException("Idade inválida");
    }
}

// Pattern matching
String resultado = switch (forma) {
    case Circulo c -> "Área: " + c.area();
    case Retangulo r -> "Área: " + r.area();
};

// Virtual Threads
Thread.ofVirtual().start(() -> {
    // Tarefa leve e rápida
});
```

---

## 📊 Estatísticas do Projeto

- 📁 **145+ arquivos** de código e documentação
- 🎯 **30+ conceitos** cobertos
- 💻 **100+ exemplos** práticos
- 📝 **Documentação completa** para cada tópico
- ✅ **Java 21 LTS** com preview features

---

## 🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir:

1. 🍴 Fork o projeto
2. 🌟 Crie uma branch para sua feature
3. 💻 Implemente suas mudanças
4. 📝 Adicione documentação
5. 🧪 Teste seus exemplos
6. 📤 Abra um Pull Request

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para detalhes.

---

## 🎓 Sobre

Este projeto foi criado como um guia de estudos abrangente para desenvolvedores Java, cobrindo desde conceitos fundamentais até as features mais recentes do Java 21 LTS.

**Desenvolvido com ❤️ para a comunidade Java**

---

### 🔗 Links Úteis

- [📚 Documentação Oficial Java](https://docs.oracle.com/en/java/javase/21/)
- [🚀 OpenJDK 21](https://openjdk.java.net/projects/jdk/21/)
- [📦 Maven Central](https://search.maven.org/)
- [🛠️ IntelliJ IDEA](https://www.jetbrains.com/idea/)

---

**⭐ Se este projeto te ajudou, considere dar uma estrela!**
