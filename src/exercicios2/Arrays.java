package exercicios2;
import java.util.Random;
public class Arrays {

	public void juntaArrays(int vet1[], int vet2[]) {
		
		int i;
		int c = 0;
		int tamanho = 5;
		int vet3 [] = new int[vet1.length + vet2.length];
		
		for (i = 0; i < vet1.length; i++ ) {
			vet3[c++] = vet1[i];
		}
		
		for (i = 0; i < vet2.length; i++ ) {
			vet3[c++] = vet2[i];
		}
		
		for (i = 0; i < vet3.length; i++ ) {
			System.out.print(vet3[i] + " ");
		}
	}
	
	
	public void encontraValor(int vet[], int x) {
		
		int i;
		int aux1 = 0;
		int aux2 = 0;
		
		for (i = 0; i < vet.length; i++ ) {
			if(vet[i] == x) {
				aux1 = vet[i];
			}
			else if(vet[i] !=  x){
				aux2 = 0;
			}
		}
		if(aux1 != 0) {
			System.out.println(aux1);
		}
		else if (aux2 == 0){
			System.out.println("Valor não encontrado");
		}
	}
	
	public String maiorMenor (int vet[]) {
		Random gerador = new Random();

		int i;
		int maior = 0;
		int menor = 0;
		
		for(i = 0; i < 10; i++) {
			vet[i] = gerador.nextInt(10);
			System.out.println(vet[i]);
			if(i == 1) {
				maior = vet[1];
				menor = vet[1];
			}else {
				if(vet[i] > maior) {
					maior = vet[i];
				}
				else if(vet[i] < menor){
					menor = vet[i];
				}
			}
		}
	
		return "Maior = " + maior + "\nMenor = " + menor;
	}
}
