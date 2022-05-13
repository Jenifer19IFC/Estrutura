package hashTable;

public class TabelaHash3 {
	private int tam_array;
	private ListaEncadeada[]array; 
	
	public TabelaHash3(int tam_array) {
		this.tam_array = tam_array;
		array = new ListaEncadeada[tam_array]; //Cada posição do Array é uma lista encadeada
	}
	
	private int hash(String chave) {
		byte bytesChaves[] = chave.getBytes(); //Unicode
		int hashCode = 0;
		
		for(int i : bytesChaves) {
			hashCode+=i; //Soma valores do Unicode
		}
		return hashCode % tam_array; //Gera índice do vetor
	}
	
	public void inserir(String chave, String valor) {
		int indiceArray = hash(chave); //Gera índice
		
		if(array[indiceArray] == null) { //Se posicao for nulo
			array[indiceArray] = new ListaEncadeada(chave, valor); //Armazena a chave ali
			return;
		}
		
		Nodo aux = array[indiceArray].getInicio(); //Recebe início da lista na posição
		
		//Agora se a chave já está lá - Valores diferentes, atualizo o valor
		while (aux != null) {
			if (aux.getChave() == chave) {
				aux.setValor(valor); //Atualiza novo valor 
				return;
			}
			aux = aux.getProx();
		}
		array[indiceArray].inserirFinal(chave, valor);
			
	}
	
	//recuperar
	public String recuperar (String chave) {
		int indiceArray = hash(chave); // retorna o indice
		
		if(array[indiceArray] == null) {
			System.out.println("Chave não está na tabela!");
			return"";
		}
			
			
		Nodo aux = array[indiceArray].getInicio();
		
		while (aux != null) {
			if (aux.getChave() == chave) {
				return aux.getValor();
			}
			aux = aux.getProx();
		
		}
		System.out.println("Chave não está na tabela.");
		return "";
	}
	
	public void deletarChave(String chave) {
		int indiceArray = hash(chave);
		array[indiceArray].deleteComValor(chave);
	}
	
}