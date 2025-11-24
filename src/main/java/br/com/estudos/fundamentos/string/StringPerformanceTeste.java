package br.com.estudos.fundamentos.string;

public class StringPerformanceTeste {

	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
			concatString(30000);
		long fim = System.currentTimeMillis();
		
			//O sysout sempre chama um toString dentro dele
		//Concatenar string dessa forma leva mais tempo, pois o programa estara criando novas instancias de string
			System.out.println("Tempo gasto String " + (fim - inicio) + " ms");

		inicio = System.currentTimeMillis();
			concatStringBuilder(500000);
		fim = System.currentTimeMillis();
			System.out.println("Tempo gasto StringBuilder " + (fim - inicio) + " ms");

		inicio = System.currentTimeMillis();
			concatStringBuffer(500000);
		fim = System.currentTimeMillis();
			System.out.println("Tempo gasto StringBuffer " + (fim - inicio) + " ms");
	}

	@SuppressWarnings("unused")
	private static void concatString(int tam) {
		//Concatenar string dessa forma leva mais tempo, pois o programa estara criando novas instancias de string
		String string = "";
		for (int i = 0; i < tam; i++) {
			string += i;
		}
	}

	private static void concatStringBuilder(int tam) {
		StringBuilder sb = new StringBuilder(tam);
		for (int i = 0; i < tam; i++) {
			sb.append(i);
		}
	}

	private static void concatStringBuffer(int tam) {
		StringBuffer sb = new StringBuffer(tam);
		for (int i = 0; i < tam; i++) {
			sb.append(i);
		}
	}
}
