package arvores;

public class Main {

	public static void main(String[] args) {
		
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		arvore.inserir(8);
		arvore.inserir(3);
		arvore.inserir(1);
		arvore.inserir(7);
		arvore.inserir(10);
		arvore.inserir(4);
		
		arvore.mostrarEmOrdem();
		
		arvore.remover(10);
		arvore.remover(1);
		
		System.out.println("Árvore após remoções:");
		arvore.mostrarEmOrdem();
		
		
		
	}

}
