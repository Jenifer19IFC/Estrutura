package pesquisa;

import java.util.Iterator;
import java.util.LinkedList;

public class Pesquisa {

		public int sequencial(int array[],int x) {
			for (int i = 0; i < array.length; i++) {
				if(array[i] == x) {
					return i; //Retorna a posição
				}
			}
		return  -1;
		}
		
		public  LinkedList<Integer>sequencialV2(int array[],int x) {
			LinkedList<Integer>encontrados = new LinkedList<Integer>();
			
			for(int i = 0; i < array.length;i++) {
				if(array[i] == x) {
					encontrados.add(i);
				}
			}
			return encontrados;
		}
		
		public int binaria(int array[], int x) {
			int min = 0;
			int max = array.length-1;
			
			while(min <= max) {
				int meio = (min + max)/2;
				if(array[meio] == x) {
					return meio;
				}
				else if(x > array[meio]){
					min = meio + 1;
				}else {
					max = meio-1;
				}
			}
			return -1;
		}
		
		
}
