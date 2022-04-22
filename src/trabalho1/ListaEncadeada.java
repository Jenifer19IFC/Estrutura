package trabalho1;


public class ListaEncadeada {
	
	private NodoListaEncadeada inicio;
	int codMesa;
	String situacao;
	double gastos;

	
	
	public ListaEncadeada (int codMesa, String situacao, double gastos) {
		inicio = new NodoListaEncadeada (codMesa, situacao, gastos);
	}
	
	public NodoListaEncadeada getinicio() {
		return inicio;
	}
	
	public void inseririnicio(int codMesa, String situacao, double gastos) {
		NodoListaEncadeada novoNodo = new NodoListaEncadeada (codMesa, situacao, gastos);
        novoNodo.setProx (inicio);
        inicio = novoNodo;
	}
	
	public String mostraLista() {
		String lista = "";
		NodoListaEncadeada aux =  inicio;
		while (aux != null) {
			lista += "Código da mesa: " + aux.getCodMesa () +" -- "; 
			lista += "Situação: " + aux.getSituacao () +" -- "; 
			lista += "Gastos: R$ " + aux.getGastos () +"\n"; 
			aux = aux.getProx();	
		}
		return lista;
	}
	
	//Mostra todas as mesas
	public String mostrarListaMesas() {
		String lista = "";
		NodoListaEncadeada aux =  inicio;
		while (aux != null) {
			
			if(aux.getSituacao().equals("Disponível")) {
				lista += " Código: " + aux.getCodMesa () +"\n";  
			}
		aux = aux.getProx();		
		}
		return lista;
	}
	
	//Mostra apenas as mesas disponíveis 
	public int mesaEstaDisponivel(int numMesa) {
		NodoListaEncadeada aux =  inicio;
		int a = 0;
		while (aux != null) {
			
			if(aux.getCodMesa() == numMesa && aux.getSituacao().equals("Disponível")) {
					a = 1;
			}else if(aux.getCodMesa() == numMesa && aux.getSituacao().equals("Indisponível")){
				a = 0;
			}
		aux = aux.getProx();		 
		}
		return a;
	}
	
	//Calcula a quantidade de mesas disponíveis 
	public int numMesasDisponíveis() {
		String lista = "";
		NodoListaEncadeada aux =  inicio;
		int cont = 0;
		while (aux != null) {
			
			if(aux.getSituacao().equals("Disponível")) {
				  cont++;
			}
		aux = aux.getProx();		
		}
		return cont;
	}
	
	//Eliminar primeiro nodo
	public void deleteComValor (int valor) {
		if (inicio == null) return; 	// Sai fora se for nulo
		if (inicio.getCodMesa() == valor) {
			inicio = inicio.getProx(); 	// Manda o início para o próximo
			return; 
		}
		
	//Eliminar nodo do meio 
	NodoListaEncadeada aux = inicio;
	while (aux.getProx()!= null) {
		if (aux.getProx().getCodMesa() == valor) {
			aux.setProx(aux.getProx().getProx()); //Elimina 
			return;
		}	
			aux = aux.getProx();
		}
	} 
	
	public int contNodos() {
		String lista = "";
		NodoListaEncadeada aux = inicio; 
		int c = 0;
		
		while(aux != null) {
			lista+= aux.getCodMesa()+"\n";
			aux = aux.getProx(); 
			c++;
		}
		return c;
	}
	
	public void inserirFinal(int codMesa) {
		NodoListaEncadeada novoNodo = new NodoListaEncadeada(0, "", 0);
		NodoListaEncadeada aux = inicio;
		
		while(aux.getProx() != null){
			aux = aux.getProx(); 
		}
		aux.setProx(novoNodo);
	}
	
	
	public void deletarPrimeiroNodo(){
		if (inicio == null) return;
		inicio = inicio.getProx(); 	
	}
	
	public void deletarFinal() {
		NodoListaEncadeada aux = inicio;
		
		if(inicio == null) return;
		
		while(aux.getProx() != null) {
			if(aux.getProx().getProx() == null) {
				aux.setProx(null);
				return;
			}
		aux = aux.getProx();
		}
	} 
	
	
	public boolean buscaValor (int valor){
		NodoListaEncadeada aux = inicio;
		int posicao = 0;
			while (aux != null ) {
			posicao++;
				if (aux.getCodMesa() == valor){
				return true;
			}
			aux = aux.getProx();
			}
		return false;
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