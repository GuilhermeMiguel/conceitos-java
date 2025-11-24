package br.com.estudos.java8plus.java21;

/**
 * Demonstração das principais features do Java 21
 */
public class Java21Features {

    // Record - Feature do Java 14+
    public record Pessoa(String nome, int idade, String email) {
        // Compact constructor
        public Pessoa {
            if (idade < 0) {
                throw new IllegalArgumentException("Idade não pode ser negativa");
            }
        }
    }

    // Sealed classes - Feature do Java 17+
    public sealed interface Forma permits Circulo, Retangulo, Triangulo {
        double area();
    }

    public record Circulo(double raio) implements Forma {
        @Override
        public double area() {
            return Math.PI * raio * raio;
        }
    }

    public record Retangulo(double largura, double altura) implements Forma {
        @Override
        public double area() {
            return largura * altura;
        }
    }

    public record Triangulo(double base, double altura) implements Forma {
        @Override
        public double area() {
            return (base * altura) / 2;
        }
    }

    public static void main(String[] args) {
        // Text Blocks - Feature do Java 15+
        String json = """
                {
                    "nome": "João",
                    "idade": 30,
                    "email": "joao@email.com"
                }
                """;

        System.out.println("JSON Text Block:");
        System.out.println(json);

        // Records
        var pessoa = new Pessoa("Maria", 25, "maria@email.com");
        System.out.println("Record: " + pessoa);

        // Pattern Matching com instanceof - Java 16+
        Object obj = "Hello World";
        if (obj instanceof String s) {
            System.out.println("String length: " + s.length());
        }

        // Pattern Matching com switch - Java 21 (Preview)
        Forma forma = new Circulo(5.0);
        String resultado = switch (forma) {
            case Circulo c -> "Círculo com área: " + c.area();
            case Retangulo r -> "Retângulo com área: " + r.area();
            case Triangulo t -> "Triângulo com área: " + t.area();
        };
        System.out.println(resultado);

        // Virtual Threads - Java 21
        demonstrarVirtualThreads();
    }

    private static void demonstrarVirtualThreads() {
        System.out.println("\n--- Virtual Threads ---");
        
        // Criando virtual threads
        Thread.ofVirtual().start(() -> {
            System.out.println("Virtual Thread 1: " + Thread.currentThread());
        });

        Thread.ofVirtual().start(() -> {
            System.out.println("Virtual Thread 2: " + Thread.currentThread());
        });

        // Aguardar um pouco para ver os resultados
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
