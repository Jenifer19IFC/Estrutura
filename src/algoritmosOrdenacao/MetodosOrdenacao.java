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
	
	
}
