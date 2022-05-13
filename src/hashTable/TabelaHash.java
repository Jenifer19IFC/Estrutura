package hashTable;

public class TabelaHash {
	
	private int tam_array;
	private String[] array;
	
	//CONSTRUTOR 
	public TabelaHash(int tam_array) { //Tamanho do array (tabela hash)
		this.tam_array = tam_array;
		array = new String[tam_array];
	}

	//GERAR ÍNDICE DO VETOR DA CHAVE
	private int hash(String chave) { //Chave como parâmetro
		byte bytesChave[] = chave.getBytes(); //Pegar valor da tble Unicode e gera um vetor de acordo com a tabela
		int hashCode = 0;
		
		for(int i = 0; i < bytesChave.length; i++) { //Soma os valores Unicode
			hashCode+=bytesChave[i]; //Soma os valores Unicode
		}
		return hashCode % tam_array; //Total Unicode módulo do tamanho do array
	}
	
	public void inserir(String chave, String valor) {
		int indiceArray = hash(chave); //Pega o ínidice daquela chave
		array[indiceArray] = valor; // Array na posição x, gera o valor 
	}
	
	
	public String recuperar(String chave) {
		int indiceArray = hash(chave); //Joga na função hash pra retornar índice
		return array[indiceArray]; //Chega no valor pelo índice
	}
}
