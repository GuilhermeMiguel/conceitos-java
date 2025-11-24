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
| **Strings** | Manipulação, performance, StringBuilder vs StringBuffer | [📖 Ver Docs](docs/fundamentos/string/README.md) |
| **Wrapper Classes** | Autoboxing, unboxing, classes wrapper | [📖 Ver Docs](docs/fundamentos/wrapper/README.md) |
| **Enumeradores** | Enums, métodos, casos de uso | [📖 Ver Docs](docs/fundamentos/enumeradores/README.md) |
| **Assertions** | Debugging com assertions | [📖 Ver Docs](docs/fundamentos/assertivas/README.md) |
| **Conceitos Úteis** | Varargs, método main, dicas gerais | [📖 Ver Docs](docs/fundamentos/conceitos/README.md) |

### 🎯 Orientação a Objetos (OOP)
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Herança** | Extends, super, this, hierarquias | [📖 Ver Docs](docs/oop/heranca/README.md) |
| **Classes Abstratas** | Abstract classes, métodos abstratos | [📖 Ver Docs](docs/oop/classes_abstratas/README.md) |
| **Interfaces** | Contratos, métodos default, múltiplas interfaces | [📖 Ver Docs](docs/oop/interfaces/README.md) |
| **Polimorfismo** | Sobrescrita, sobrecarga, dynamic binding | [📖 Ver Docs](docs/oop/polimorfismo/README.md) |
| **Modificadores** | Static, final, access modifiers | [📖 Ver Docs](docs/oop/modificadores/README.md) |
| **Equals & HashCode** | Implementação correta, contratos | [📖 Ver Docs](docs/oop/equals_hashcode/README.md) |

### 📚 Coleções (Collections)
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Set** | HashSet, TreeSet, LinkedHashSet | [📖 Ver Docs](docs/colecoes/set/README.md) |
| **Map** | HashMap, TreeMap, LinkedHashMap | [📖 Ver Docs](docs/colecoes/map/README.md) |
| **Queue** | Filas, Deque, PriorityQueue | [📖 Ver Docs](docs/colecoes/queue/README.md) |
| **Stack** | Pilhas, LIFO operations | [📖 Ver Docs](docs/colecoes/stack/README.md) |
| **List** | ArrayList, LinkedList, Vector | [📖 Ver Docs](docs/colecoes/list/README.md) |

### ⚡ Concorrência
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Threads** | Criação, ciclo de vida, estados | [📖 Ver Docs](docs/concorrencia/threads/README.md) |
| **Sincronização** | Synchronized, locks, atomic | [📖 Ver Docs](docs/concorrencia/sincronizacao/README.md) |
| **Deadlock** | Prevenção, detecção, resolução | [📖 Ver Docs](docs/concorrencia/deadlock/README.md) |
| **Wait/Notify** | Comunicação entre threads | [📖 Ver Docs](docs/concorrencia/wait_notify/README.md) |

### 💾 Entrada/Saída (I/O)
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **I/O Clássico** | File, FileReader, BufferedReader | [📖 Ver Docs](docs/io/classico/README.md) |
| **NIO** | Path, Files, Channels, selectors | [📖 Ver Docs](docs/io/nio/README.md) |
| **Serialização** | Serializable, transient, versionUID | [📖 Ver Docs](docs/io/serializacao/README.md) |

### 🚀 Java 8+ Features
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Lambdas** | Expressões lambda, functional interfaces | [📖 Ver Docs](docs/java8plus/lambdas/README.md) |
| **Streams** | Stream API, collectors, parallel streams | [📖 Ver Docs](docs/java8plus/streams/README.md) |
| **Optional** | Evitando NullPointerException | [📖 Ver Docs](docs/java8plus/optional/README.md) |
| **Data/Hora** | LocalDate, LocalTime, ZonedDateTime | [📖 Ver Docs](docs/java8plus/data_hora/README.md) |
| **Method Reference** | Referências de método | [📖 Ver Docs](docs/java8plus/method_reference/README.md) |
| **🆕 Java 21** | Records, Sealed Classes, Virtual Threads | [📖 Ver Docs](docs/java8plus/java21/README.md) |

### 🏗️ Estruturas de Dados
| Tópico | Descrição | Documentação |
|--------|-----------|--------------|
| **Lista Ligada** | Implementação própria, algoritmos | [📖 Ver Docs](docs/estruturas/lista_ligada/README.md) |
| **Generics** | Type parameters, wildcards, bounded types | [📖 Ver Docs](docs/estruturas/generics/README.md) |

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
