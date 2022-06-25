package algoritmosOrdenacao;

import java.util.Iterator;

public class MetodosOrdenacao {
	
	public int[]bubbleSort(int array[]) {
		int temp = 0;
		
		for(int i = 0; i <array.length; i++) {
			for(int j = 0; j <array.length-1;j++) { //-1 porque para no penúltimo
				if(array[i] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public int[] selectionSort(int array[]) {
		int min,temp;
		
		for (int i = 0; i < array.length-1; i++) {
			min = i; //início de cada passada
			for (int j = i+1; j < array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		return array;
	}
	
	public int[] insertionSort(int array[]) {
		int pivo,j;
		
		for (int i = 0; i < array.length; i++) { //Para frente
			pivo = array[i]; 
			j = i-1;
			while(j >= 0 && array[j] > pivo) {//Para trás
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = pivo;
		}
		return array;
	}
	
	//RECURSIVIDADE
	
	
	//Quick sort
		public void quickSort(int X[], int inicio, int fim){
			int q;
			if (inicio < fim){
				q = particao(X,inicio,fim);
				quickSort(X,inicio,q);
				quickSort(X,q+1,fim);
			}
		}
		private int particao(int X[],int inicio, int fim){
			int pivo, i, j, aux;
			pivo = X[(inicio+fim)/2];
			i = inicio-1;
			j = fim+1;
			while (i < j){
				do{
					j = j-1;
				}while (X[j] > pivo);
				do{
					i = i+1;
				}while (X[i] < pivo);
				
				if(i < j){
					aux = X[i];
					X[i] = X[j];
					X[j] = aux;
				}	
			}
			return j;
		}
	
	//Merge sort
		public void mergeSort(int array[],int inicio, int fim){
			int meio;
			if (inicio<fim){
				meio = (inicio+fim)/2;
				mergeSort(array,inicio,meio);
				mergeSort(array,meio+1,fim);
				merge(array,inicio,meio,fim);
		     }
		}
		private void merge(int array[],int inicio,int meio, int fim){
			int aux[] = new int[array.length];
			for (int i = inicio; i <=meio; i++) {
				aux[i] = array[i];
			}
			for (int j = meio+1; j <=fim; j++) {
				aux[fim+meio+1-j] = array[j];
			}
			int i = inicio;
			int j = fim;
			for (int k = inicio; k <=fim; k++) {
				if (aux[i]<=aux[j]){
					array[k] = aux[i];
					i=i+1;
				}else{
					array[k] = aux[j];
					j=j-1;
				}
			}
		}
		
		
}
