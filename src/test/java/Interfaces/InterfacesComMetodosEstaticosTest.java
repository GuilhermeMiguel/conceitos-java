package Interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class InterfacesComMetodosEstaticosTest {

	
	@Test
	@DisplayName("Testando Interface Function") 
	public void testeInterfaceFunction() {
		List<Integer> lista = Arrays.asList(1, 2, 5, 8, 9);
		Collections.shuffle(lista);
			//Quando deveriamos utilizar classes estaticas com construtor privado
		//para nao precisarmos instanciar
		
		System.out.println(lista);
		
		var velocidade = Corredor.calcularVelocidade(40.0, 1500.0);
		
		System.out.println("Velocidade: " + velocidade);
	}
	
	//No java 8 eu tenho metodos estaticos dentro de interfaces, antes disso não
	interface Corredor {
		//os metodos sempre sao publicos 
		static double calcularVelocidade(double tempo, double distancia) {
			return distancia/tempo;
		}
		
		//Metodos sem implementação são abstratos
		void correr();
		
		}
	}
