package ListaLigada_DuplamenteLigada;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;
	
//	public void adicionaNoComeco(Object elemento) {
//		
//		Celula nova = new Celula(elemento, primeira);
//		this.primeira = nova;
//		
//		if(this.totalDeElementos == 0) {
//			this.ultima = this.primeira;
//		}
//		
//		this.totalDeElementos ++;
//	}
	
	public void adicionaNoComeco(Object elemento) {
		
		if(this.totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		}
		else {
			Celula nova = new Celula(elemento, this.primeira);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		
		this.totalDeElementos ++;
	}
	
//	//Adiciona no ultimo elemento
//	public void adicionaNoFim(Object elemento) {
//		if(this.totalDeElementos == 0) {
//			adicionaNoComeco(elemento);
//		}
//		else {
//			//O proximo elemento da nova lista é nullo pois ele é o ultimo 
//			Celula nova = new Celula(elemento, null); 
//			this.ultima.setProximo(nova);
//			this.ultima = nova;
//			this.totalDeElementos++;			
//		}
//	}
	
	//Adiciona no ultimo elemento
	public void adicionaNoFim(Object elemento) {
		if(this.totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		}
		else {
			//O proximo elemento da nova lista é nullo pois ele é o ultimo 
			Celula nova = new Celula(elemento); 
			this.ultima.setProximo(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;			
		}
	}
		
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula (int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao inexistente");
		}
		
		Celula atual = primeira;
		
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		
		return atual;
	}
	
//	public void adicionaNoMeio(int posicao, Object elemento) {
//		if(posicao == 0) {
//			adicionaNoComeco(elemento);
//		}
//		else if(posicao == this.totalDeElementos) {
//			adicionaNoFim(elemento);
//		}
//		else {
//			Celula anterior = this.pegaCelula(posicao - 1);
//			Celula nova = new Celula(elemento, anterior.getProximo());
//			anterior.setProximo(nova);
//			this.totalDeElementos++;
//		}
//	}
	
	
	public void adicionaNoMeio(int posicao, Object elemento) {
		if(posicao == 0) {
			adicionaNoComeco(elemento);
		}
		else if(posicao == this.totalDeElementos) {
			adicionaNoFim(elemento);
		}
		else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProximo();
			
			Celula nova = new Celula(elemento, anterior.getProximo());
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}
	}
	
	public boolean contem(Object elemento) {
	    Celula atual = this.primeira;

	    while(atual != null) {
	        if(atual.getElemento().equals(elemento)) {
	            return true;
	        }
	        atual = atual.getProximo();
	    }
	    return false;
	}
	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	
	public void removeDoComeco() {
		if(this.totalDeElementos == 0) return;
		
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
		
	}
	
	public void RemoveDoFim() {
		if(this.totalDeElementos == 1) {
			this.removeDoComeco();
		}
		else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}
	
	
	public void RemoveDoMeio(int posicao) {
		if(posicao == 0) {
			this.removeDoComeco();
		}
		else if (posicao == this.totalDeElementos -1){
			this.RemoveDoFim();
		}
		else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			
			this.totalDeElementos--;
		}
	}
	
	@Override
	public String toString() {
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		Celula atual = primeira;
		
		StringBuilder builder = new StringBuilder("[");
		
		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			
			builder.append(",");
			atual = atual.getProximo();
		}
			builder.append("]");
			return builder.toString();
	}
}
