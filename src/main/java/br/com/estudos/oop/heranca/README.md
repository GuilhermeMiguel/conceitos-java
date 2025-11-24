# 🧬 Herança em Java

## Conceitos Fundamentais

### O que é Herança?
Herança permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse).

### Palavras-chave
- `extends`: Estabelece relação de herança
- `super`: Referencia a superclasse
- `this`: Referencia a instância atual

## Tipos de Herança

### Herança Simples
```java
// Superclasse
public class Pessoa {
    protected String nome;
    protected int idade;
    
    public void apresentar() {
        System.out.println("Olá, eu sou " + nome);
    }
}

// Subclasse
public class Funcionario extends Pessoa {
    private double salario;
    
    @Override
    public void apresentar() {
        super.apresentar(); // Chama método da superclasse
        System.out.println("Trabalho aqui!");
    }
}
```

### Herança Múltipla (via Interfaces)
```java
interface Consultar1 {
    void consultar1();
}

interface Consultar2 {
    void consultar2();
}

// Java não permite herança múltipla de classes,
// mas permite implementar múltiplas interfaces
public class MinhaClasse implements Consultar1, Consultar2 {
    @Override
    public void consultar1() { /* implementação */ }
    
    @Override
    public void consultar2() { /* implementação */ }
}
```

## Modificadores de Acesso

| Modificador | Classe | Package | Subclasse | Global |
|-------------|--------|---------|-----------|--------|
| `private`   | ✅     | ❌      | ❌        | ❌     |
| `default`   | ✅     | ✅      | ❌        | ❌     |
| `protected` | ✅     | ✅      | ✅        | ❌     |
| `public`    | ✅     | ✅      | ✅        | ✅     |

## Arquivos de Exemplo

- [`Pessoa.java`](Pessoa.java) - Classe base
- [`Funcionario.java`](Funcionario.java) - Herança simples
- [`HerancaMultipla.java`](HerancaMultipla.java) - Interfaces múltiplas
- [`HerancaTeste.java`](HerancaTeste.java) - Testes práticos

## 💡 Boas Práticas

1. Use `@Override` sempre que sobrescrever métodos
2. Prefira composição à herança quando possível
3. Mantenha hierarquias simples e lógicas
4. Use `protected` para permitir acesso às subclasses
