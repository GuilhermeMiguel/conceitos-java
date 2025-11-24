package br.com.estudos.java8plus.lambdas;

import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Java8_Optional {
	public static void main(String[] args) {
		
		String s = "Teste";
		String s1 = "1";
		
		rodaConsole();
		
		
		/*
		 	Esse é um objeto que pode ou não conter um número inteiro	
		*/
		
		Optional<Integer> numero = converteEmNumero(s1); 
		
		
		/*
		 	===========================
		  		1º Método -- isPresent
		  	===========================
		  	
		  	Verifica se existe valor ou não => retorna true ou false
		  	
		*/
		System.out.println(numero.isPresent()); 		
		
		
		/*
		 
			Método ifPresent => passando como parametro uma expressão lambda
		
			Se existir valor ele executa esse código (a expressao lambda) e imprime o valor
			
		*/
		numero.ifPresent(n -> System.out.println("Número dentro do Optional: " + n)); 
		// |
		//  `---> É um If implicito
		
		
		/*
		 	Método ifPresent => passando como parametro um method reference
		*/
		System.out.println("ifPresent com Method Reference");
		numero.ifPresent(System.out::println);
		
		
		
		
		
		/*
		  	===========================
		  		2º Método get
		  	===========================
		  	
		  	Pega o valor do optional 
		*/
		
		System.out.println("Método get: " + numero.get()); 
		
		
		
		
		
		/*
	  		===========================
	  			3º Método orElse
	  		===========================
	  	
	  		Se ele não consegue pegar o valor do número, substitui por um valor default
		*/
		
		
		
		Integer num = converteEmNumero(s).orElse(2); 
		//padrão que no caso é o 2 -- valor default
		
		System.out.println("Número retornado no Método OrElse: " + num);
		
		
		
		
		
		
		/*
  			===========================
  				3º Método orElseGet
  			===========================
  	
  				Nesse caso ele retorna igual a operação anterior, porém 
			se a minha condição de existir um número na string for atendida, dessa forma eu tenho um ganho muito grande de performance
			
		 */
		
		
		Integer num2 = converteEmNumero(s)
				.orElseGet(() -> {return operacaoPesada();}); 
		
		System.out.println(num2);
		
		
		
		
		//orElseThrow
		Integer num3 = converteEmNumero(s)
				.orElseThrow(()-> new NullPointerException("Valor Vazio.")); 
		//Esse código lança um exceção se o optional estiver vazio, como parâmetro posso passar  uma
		//lambda Exression para ele fazer um condicional e ser mais rapido
		
		System.out.println(num3);
		
		
		
		//Utilizando stream
		Stream.of(1, 2, 3)
				.findFirst() //Retorma um optional -- retorna o primeiro da lista
//				.ifPresent(n -> System.out.println(n) );
				.ifPresent(System.out::println);
	}
	
	private static void rodaConsole() {
		LocalDate teste = LocalDate.now().plusDays(40);
		System.out.println(teste);
	}
	
	
	//Metodo criado de exemplo só para nao gerar erro na classe
	private static Integer operacaoPesada() {
		return null;
	}
	
	

	public static Optional<Integer> converteEmNumero(String numeroStr) {
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.of(integer);
			
		} catch (Exception e) {
			return Optional.empty();
		}
		
				
	}
	
	//NÃO UTILIZAR OPTIONAL PARA RECEBER COMO ARGUMENTO, SE FOR NECESSÁRIO VAZIO, EU FAÇO UMA SOBRECARGA DE MÉTODO
//QUE NÃO RECEBE PARAMETROS
	
	//Optional com tipo primitivo
	public static OptionalInt converteEmNumeroInt(String numeroStr) {
		try {
			int integer = Integer.parseInt(numeroStr);
			return OptionalInt.of(integer);
			
		} catch (Exception e) {
			return OptionalInt.empty();
		}
	}
	
	//Sobrecarga de método
	public static OptionalInt converteEmNumeroInt() {
		return null;
	}
	
}


