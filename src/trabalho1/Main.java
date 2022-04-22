package trabalho1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Fila filaChegada = new Fila();
		
		filaChegada.inserir(1);
		filaChegada.inserir(2);
		filaChegada.inserir(3);
		filaChegada.inserir(4);
		
		Pilha pilhaPratos = new Pilha();
		
		pilhaPratos.push(1);
		pilhaPratos.push(2);
		pilhaPratos.push(3);
		pilhaPratos.push(4);
		pilhaPratos.push(5);
		pilhaPratos.push(6);
		pilhaPratos.push(7);
		pilhaPratos.push(8);
		pilhaPratos.push(9);
		pilhaPratos.push(10);
		pilhaPratos.push(11);
		pilhaPratos.push(12);
		
	
		//Lista pré-definida de 15 mesas
		ListaEncadeada listE = new ListaEncadeada(1, "Disponível", 0);
		
		listE.inseririnicio(2, "Disponível", 0);
		listE.inseririnicio(3, "Disponível", 0);
		listE.inseririnicio(4, "Disponível", 0);
		listE.inseririnicio(5, "Indisponível", 0);
		listE.inseririnicio(6, "Indisponível", 0);
		listE.inseririnicio(7, "Disponível", 0);
		listE.inseririnicio(8, "Disponível", 0);
		listE.inseririnicio(9, "Disponível", 0);
		listE.inseririnicio(10, "Disponível", 0);
		listE.inseririnicio(11, "Disponível", 0);
		listE.inseririnicio(12, "Disponível", 0);
		listE.inseririnicio(13, "Disponível", 0);
		listE.inseririnicio(14, "Disponível", 0);
		listE.inseririnicio(15, "Indisponível", 0);
		
		Fila filaCaixa = new Fila();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n    SEJA BEM-VINDO AO RESTAURANTE TELHADINHO! \n"
				+ "    ------------------------------------------ \n");
		
		int codPessoasChegada = 0;
		int codPratos = 0;
		int codPessoasCaixa = 0;
		NodoListaEncadeada aux;
		int numFilaAlmocar =  filaChegada.getTamanho();
		int numFilaCaixa = filaCaixa.getTamanho();
		int numAtendidos = 0;
		
		while(true) {
			
			int numFilaChegada = 0;
			
			while(true) {
				
				System.out.println("\n Menu:\n");
				System.out.println(" 1- Entrada no restaurante\n"
						+ " 2 - Relatório geral do restaurante\n"
						+ " 3 - Sair" );
				
				int menu = input.nextInt();
				
			
				if(menu == 1) {
				
					System.out.println(" Entrar na fila de chegada? 1- Sim | 2 - Não");
					int a = input.nextInt();
					
					if(a == 2) {
						System.out.println(" Esperamos por você na próxima vez!\n");
					}
					if(a == 1) {
						codPessoasChegada++;
						
							System.out.println(" N° de pessoas na fila: " + filaChegada.filaDeChegada(filaChegada, codPessoasChegada));
							
							if(filaChegada.getTamanho() < filaChegada.getLimite()) {
							
								System.out.println(" \nLISTA DE MESAS DISPONÍVEIS:\n");
								System.out.println(listE.mostrarListaMesas());
								
								System.out.println(" Há " + listE.numMesasDisponíveis() + " mesas disponíveis\n");
								
								int x;
								
								while(true) {
									
									System.out.println(" Escolha uma mesa:\n");
									x = input.nextInt();
									
									if(listE.mesaEstaDisponivel(x) == 1) {
										break;
									}
									else {
										System.out.println(" Mesa indisponível! Escolha outra mesa:\n");
									}
									
								}
							
								listE.setCodMesa(x);
								
								filaChegada.remover();
								numFilaAlmocar =  filaChegada.getTamanho();
								
								System.out.println(" N° de pessoas na fila de entrada: " + filaChegada.getTamanho());
								
								System.out.println(" Descreva sua refeição:");
								String descricaoRefeicao = input.next();
								
								input.nextLine();
								
								System.out.println(" Digite o valor dos gastos da mesa:");
								listE.setGastos(input.nextDouble());
								
								if(pilhaPratos.getTamanho() == 0) {
									System.out.println(" Não há pratos, infelizmente não podemos atendê-lo. \n");
									System.exit(0);
								}
								pilhaPratos.pop(); //remove da lista de pratos
								
								
								System.out.println(" \n AGORA EFETUAR PAGAMENTO...\n");
								codPessoasCaixa++; //Auto incremento de código 
								numAtendidos++; //contador de pessoas atendidas
								
								System.out.println(" N° de pessoas na fila do caixa: " + filaCaixa.filaDoCaixa(filaCaixa, codPessoasCaixa));
								
								
								System.out.println();
								System.out.println(" Mesa: " + listE.getCodMesa());
								System.out.println(" Refeição: " + descricaoRefeicao);
								System.out.println(" Gastos: R$ " + listE.getGastos() + " \n ");
								
								listE.setSituacao("Disponível");
								listE.setGastos(0);
								pilhaPratos.push(codPratos);
								filaCaixa.remover();
								numFilaCaixa = filaCaixa.getTamanho();

								System.out.println(" Há " + pilhaPratos.getTamanho() + " pratos na pilha\n");
								System.out.println(" Há " + listE.numMesasDisponíveis() + " mesas disponíveis\n");
			
								
							}
							else {
								System.out.println(" Aguarde...");;
							}
							
				}//if a == 1
				
				}//IF menu
				
				if(menu == 2) {{ 
					
					System.out.println(" -----------  RELATÓRIO  ----------\n");
					
					System.out.println(" Número de pessoas na fila para almoçar: " +numFilaAlmocar);
					
					System.out.println(" Numero de pessoas na fila do caixa: " + numFilaCaixa);
					
					int numAlmocando = 15-listE.numMesasDisponíveis();
					System.out.println(" N° de pessoas almoçando no restaurante: " + numAlmocando);
	
					System.out.println(" N° de pessoas atendidas no restaurante: " + numAtendidos);
					
					System.out.println(" N° de pratos na pilha: " + pilhaPratos.getTamanho());

					int mesasDisponiveis = listE.numMesasDisponíveis();
					System.out.println(" N° de mesas disponíveis: " + mesasDisponiveis + "\n");
				}
				
				
			}
			
			if(menu == 3) {
				System.out.println(" ----------------");
				System.out.println(" Fim do programa.");
				System.out.println(" ----------------");
		        System.exit(0);
			}
	
		
		}//while 2	
			 
	}//while 1
	}
}
