package br.com.estudos.oop.interfaces;


public class InterfacesComMetodosDefaultTeste {

	

		public static void main(String[] args) {
			

		}
		
		interface Corredor {
			void correr();
			
			void parar();
			
			default void print() {
				System.out.println("Metodo Default");
			}
		}
		
		static class Pessoa implements Corredor {
			@Override
			public void correr() {
				System.out.println("Piloto correndo.");
			}

			@Override
			public void parar() {
				System.out.println("Parar");
			}
		}
		
		//Default são metodos que se eu coloco numa interface eles
	//são sobreescritos automaticamente
		//Então eu evito de fornecer uma implementação para esses métodos 
	//implementados na interface

	}


