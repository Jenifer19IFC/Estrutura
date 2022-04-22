package trabalho1;

public class Fila {
	
	private Nodo inicio = null; 
	private Nodo fim = null;  
	private int limite = 10;
	private int tamanho = 0;
	
	public Fila () {
		
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public boolean temEspaco() {  
		return limite > tamanho;
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public void inserir (int dado) {
		if (temEspaco()) {
			Nodo novoItem = new Nodo(dado);
			System.out.println(" Você entrou na fila\n");
			if (estaVazio()) {
				inicio = novoItem;
				fim = novoItem;
			} else {
				fim.setProx(novoItem);
				fim = novoItem;
			}
			tamanho++;
		} else System.out.println("Fila cheia!");
	}
	
	public void remover(){
		if (tamanho > 0) {
			System.out.println(" Você saiu da fila\n");
			if (getTamanho() == 1) {
				inicio = null;
				fim = null;
			} else inicio = inicio.getProx(); 
					tamanho--; 
		} else System.out.println("Fila vazia");  
	}
	
	public int getInicio() {
		if (!estaVazio()) return inicio.getDado(); 
		else {
			System.out.println("Fila está vazia");
			return -1;
		}
	}
	
	//Adiciona cliente na fila e retorna o tamanho da fila de chegada
	public int filaDeChegada(Fila filaChegada, int codPessoa) {
		
		if(codPessoa == 0) {
			tamanho = 0;
		}
		if(filaChegada.tamanho < limite && codPessoa != 0) {
			filaChegada.inserir(codPessoa);
		}
		else if (filaChegada.tamanho >= limite && codPessoa != 0) {
			System.out.println(" O limite de pessoas na fila de entrada foi atingido!\n");
		}
		
		return tamanho;
	}
	
	//Adiciona cliente na fila e retorna o tamanho da fila do caixa
	public int filaDoCaixa(Fila filaCaixa, int codPessoa) {
		
		if(codPessoa == 0) {
			tamanho = 0;
		}
		if(filaCaixa.tamanho < limite && codPessoa != 0) {
			filaCaixa.inserir(codPessoa);
		}
		
		
		return tamanho;
	}
	
	/*public int pessoasPraAlmoca () {
		return tamanho;
	}*/
	
}