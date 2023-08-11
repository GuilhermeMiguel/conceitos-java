package void_return;

import java.util.Arrays;
import java.util.List;

public class VoidAndReturn {

	public static void main(String[] args) {
		
		
		List<String> carros = Arrays.asList("Gol", "Polo", "Onix", "Prisma");
		
		
		metodoVoid(carros);
		//mesmo com o metodo void o valor alterado pois se trata da mesma instância do objeto

		System.out.println("Mudou para Uno? " + carros.get(1).equals("Uno"));
		System.out.println(carros);
		
		
		
		metodoVoidParametroComNomeDiferente(carros);
		//O nome do parâmetro não tem relação nenhuma, só a instância mesmo
		
		System.out.println("\nMudou para Fusca? " + carros.get(2).equals("Fusca"));
		System.out.println(carros);
		
		
		
		//mesmo com return ele modifica, pois a inda é modifica a instancia
		metodoComReturn(carros, "Argo");
		
		System.out.println("\nMudou para Argo? " + carros.get(3).equals("Argo"));
		System.out.println(carros);

		
		
		
		List<String> metodoComReturn = metodoComReturn(carros, "Maverick");
		
		System.out.println("\nMudou para Maverick? " + carros.get(3).equals("Maverick"));
		System.out.println(metodoComReturn);
	
		
		
		chamaMetodoComReturn(carros, "Meriva");
				
		System.out.println("\nMudou para Meriva? " + carros.get(3).equals("Meriva"));
		System.out.println(carros);
		
	}
	
	private static void chamaMetodoComReturn(List<String> carros, String nome) {
		metodoComReturn(carros, nome);
	}
	

	//mesmo com o metodo void o valor alterado pois se trata da mesma instância do objeto
	private static void metodoVoid(List<String> carros) {
		carros.set(1, "Uno");
	}

	//O nome do parâmetro não tem relação nenhuma, só a instância mesmo
	private static void metodoVoidParametroComNomeDiferente(List<String> carros2) {
		carros2.set(2, "Fusca");
	}
	
	
	private static List<String> metodoComReturn(List<String> carrosDiferente, String nome){
		carrosDiferente.set(3, nome);
		
		return carrosDiferente;
	}
}
