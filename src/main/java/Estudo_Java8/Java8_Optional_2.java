package Estudo_Java8;

import java.util.Optional;

public class Java8_Optional_2 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		Optional<String> empty = Optional.of("Hellow");
	
		//Verifica se o optional de string esta preenchido, se estiver retorna true
		System.out.println("Metodo isPresent -------> " + empty.isPresent());
		
		
		
		//==================================================================================================
		
		Optional<String> empty2 = Optional.ofNullable(null);
		
		//orElse -> Se a minha string retornada for nula ele continua com outra 
		String orElse = empty2
				.map(String::toUpperCase) //aplicando um reference method para deixar a string em CAIXA ALTA
				.orElse("World");
		
		System.out.println("Metodo orElse -------> " + orElse);
	
				//Se fosse com validações comuns faria o seguinte
					String hello = null;
					
					if(hello != null) {
						System.out.println(hello.toUpperCase());
					} else {
						System.out.println("World");
					}
					
		
		
		//==================================================================================================
		
		String orElseGet = empty2
				.map(String::toUpperCase)
				.orElseGet(() -> {
					//Faço as validações necessárias
					return "World";
				});
		
		System.out.println("Metodo orElseGet -------> " + orElseGet);
				
		
		
		//==================================================================================================	
		
		try {
			String orElseThrow = empty2
					.map(String::toUpperCase)
					.orElseThrow(IllegalStateException::new);
			
			System.out.println("Metodo orElseThrow -------> " + orElseThrow);	
		} catch (Exception ex) {
			System.out.println(ex+ " capurada");
		}
		
		//==================================================================================================	
		
		//Simplificando
		empty2.ifPresent(x -> System.out.println(x));
		
		empty2.ifPresentOrElse (x -> {
			System.out.println(x);	
		}, () -> {
			System.out.println("world");
		});
		
		
		//Mais simples ainda 
		empty2.ifPresentOrElse(System.out::println, () -> System.out.println("World"));
		
		
		//==================================================================================================
		
		
		//Passando o email ele cai no map e faz o lowerCase
		//Não passando o email ele cai no orElse 
		Pessoa pessoa = new Pessoa("Guilherme", null);
		System.out.println(pessoa.getEmail().map(String::toLowerCase).orElse("Email não informado"));
		
		
		
		
		//========================================================================================================
		
		//Filter
		//ifPresent
		returnOptionalInteger()
				   .filter(num -> num >= 5)
				   .ifPresentOrElse(
						   n -> System.out.println("Número maior ou igual a 5: " + n),
						   () -> System.out.println("Número menor que 5")
				   );
		
		
		
		//flatMap
		/*
		  		Quando eu tenho um optional dentro de um optional, eu devo usar getMap para pegar o valor dele
		  	Senao o resultado seria meio que um Optional<Optional<String>>
		  	
		  	Optional<Optional<String>> email = Pessoa.retornaOptionalPessoa()
				.map(Pessoa::getEmail);
				
				A maneira correta é utilizar o flatmap
			Dessa forma ele criar somente um optional e não 2
		*/
		
	  	Optional<String> email = Pessoa.retornaOptionalPessoa()
				.flatMap(Pessoa::getEmail);
		
		
		
	}
	
	private static Optional<Integer> returnOptionalInteger() {
		return Optional.of(4);
	}
}


class Pessoa {
	private final String name;
	private final String email;
	
	public Pessoa(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	//Volta um Optional
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
	
	public static Optional<Pessoa> retornaOptionalPessoa() {
		var pessoa = new Pessoa("José", "eamilJose");
		return Optional.of(pessoa);
	}
}