package hashTable;

public class ListaEncadeada {

		private Nodo inicio;

		
		public ListaEncadeada(String chave, String valor) {
			inicio = new Nodo(chave, valor); //THIS caso tenha outra variável dado dentro desta classe
		}
		
		public Nodo getInicio() {
			return inicio;
		}
		
		public void deleteComValor(String chave) {
			if(inicio == null) //Nada para deletar, então já retorna
				return; 
			if(inicio.getChave() == chave) { //Tiro incio do prox e mando atual -- AÇÃO DE DELETAR --
				inicio = inicio.getProx(); //Inicio é o próximo -- AÇÃO DE TROCAR O INÍCIO --
				return;
			}
			Nodo aux = inicio; //´Posicionando no inicio
			while(aux.getProx() != null) {
				if(aux.getProx().getChave() == chave) {
					aux.setProx(aux.getProx().getProx()); //Desfazendo a ligação com om que tá no meio e setando o prox
					return;
				}
				aux = aux.getProx(); //Pegando o próximo
				
			}//while
			
		}//Método deleteComValor
		
		public void inserirFinal(String chave, String valor) {
			Nodo novoNodo = new Nodo(chave, valor);
			Nodo aux = inicio;
			
			while(aux.getProx() != null){
				aux = aux.getProx(); //Aux verifica se tem null ou não
			}
			aux.setProx(novoNodo);// Quando o Prox for NULL ---> Adiciona elemento no final
			//Campo de modificação
		}
}
