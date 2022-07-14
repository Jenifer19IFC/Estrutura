package arvores;

public class ArvoreBinaria {
	
	
	private class Nodo{
		
		private int dado;
		private Nodo esq,dir;
		
		public Nodo(int dado) {
			this.dado = dado;
			dir = esq = null;
		}
	}
	
	Nodo raiz;
	public ArvoreBinaria(){
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
	
	}
