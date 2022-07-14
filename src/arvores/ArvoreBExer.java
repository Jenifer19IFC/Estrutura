package arvores;
import java.util.LinkedList;
import arvores.ListaEncadeada;
import arvores.Nodo;

public class ArvoreBExer {
	
	
	private class Nodo{
		
		private int dado;
		private Nodo esq,dir;
		
		public Nodo(int dado) {
			this.dado = dado;
			dir = esq = null;
		}

	}
	
	Nodo raiz;
	public ArvoreBExer(){
		raiz = null;
	}
	
	public void inserir(int dado) {
		raiz = inserirDado(raiz, dado);
	}
	
	//A cada passagem uma árvore menor --> Cada chamada uma raíz nova
	private Nodo inserirDado(Nodo raiz, int dado) {
		if(raiz == null) { //colocando o primeiro elemento e outros também, comentado abaixo.
			raiz = new Nodo(dado);
			return raiz;
		}
		//Nível por nível agora
		if(dado < raiz.dado) { 
			raiz.esq = inserirDado(raiz.esq, dado); //Se a raiz.dir.esq for nulll que não tem nada. Ele vai pro if de cima
		}else if(dado > raiz.dado) {
			raiz.dir = inserirDado(raiz.dir, dado);
		}
		return raiz;
	}//FAZ TODO O PROCESSO NOVAMENTE, E SE FOR NULO ADD
	
	
	//---------------------------------- Métodos duplos (em cima e em baixo) ------------------------
	
	
	public void mostrarEmOrdem() {
		mostrandoOrdenado(raiz);
	}
	
	private void mostrandoOrdenado(Nodo raiz) {
		if(raiz != null) {
			mostrandoOrdenado(raiz.esq);
			System.out.println(raiz.dado);
			mostrandoOrdenado(raiz.dir);
			
		}
	}
	
	public void remover(int dado) {
		raiz = removerDado(raiz,dado);
	}
	
	private Nodo removerDado(Nodo raiz, int dado) {
		
		Nodo aux1, aux2;
		if(raiz.dado == dado) {
			if(raiz.esq == null && raiz.dir == null) 
				//O elemento a ser removido não tem filhos
				return null;
			else if(raiz.esq == null) {
				//O elemento a ser removido não tem filho
				//Para esquerda
				return raiz.dir;
			}
			else if(raiz.dir == null) {
				//O elemento a ser removido não tem filho
				//Para direita
				return raiz.esq;
			}
			else {
				//O elemento a ser removido tem filhos
				//Para ambos os lados
				aux1 = raiz.dir;
				aux2= raiz.dir;
				
				while(aux1.esq != null) {
					aux1 = aux1.esq;
				}
				aux1.esq = raiz.esq;
				return aux2;
			}
		}
		else if(raiz.dado < dado)
			raiz.dir = removerDado(raiz.dir, dado);
		else
			raiz.esq = removerDado(raiz.esq, dado);
		
		return raiz;
	
		}
	
	// ---------- Atividades ----------
	
	//Mostrar maior e menor número
	public void mostrarMaiorMenor() {
		
		Nodo aux;
		
		int maior = 0, menor = 0;
		if(raiz ==  null) {
			System.out.println("Não há elementos.");
		}
		else {
			aux = raiz; //Parte da raiz
			while(aux.esq != null) {
				aux = aux.esq;
			}
			menor = aux.dado;
			aux = raiz; //Parte da raiz
			while(aux.dir != null) {
				aux = aux.dir;
			}
			maior = aux.dado;
		}
		
		System.out.println("Maior = " + maior );
		System.out.println("Menor = " + menor );
	}
	
	// Mostrar os nós folhas
	public void mostrarFolhas() {
		raiz = folhas(raiz);
	}
	
	private Nodo folhas(Nodo raiz) {
		
		if(raiz.dir != null) {
			raiz.dir = folhas(raiz.dir);
		}
		if(raiz.esq != null) {
			raiz.esq = folhas(raiz.esq);
		}
		
		if(raiz.dir == null & raiz.esq == null) { 
			System.out.println(raiz.dado);
		}
		
		return raiz;
	
	} 
	
	// Mostrar os nós ancestrais de um nó
	public void mostrarAnc(int dado) {
		raiz = mostrarAncestrais(raiz,dado);
	}
	
	private Nodo mostrarAncestrais(Nodo raiz, int dado) {
		
		if(raiz == null) {
			return raiz;
		}
		if(raiz.dado == dado) {
			System.out.println("Ancestrais: ");
		}
		else if(raiz.dado < dado) {
			raiz.dir = mostrarAncestrais(raiz.dir, dado);
			System.out.println(raiz.dado);
		}else if(raiz.dado > dado) {
			raiz.esq = mostrarAncestrais(raiz.esq, dado);
			System.out.println(raiz.dado);
		}
		
		return raiz;
		
	}
	
	// Mostrar os nós descendentes de um nó
	public void mostrarDes(int dado) {
		raiz = mostrarDescendentes(raiz,dado);
	}
	
	private Nodo mostrarDescendentes(Nodo raiz, int dado) {
	
		if(raiz == null) {
			return raiz;
		}
		if(raiz.dado == dado) {
			mostrandoOrdenado(raiz.dir);
			mostrandoOrdenado(raiz.esq);
		}
	
		else if(raiz.dado < dado)
			raiz.dir = mostrarDescendentes(raiz.dir, dado);
		else
			raiz.esq = mostrarDescendentes(raiz.esq, dado);
		
		return raiz;
		
	}
	
	// Mostrar a subárvore da direita de um nó
	public void mostrarSubarvoreDireita(int dado) {
		raiz = subArvoreDireita(raiz, dado);
	}
	
	private Nodo subArvoreDireita(Nodo raiz, int dado) {
		 
		if(raiz == null) {
			return raiz;
		}
		 if(raiz.dado == dado) {
			mostrandoOrdenado(raiz.dir);
		}
		else if(raiz.dado < dado)
			raiz.dir = subArvoreDireita(raiz.dir, dado);
		else
			raiz.esq = subArvoreDireita(raiz.esq, dado);
		 
		 return raiz;
	 }
	 
	// Mostrar a subárvore da esquerda de um nó
	public void mostrarSubarvoreEsquerda(int dado) {
			raiz = subArvoreEsquerda(raiz, dado);
		}
		
	private Nodo subArvoreEsquerda(Nodo raiz, int dado) {
		
		if(raiz == null) {
			return raiz;
		}
		if(raiz.dado == dado) {
			mostrandoOrdenado(raiz.esq);
		}
		else if(raiz.dado > dado)
			raiz.esq = subArvoreEsquerda(raiz.esq, dado);
		else
			raiz.dir = subArvoreEsquerda(raiz.dir, dado);
		
		return raiz;
	}
	
	// Contar quantos elementos existe na árvore
	public void quantidadeDeElementos() {
		System.out.println(contarNos(raiz));
	}
	
	private int contarNos(Nodo raiz) {
		Nodo aux = raiz;
		if(aux == null)  return 0;
		else 
			return (1 + contarNos(aux.esq) + contarNos(aux.dir));
	 }
	
	// Transformar a árvore numa lista encadeada
	public ListaEncadeada mostrarListaEncadeda() {
		ListaEncadeada lista = new ListaEncadeada(raiz.dado);
		transfEmLista(raiz.esq,lista);
		transfEmLista(raiz.dir, lista);
		
		return lista;
	}
	
	private void transfEmLista(Nodo raiz,ListaEncadeada list) {
		if(raiz == null) {
			return;
		}
		list.inserirFinal(raiz.dado);
		transfEmLista(raiz.esq, list);
		transfEmLista(raiz.dir, list);
	}
	
	// Mostrar somente os números pares
	public ListaEncadeada mostrarPares() {
		ListaEncadeada listaPares = new ListaEncadeada(raiz.dado);
		pares(raiz.esq,listaPares);
		pares(raiz.dir, listaPares);
		
		return listaPares;
	}
	
	private void pares(Nodo raiz,ListaEncadeada list) {
		if(raiz == null) {
			return;
		}
		else if(raiz.dado % 2 == 0) {
			list.inserirFinal(raiz.dado);
		}
		pares(raiz.esq, list);
		pares(raiz.dir, list);
		
		return;
	}
	
}