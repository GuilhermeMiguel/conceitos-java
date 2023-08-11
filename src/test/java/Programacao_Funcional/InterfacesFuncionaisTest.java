package Programacao_Funcional;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InterfacesFuncionaisTest {

	/*
	  	INTERFACES FUNCIONAIS -> aquelas que só tem um método
	*/

	@Test
	@DisplayName("Testando Interface Suplier")
	public void testeInterfaceSuplier() {
			
		/*
		 	
		 ============ Supplier ============  
		 	Representa uma função que vai entregar algo, ela não recebe nada, porém irá entregar algo
			É um fornecedor, o suplier entrega um valor para um metodo, no caso o generate
			
		*/
		
		System.out.println("\n---Suplier---");
		Stream.generate(() -> new Random().nextInt()) //-> O Generate recebe um suplier
					.limit(5)
					.forEach(System.out::println);
				
				
				
	}
	
	@Test
	@DisplayName("Testando Interface Consumer")
	public void testeInterfaceConsumer() {
		/*
		============ Consumer
		 	 Não retorna nada, porém espera um valor
		 	 O forEach espera um consumer, mas não tem retorno
		*/
		
		
		System.out.println("\n---Consumer---");
		Stream.generate(() -> new Random().nextInt())
					.limit(5)
					.forEach(n -> System.out.println(n)); //-> O forEach espera um consumer
				
	}
	
	@Test
	@DisplayName("Testando Interface BiConsumer")
	public void testeInterfaceBiConsumer() {
				
		//Consumer -- BiConsumer
		System.out.println("BiConsumer -- consumer com dois argumentos");
				
	}
	
	@Test
	@DisplayName("Testando Interface Predicate")
	public void testeInterfacePredicate() {
		//Predicate 
		System.out.println("\n---Predicate---");
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		lista.stream()
			.filter(e -> e % 2 == 0) //O filter recebe um predicate -- Recebe um valor e retorna um booleano
					//Ele faz um tipo de teste
			.forEach(System.out::println);
	
	}
				
	@Test
	@DisplayName("Testando Interface BiPredicate") 
	public void testeInterfaceBiPredicate() {
		//BiPredicate -- Ele recebe dois valores e faz uma comparação dentro desses dois valores dentro 
		//de um expressão lambda e retorna o verdadeiro ou falso
		System.out.println("\n---Predicate -- predicate com dois argumentos---");

	}
	
	
	@Test
	@DisplayName("Testando Interface Function") 
	public void testeInterfaceFunction() {
				
	//Function -- Recebe um valor e retorna um valor
	System.out.println("\n---Function---");
	List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		lista.stream()
		.filter(e -> e % 2 == 0) //O filter recebe um predicate -- Recebe um valor e retorna um booleano
				//Ele faz um tipo de teste
			.map(e -> e * 2) //O map é uma function, ele recebe um valor, processa e retorna outro valor 
		.forEach(System.out::println);
	}
	
	@Test
	@DisplayName("Testando Interface BiFunction") 
	public void testeInterfaceBiFunction() {
		//BiFunction -- Recebe dois valores e retorna um novo valor
		System.out.println("\n---BiFunction -- recebe dois argumentos e retorna um valor---");
	
	}
	
	@Test
	@DisplayName("Testando Interfaces Unary e BinaryOperator") 
	public void testeInterfacesUnaryBiNaryOperator() {
		
		//UnaryOperator e BinaryOperator -- São na verdade Functions
		//Unary o parametro de entrada e a saida devem ser do mesmo tipo
		//O BiFunction os tres argumentos de entrada tem que ter o mesmo tipo, os de saida tbm
		//REDUCE UTILIZA MUITO ISSO
		System.out.println("\n---UnaryOperator e BinaryOperator -- são na verdade functions---");
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		lista.stream()
			.filter(e -> e % 2 == 0) //predicate
			.map(e -> e * 2)  //function
			.reduce((e1, e2) -> e1 + e2) //BinaryOperator
			.ifPresent(System.out::println);
	}
				

}
