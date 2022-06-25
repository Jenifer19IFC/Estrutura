package algoritmosOrdenacao;

import java.util.Random;

public class MainTempos {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		 
		int v[] = new int[100000];
		
		//Preenchendo o vetor ordenado
		//for(int i = 0;i < v.length; i++) {
		//	v[i] = i;
		//}
		
		//Preenchendo o vetor invertido
		//for(int i = 0, j = 100000;i < v.length-1; i++,j--) { 
		//   v[i] = j;
		//}
		
		//Preenchendo o vetor de forma aleatória
		for (int i = 0; i < v.length; i++) {
			v[i] = gerador.nextInt();
		}
		
		Tempos ordenar = new Tempos();
	
		//ordenar.bubbleSort(v); 
		//ordenar.insertionSort(v); 
		//ordenar.selectionSort(v); 
		//ordenar.mergeSort(v, 0, v.length-1); 
		ordenar.quickSort(v, 0, v.length-1);  
		//ordenar.shellSort(v);
		
		System.out.println();

	}

}
