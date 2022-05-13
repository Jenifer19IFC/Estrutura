package hashTable;

public class ListaEncadeada {

		private Nodo inicio;

		
		public ListaEncadeada(String chave, String valor) {
			inicio = new Nodo(chave, valor); //THIS caso tenha outra vari�vel dado dentro desta classe
		}
		
		public Nodo getInicio() {
			return inicio;
		}
		
		public void deleteComValor(String chave) {
			if(inicio == null) //Nada para deletar, ent�o j� retorna
				return; 
			if(inicio.getChave() == chave) { //Tiro incio do prox e mando atual -- A��O DE DELETAR --
				inicio = inicio.getProx(); //Inicio � o pr�ximo -- A��O DE TROCAR O IN�CIO --
				return;
			}
			Nodo aux = inicio; //�Posicionando no inicio
			while(aux.getProx() != null) {
				if(aux.getProx().getChave() == chave) {
					aux.setProx(aux.getProx().getProx()); //Desfazendo a liga��o com om que t� no meio e setando o prox
					return;
				}
				aux = aux.getProx(); //Pegando o pr�ximo
				
			}//while
			
		}//M�todo deleteComValor
		
		public void inserirFinal(String chave, String valor) {
			Nodo novoNodo = new Nodo(chave, valor);
			Nodo aux = inicio;
			
			while(aux.getProx() != null){
				aux = aux.getProx(); //Aux verifica se tem null ou n�o
			}
			aux.setProx(novoNodo);// Quando o Prox for NULL ---> Adiciona elemento no final
			//Campo de modifica��o
		}
}
