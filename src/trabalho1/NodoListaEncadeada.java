package trabalho1;

public class NodoListaEncadeada {
	
	int codMesa;
	String situacao;
	double gastos;
	NodoListaEncadeada prox; 
	
	public NodoListaEncadeada (int codMesa, String situacao, double gastos) {
		this.prox = null;
		setCodMesa(codMesa);
		setSituacao(situacao);
		setGastos(gastos);
	}
	
	public NodoListaEncadeada getProx() {
		return prox;
	}
	
	public void setProx (NodoListaEncadeada prox) {
		this.prox = prox; 
	}

	public int getCodMesa() {
		return codMesa;
	}

	public void setCodMesa(int codMesa) {
		this.codMesa = codMesa;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public double getGastos() {
		return gastos;
	}

	public void setGastos(double gastos) {
		this.gastos = gastos;
	}
	
	
			
}