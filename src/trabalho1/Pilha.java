package trabalho1;

public class Pilha {
	
	private Nodo topo;
	private int tamanho = 0;
	private int limite = 15;
	
	public Pilha () {  
		
	}
	
	public boolean estaVazio () {     // Nenhum elemento
		return tamanho == 0;
	}
	
	public boolean temEspaco() {      // Verifica o tamanho
		return limite > tamanho;
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void push(int dado) { // Valor que quero inserir
		if(temEspaco()) {
			Nodo novoItem = new Nodo(dado);
			novoItem.setProx(topo);
			topo = novoItem;
			tamanho++;
		}else {
			System.out.println("Pilha cheia");
		}
	}
	
	public void  pop() {           // Deletar no início
		if (!estaVazio()) {
			System.out.println(" Agora, a pilha de pratos está com um prato a menos...\n");
			topo = topo.getProx();  
			tamanho--;
		} else {
			System.out.println("Pilha está vazia");
		}
	}
	
	public int getTopo(){
		return topo.getDado();
	}
	
	//Adiciona  na pilha e retorna tamanho da pilha de pratos 
	public int pilhaDePratos(Pilha pilhaPratos, int codPrato) {
		
		if(codPrato != 0 ){
			pilhaPratos.push(codPrato);
		}
	
		if(tamanho == 0) {
			System.out.println("Não há pratos disponíveis!");
		}
		if(codPrato == 0) {
			tamanho = 0;
		}
	return tamanho;
	}
	
	
	
}