package trabalho1;

public class Nodo {
	int dado;
	Nodo prox; 
	
	public Nodo (int dado) {
		this.dado = dado;
		this.prox = null;
	}
	
	public int getDado() {
		return dado;
	}
	
	public Nodo getProx() {
		return prox;
	}
	
	public void setProx (Nodo prox) {
		this.prox = prox; 
	}
			
}