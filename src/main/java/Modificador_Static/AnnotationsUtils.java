package Modificador_Static;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnotationsUtils {
	
	/*
	 		Um inicializador estático é executado quando a classe é carregada 
	 	e um bom local para colocar a inicialização de variáveis ​​estáticas
	 	
	 	É útil porque campos estáticos podem não ser inicializados apenas com = 
	 	
	 	No caso abaixo ele precisa chamar o método put de alguma forma 
	 	
	 	
	 		Um bloco estático é executado uma vez no ciclo de vida de qualquer programa, 
	 	outra propriedade do bloco estático é que ele é executado antes do método principal.
	*/
	
	public static final Map<Integer, String> diasDaSemana;
	
	public static List<String> meses;
	
    static {
    	diasDaSemana = new HashMap<Integer, String>();
    	diasDaSemana.put(1, "Domingo");
    	diasDaSemana.put(2, "Segunda-Feira");
    	diasDaSemana.put(3, "Terça-Feira");
    	diasDaSemana.put(4, "Quarta-Feira");
    	diasDaSemana.put(5, "Quinta-Feira");
    	diasDaSemana.put(6, "Sexta-Feira");
    	diasDaSemana.put(7, "Sábado");
    }
    
    
  //Criacao de bloco de inicializacao diferente
    {
    	meses = Arrays.asList("Janeiro", "Fevereiro"); 
    }
}


