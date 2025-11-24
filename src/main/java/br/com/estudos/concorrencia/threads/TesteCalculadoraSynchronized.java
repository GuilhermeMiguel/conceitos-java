package br.com.estudos.concorrencia.threads;

public class TesteCalculadoraSynchronized {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		CalculadoraFacade t1 = new CalculadoraFacade("#1", array);
		CalculadoraFacade t2 = new CalculadoraFacade("#2", array);
		
		//15
	}
}
