package exercicios2;

public class Mercadoria {

	public String prodComDesconto(double valor, double percentual) {
		double desconto;
		double precoFinal;
		percentual = percentual / 100;
		
		desconto = valor * percentual;
		precoFinal = valor - desconto;
		
		return "Valor do desconto: R$ " + desconto + "\nPreço à pagar: R$ " + precoFinal;
	}
	
}
