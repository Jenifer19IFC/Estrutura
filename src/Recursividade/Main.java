package Recursividade;

public class Main {

	public static void main(String[] args) {
	
		Atividades atividades = new Atividades();
		
		System.out.println(atividades.fatorialRecursivo(4));

		System.out.println(atividades.fatorialIterativa(4));
		
		System.out.println(atividades.recorrencia(5));
		
		System.out.println(atividades.fib(2));
		
		System.out.println(atividades.somatorio(2));
	}

}
