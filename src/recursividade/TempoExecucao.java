package recursividade;

public class TempoExecucao {

	public static void main(String[] args) {
		
		int v[] = new int[50000000];
		int np;
		
		//Preenchendo o vetor
		for(int i = 0;i < v.length; i++) {
			v[i] = i;
		}
		np = -1;//Tempo para executar o código todo - Quando chegar em np acaba a execução 
		int totalComparacoes = 0;
		long inicio = System.currentTimeMillis();
		for(int j = 0;j < v.length;j++) {
			totalComparacoes++;
			if(v[j] == np) {
				System.out.println("Número encontrado");
				break;
			}
		}
		long fim = System.currentTimeMillis() - inicio;
		System.out.println("Tempo de execução = " + fim);
		System.out.println("Total comparações = " + totalComparacoes);
	}

}
