package exercicios2;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*//Atividade 1
		Soma soma = new Soma();
		
		System.out.println("Digite um número inteiro:");
		int x = input.nextInt();
		
		System.out.println("Digite outro número inteiro:");
		int y = input.nextInt();
		
		System.out.println(soma.somaInt(x, y));*/
		
		/*//Atividade 2
			Mercadoria mercadoria = new Mercadoria();
				
			System.out.println("Digite o preço da mercadoria:");
			double preco = input.nextDouble();
				
			System.out.println("Digite o percentual de desconto:");
			int percentual = input.nextInt();
				
			System.out.println(mercadoria.prodComDesconto(preco, percentual));*/
		
		
		Arrays array = new Arrays();
		
		/*int vet1[] = {1,4,6,8,12};
		int vet2[] = {2,5,7,10,11};
		
		array.juntaArrays(vet1, vet2);*/
		
		/*int vet[] = {1,2,3,4,5};
		
		System.out.println("Digite o valor que deseja encontrar:");
		int x = input.nextInt();
	
		array.encontraValor(vet, x);*/
		
		int vet[] = new int [10];
		
		System.out.println(array.maiorMenor(vet));
	}

}
