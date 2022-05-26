package recursividade;

public class TempoExecucao {

	public static void main(String[] args) {
		
		int v[] = new int[50000000];
		int np;
		
		//Preenchendo o vetor
		for(int i = 0;i < v.length; i++) {
			v[i] = i;
		}
		np = -1;//Tempo para executar o c�digo todo - Quando chegar em np acaba a execu��o 
		int totalComparacoes = 0;
		long inicio = System.currentTimeMillis();
		for(int j = 0;j < v.length;j++) {
			totalComparacoes++;
			if(v[j] == np) {
				System.out.println("N�mero encontrado");
				break;
			}
		}
		long fim = System.currentTimeMillis() - inicio;
		System.out.println("Tempo de execu��o = " + fim);
		System.out.println("Total compara��es = " + totalComparacoes);
	}

}
