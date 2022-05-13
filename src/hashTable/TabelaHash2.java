package hashTable;

public class TabelaHash2 {

	private int tam_array;
	private Nodo[]array;
	
	public TabelaHash2(int tam_array) {
		this.tam_array = tam_array;
		array = new Nodo[tam_array];
	}
	
	private int hash(String chave) {
		byte bytesChaves[] = chave.getBytes(); //Unicode
		int hashCode = 0;
		
		for(int i : bytesChaves) {
			hashCode+=i; //Soma valores do Unicode
		}
		return hashCode % tam_array; //Gera �ndice do vetor
	}
	
	private int hash(String chave, int numeroColisoes) {
		byte bytesChaves[] = chave.getBytes(); //Unicode
		int hashCode = 0;
		
		for(int i : bytesChaves) {
			hashCode+=i; //Soma valores do Unicode
		}
		return (hashCode+numeroColisoes)%tam_array; //Procurando posi��es que n�o est�o ocupadas
	//Mais uma vari�vel para dar um n�mero diferente
	}
	
	
	public void inserir(String chave, String valor) {
		int indiceArray = hash(chave); //Gera �ndice
		
		if(array[indiceArray] == null) { //Se pos�a� for nulo
			array[indiceArray] = new Nodo(chave, valor); //Armazena a chave ali
			return;
		}
		if(array[indiceArray].getChave() == chave) { //Se j� tem um outro valor (Chaves iguais e valores diferentes)
			array[indiceArray].setValor(valor); //Atualiza o valor da chave
			return;
		}
		//COLIS�O
		
		int numeroColisoes = 1;
		int novoIndice = 0;
			
		while(array[indiceArray].getChave() != chave) {
			novoIndice = hash(chave, numeroColisoes);
			
			if(array[novoIndice] == null) { //Se pos�a� for nulo
				array[novoIndice] = new Nodo(chave, valor); //Armazena a chave ali
				return;
			}
			if(array[novoIndice].getChave() == chave) { //Se j� tem um outro valor (Chaves iguais e valores diferentes)
				array[novoIndice].setValor(valor); //Atualiza o valor da chave
				return;
			}
			numeroColisoes+=1;
			indiceArray = novoIndice;
		}
		
	}
	
	public String recuperar (String chave) {
		int indiceArray = hash(chave);
		
		if(array[indiceArray] == null) { //Se n�o tiver valor
			System.out.println("Chave n�o est� na tabela");
			return "";
		}
		if(array[indiceArray].getChave() == chave) { //Se chave for a mesma
			return array[indiceArray].getValor();
		}
		int numeroColisoes = 1;
		
		while(array[indiceArray].getChave() != chave) {
			int novoIndice = hash(chave, numeroColisoes);
			
			if(array[novoIndice] == null) { //Se n�o tiver valor
				System.out.println("Chave n�o est� na tabela");
				return "";
			}
			if(array[novoIndice].getChave() == chave) { //Se chave for a mesma
				return array[novoIndice].getValor();
			}
			numeroColisoes+=1;
			indiceArray = novoIndice;
		}
		return "";
	}

}

