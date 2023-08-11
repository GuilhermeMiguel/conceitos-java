package Conceitos_Uteis;

public class MetodoMain {

	public static void main(String[] args) {
		System.out.println("O que há dentro do args do metodo main: ");
		for(String arg : args) 
			System.out.println(arg);
		
		if(args == null || args.length == 0)
			System.out.println("Args está vazio!!!!!!!!!!!!!!!");
	}
}
