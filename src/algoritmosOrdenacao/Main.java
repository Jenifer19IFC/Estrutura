package algoritmosOrdenacao;

public class Main {

	public static void main(String[] args) {
	
		int[] array = {18,64,92,28,49,83,70,38,44};
		MetodosOrdenacao ordenar = new MetodosOrdenacao();
		
		ordenar.selectionSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		ordenar.insertionSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}
}
