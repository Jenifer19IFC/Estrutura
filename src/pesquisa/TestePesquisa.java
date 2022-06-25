package pesquisa;

import java.util.LinkedList;

public class TestePesquisa {

	public static void main(String[] args) {
	
		int v[] = {2,3,5,7,11,13,17,31,31,37,41,53,61,67};
		
		Pesquisa busca = new Pesquisa();
		
		System.out.println("Pesquisa binária");
		int resultado = busca.sequencial(v,67);
		
		if(resultado != -1) {
			System.out.println("Elemento encontrado! Está na posição " + resultado);
		}else {
			System.out.println("Elemento não encontrado");
		}
		
		System.out.println("\n-----------------\n");
		
		//Para elementos que estão em mais de uma posição
		System.out.println("Pesquisa Sequencial - Versão 2\n");
		LinkedList<Integer>resultadoBusca = new LinkedList<Integer>();
		resultadoBusca = busca.sequencialV2(v, 31);
		
		if(resultadoBusca.size() > 0) { //Se o tamanho do resultado for maior que 0...
			for(int elementos:resultadoBusca) {
				System.out.println(elementos);
			}
		}else {
			System.out.println("Elemento não enontrado");
		}
		
		
		System.out.println("\nPesquisa binária\n");
		
		resultado = busca.binaria(v, 31);
		
		if(resultado != -1) {
			System.out.println("Elemento encontrado! Está na posição " + resultado);
		}else {
			System.out.println("Elemento não encontrado");
		}

	}

}
