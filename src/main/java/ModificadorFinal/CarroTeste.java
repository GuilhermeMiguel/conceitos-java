package ModificadorFinal;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c = new Carro();
		
		//Para chamar uma varaivael estatica -> Classe.VARIAVEL
	//isso se ela for publica
		@SuppressWarnings("unused")
		double velocidadeLimite = Carro.VELOCIDADE_LIMITE;
		
		c.getComprador().setNome("tota");
		
		System.out.println(c.getComprador());
	}

}
