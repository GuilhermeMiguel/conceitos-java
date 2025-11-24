# Conceitos Java - Projeto de Estudos

Este projeto contém exemplos práticos e estudos sobre diversos conceitos da linguagem Java, atualizado para **Java 21 LTS**.

## 🚀 Melhorias Implementadas

1. ✅ **Atualização para Java 21 LTS** (de Java 11)
2. ✅ **Reorganização completa de packages** seguindo convenções Java
3. ✅ **Atualização de dependências** (JUnit 5.10.1, Maven 3.11.0)
4. ✅ **Estrutura mais clara e organizada** por domínios
5. ✅ **Suporte a preview features** do Java 21
6. ✅ **Exemplos das novas features** (Records, Sealed Classes, Virtual Threads)

## 📁 Nova Estrutura do Projeto

### 🔧 br.com.estudos.fundamentos
- **string**: Manipulação de strings, performance (StringBuilder, StringBuffer)
- **wrapper**: Classes wrapper e autoboxing/unboxing
- **enumeradores**: Uso de enums e suas funcionalidades
- **assertivas**: Uso de assertions para debugging
- **conceitos**: Varargs, método main, conceitos úteis

### 🎯 br.com.estudos.oop (Orientação a Objetos)
- **heranca**: Conceitos de herança, super, this
- **classes_abstratas**: Implementação de classes abstratas
- **interfaces**: Uso de interfaces e métodos default
- **polimorfismo**: Exemplos práticos de polimorfismo
- **modificadores**: Static, final, access modifiers
- **equals_hashcode**: Implementação correta de equals() e hashCode()

### 📚 br.com.estudos.colecoes
- **set**: HashSet, TreeSet, LinkedHashSet
- **map**: HashMap, TreeMap, LinkedHashMap
- **queue**: Implementações de fila (Queue, Deque)
- **stack**: Implementações de pilha
- **list**: ArrayList, LinkedList (a ser migrado)

### ⚡ br.com.estudos.concorrencia
- **threads**: Criação e gerenciamento de threads
- **sincronizacao**: Synchronized, locks, atomic
- **deadlock**: Prevenção e detecção de deadlocks
- **wait_notify**: Comunicação entre threads

### 💾 br.com.estudos.io
- **classico**: File, FileReader, FileWriter, BufferedReader
- **nio**: New I/O API (Path, Files, Channels)
- **serializacao**: Serialização de objetos

### 🆕 br.com.estudos.java8plus
- **lambdas**: Expressões lambda, functional interfaces
- **streams**: Stream API, collectors, parallel streams
- **optional**: Uso do Optional para evitar NullPointerException
- **data_hora**: Nova API de data e hora (LocalDate, LocalTime)
- **method_reference**: Referências de método
- **java21**: **NOVO!** Records, Sealed Classes, Virtual Threads, Pattern Matching

### 🏗️ br.com.estudos.estruturas
- **lista_ligada**: Implementação própria de lista ligada
- **generics**: Uso de generics, wildcards, bounded types

## 🔧 Versão e Configuração

- **Java**: 21 LTS (OpenJDK Corretto)
- **Maven**: 3.11.0
- **JUnit**: 5.10.1
- **Preview Features**: Habilitado para Java 21

## 🚀 Como Executar

### Compilação
```bash
# Compilar todo o projeto
mvn clean compile

# Compilar arquivo específico
javac --enable-preview --release 21 src/main/java/br/com/estudos/fundamentos/string/StringTeste.java
```

### Execução
```bash
# Executar exemplo básico
java -cp src/main/java br.com.estudos.fundamentos.string.StringTeste

# Executar exemplo Java 21 (com preview features)
java --enable-preview -cp src/main/java br.com.estudos.java8plus.java21.Java21Features
```

### Executar com Maven
```bash
mvn exec:java -Dexec.mainClass="br.com.estudos.fundamentos.string.StringTeste"
```

## 🆕 Novas Features Java 21

O projeto agora inclui exemplos das principais features do Java 21:

- **Records**: Classes de dados imutáveis
- **Sealed Classes**: Controle de hierarquia de classes
- **Pattern Matching**: Switch expressions melhoradas
- **Virtual Threads**: Threads leves para alta concorrência
- **Text Blocks**: Strings multilinha

## 📋 Scripts Utilitários

- `migrate.sh`: Script usado para migrar arquivos (já executado)
- `cleanup.sh`: Remove estrutura antiga após confirmação da migração

## 🧪 Testes

```bash
# Executar testes
mvn test

# Executar testes com preview features
mvn test -Dargline="--enable-preview"
```

## 📖 Exemplos de Uso

### String Performance
```java
// Localização: br.com.estudos.fundamentos.string
java -cp src/main/java br.com.estudos.fundamentos.string.StringPerformanceTeste
```

### Java 21 Features
```java
// Localização: br.com.estudos.java8plus.java21
java --enable-preview -cp src/main/java br.com.estudos.java8plus.java21.Java21Features
```

### Threads e Concorrência
```java
// Localização: br.com.estudos.concorrencia.threads
java -cp src/main/java br.com.estudos.concorrencia.threads.ThreadTeste
```

## 🎯 Próximos Passos

- [ ] Adicionar mais exemplos de Virtual Threads
- [ ] Implementar testes unitários para todos os módulos
- [ ] Adicionar exemplos de Project Loom
- [ ] Documentar padrões de design implementados

---

**Nota**: Este projeto foi completamente reorganizado e atualizado para Java 21. A estrutura antiga foi migrada para seguir as melhores práticas de organização de packages Java.
