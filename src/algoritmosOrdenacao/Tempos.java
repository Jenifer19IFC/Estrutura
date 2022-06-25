package algoritmosOrdenacao;

public class Tempos {

	
	public void bubbleSort(int v[]) {
		
		long inicio = System.currentTimeMillis();
		long comparacoes = 0;
		long trocas = 0;
		
		int temp = 0;
		for(int i = 0; i <v.length; i++) {
			for(int j = 0; j <v.length-1;j++) { 
				comparacoes++; //<-- COMPARA��ES
				if(v[j] > v[j+1]) {
					temp = v[j];
					v[j] = v[j+1];
					v[j+1] = temp;
					trocas++; //<-- TROCAS
				}
			}
		}
		
		long fim = System.currentTimeMillis() - inicio;
		System.out.println("Tempo de execu��o = " + fim);
		System.out.println("Total compara��es = " + comparacoes);
		System.out.println("Trocas = " + trocas);
	}
	
	public void insertionSort(int v[]) {
		
		long inicio = System.currentTimeMillis();
		long comparacoes = 0;
		long trocas = 0;
		
		int pivo,j;
		for (int i = 0; i < v.length; i++) { 
			pivo = v[i]; 
			j = i-1;
			comparacoes++; //<-- COMPARA��ES
			while(j >= 0 && v[j] > pivo) {
				comparacoes++; //<-- COMPARA��ES
				v[j+1] = v[j];
				j = j-1;
				trocas++; //<-- TROCAS
			}
			v[j+1] = pivo;
			trocas++; //<-- TROCAS
			
		}
		long fim = System.currentTimeMillis() - inicio;
		System.out.println("Tempo de execu��o = " + fim);
		System.out.println("Total compara��es = " + comparacoes);
		System.out.println("Trocas = " + trocas);
	}
	
	public void selectionSort(int v[]) {
		long inicio = System.currentTimeMillis();
		long comparacoes = 0;
		long trocas = 0;

		int min,temp;
		for (int i = 0; i < v.length-1; i++) {
			min = i; 
			for (int j = i+1; j < v.length; j++) {
				comparacoes++; //<-- COMPARA��ES
				if(v[j] < v[min]) {
					min = j;	
				}
			}
			temp = v[i];
			v[i] = v[min];
			v[min] = temp;
			trocas++; //<-- TROCAS
		}
		long fim = System.currentTimeMillis() - inicio;
		System.out.println("Tempo de execu��o = " + fim);
		System.out.println("Total compara��es = " + comparacoes);
		System.out.println("Trocas = " + trocas);
	}
	
	long comparacoesA = 0;
	long trocasA = 0;
	long fMerge;
	
	private void merge(int v[],int inicio,int meio, int fim){
		long inMerge = System.currentTimeMillis();
		
		int aux[] = new int[v.length];
		for (int i = inicio; i <=meio; i++) {
			aux[i] = v[i];
		}
		for (int j = meio+1; j <=fim; j++) {
			aux[fim+meio+1-j] = v[j];
		}
		int i = inicio;
		int j = fim;
		for (int k = inicio; k <= fim; k++) {
			comparacoesA++; //<-- COMPARA��ES
			if (aux[i]<=aux[j]){
				v[k] = aux[i];
				i=i+1;
				trocasA++; //<-- TROCAS
			}else{
				v[k] = aux[j];
				j=j-1;
				trocasA++; //<-- TROCAS
			}
		}
		fMerge = System.currentTimeMillis() - inMerge;
	}
	public void mergeSort(int v[],int inicio, int fim){
		
		int meio;
	  
		if (inicio < fim){
			meio = (inicio+fim)/2;
			mergeSort(v,inicio,meio);
			mergeSort(v,meio+1,fim);
			merge(v,inicio,meio,fim);
	     }
		System.out.println("Tempo de execu��o = " + fMerge);
		System.out.println("Total compara��es = " + comparacoesA);
		System.out.println("Trocas = " + trocasA);
	}
	

	long comparacoesB = 0;
	long trocasB = 0;
	long fQui;
	
	private int particao(int X[],int inicio, int fim){
		long inQui = System.currentTimeMillis();
		
		int pivo, i, j, aux;
		pivo = X[(inicio+fim)/2];
		i = inicio-1;
		j = fim+1;
		while (i < j){
			do{
				j = j-1;
			}while (X[j] > pivo);
			do{
				comparacoesB++; //<-- COMPARA��ES
				i = i+1;
			}while (X[i] < pivo);
			comparacoesB++;  //<-- COMPARA��ES
			if(i < j){
				aux = X[i];
				X[i] = X[j];
				X[j] = aux;
				trocasB++; //<-- TROCAS
			}	
		}
		fQui = System.currentTimeMillis() - inQui;
		return j;
	}
	public void quickSort(int X[], int inicio, int fim){
		int q;
		if (inicio < fim){
			q = particao(X,inicio,fim);
			quickSort(X,inicio,q);
			quickSort(X,q+1,fim);
		}
		System.out.println("Tempo de execu��o = " + fQui);
		System.out.println("Total compara��es = " + comparacoesB);
		System.out.println("Trocas = " + trocasB);
	}
	
	public void shellSort ( int [ ] v ){
		
		long inicio = System.currentTimeMillis();
		long comparacoes = 0;
		long trocas = 0;
		
		int i , j , h = 1, value ;
	
		     do {
		        h = 3 * h + 1;
		     } while ( h < v.length );
		     do {
		        h = h / 3;
		        for ( i = h; i < v.length; i++) {
		           value = v [ i ];
		           j = i - h;        
		           comparacoes++; //<-- COMPARA��ES
		           while (j >= 0 && value < v [ j ]) {
		        	  comparacoes++; //<-- COMPARA��ES
		              v [ j + h ] = v [ j ];
		              j = j - h;
		              trocas++; //<-- TROCAS
		           }
		           v [ j + h ] = value;
		           trocas++; //<-- TROCAS
		        }
		     } while ( h > 1 );
		    long fim = System.currentTimeMillis() - inicio;
		    System.out.println("Tempo de execu��o = " + fim);
			System.out.println("Total compara��es = " + comparacoes);
			System.out.println("Trocas = " + trocas);
	}
	

	
	
}
