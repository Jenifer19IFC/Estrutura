package arvores;

import org.w3c.dom.Node;

public class MainExer {

	public static void main(String[] args) {
		
		ArvoreBExer arv = new ArvoreBExer();
		
		arv.inserir(2);
		arv.inserir(4);
		arv.inserir(1);
		arv.inserir(6);
		arv.inserir(3);
		arv.inserir(7);
		arv.inserir(10);
		arv.inserir(11);
		
		arv.mostrarEmOrdem();
		
		//arv.remover(10);
		//arv.remover(1);
		
		//System.out.println("Árvore após remoções:");
		//arv.mostrarEmOrdem();
		
		System.out.println(" ");
		arv.mostrarMaiorMenor();
		
		System.out.println("\nNós folhas: ");
		arv.mostrarFolhas();
		System.out.println(" ");
		
		arv.mostrarAnc(4);
		
		System.out.println("\nDescendentes:");
		arv.mostrarDes(3);
		
		System.out.println("\nMostrar subárvore da direrita de um nó: ");
		arv.mostrarSubarvoreDireita(10);
	
		System.out.println("\nMostrar subárvore da esquerda de um nó: ");
		arv.mostrarSubarvoreEsquerda(7);
			
		System.out.println("\nQuantidade de elementos: ");
		arv.quantidadeDeElementos();
		
		System.out.println("\nTransformar em uma Lista Encadeada: ");
		ListaEncadeada lista = new ListaEncadeada(0);
		
		lista = arv.mostrarListaEncadeda();
		System.out.println(lista.mostraLista());
	
		System.out.println("\nMostar somente números pares: ");
		ListaEncadeada listaPares = new ListaEncadeada(0);
		
		listaPares = arv.mostrarPares();
		System.out.println(listaPares.mostraLista());
	}

}

