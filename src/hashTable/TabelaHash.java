package hashTable;

public class TabelaHash {
	
	private int tam_array;
	private String[] array;
	
	//CONSTRUTOR 
	public TabelaHash(int tam_array) { //Tamanho do array (tabela hash)
		this.tam_array = tam_array;
		array = new String[tam_array];
	}

	//GERAR �NDICE DO VETOR DA CHAVE
	private int hash(String chave) { //Chave como par�metro
		byte bytesChave[] = chave.getBytes(); //Pegar valor da tble Unicode e gera um vetor de acordo com a tabela
		int hashCode = 0;
		
		for(int i = 0; i < bytesChave.length; i++) { //Soma os valores Unicode
			hashCode+=bytesChave[i]; //Soma os valores Unicode
		}
		return hashCode % tam_array; //Total Unicode m�dulo do tamanho do array
	}
	
	public void inserir(String chave, String valor) {
		int indiceArray = hash(chave); //Pega o �nidice daquela chave
		array[indiceArray] = valor; // Array na posi��o x, gera o valor 
	}
	
	
	public String recuperar(String chave) {
		int indiceArray = hash(chave); //Joga na fun��o hash pra retornar �ndice
		return array[indiceArray]; //Chega no valor pelo �ndice
	}
}
