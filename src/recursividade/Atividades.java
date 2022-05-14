package recursividade;

public class Atividades {

	public int fatorialRecursivo(int n) {
		if(n == 1) return 1; //Base
		else
			return n*fatorialRecursivo(n-1); //Passo
	}
	
	public int fatorialIterativa(int n) {
		
		int i;
		int fatorial = 1;
		
		if(n == 1 || n == 0) {
			return 1;
		}
		else{
			for(i = n; i > 0; i--) {
				fatorial = fatorial * i;
			}
		}
		
		return fatorial;
	}
	
	public int recorrencia (int x) {
		
		if(x == 0) {
			return 2;
		}
		else
			return 2 * recorrencia(x-1) - 4;
	}
	
	public int fib (int n) {
		if (n == 0) {return 0;}
		else if (n == 1) {return 1;}
		else { 
			return fib (n-1) + fib(n-2);
		}
	}
	
	public int somatorio(int n) {
		int i = n;
		if( i == 1) {
			return (2 * (i * i) + 2 * i + 8);	
		}
		else 
			return somatorio(n-1) + (2 * (i * i) + 2 * i + 8);
	}
}
