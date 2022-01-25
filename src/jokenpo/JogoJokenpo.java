package jokenpo;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JogoJokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao, opcaocomputador;
		Scanner leitor = new Scanner(System.in);
		String[] opcaonome = { " ","Pedra", "Papel", "Tesoura"}; 
		boolean ganhou;
		
		// classe para ler numeros aleatorios
		
		Random random = new Random();

		System.out.println("------------------------");
		System.out.println("      J O K E N P O     ");
		System.out.println("------------------------");
		System.out.println("1 - Pedra               ");
		System.out.println("2 - Papel               ");
		System.out.println("3 - Tesoura             ");
		System.out.println("------------------------");
		System.out.println("                        ");
		System.out.print  ("Digite sua opção......: ");
		
		opcao = leitor.nextInt();
		
		if (opcao != 1 && opcao != 2 && opcao != 3 ) {
			
			System.out.println("Opcao Invalida !!!");
		} else {
			System.out.println("Você escolheu a opcão: " + opcaonome[opcao]);
			
			int bound  = 4;
			
			// opcao bound - vai de 0 até o bound (e
			opcaocomputador = random.nextInt(bound); 
			
			if (opcaocomputador == 0) {
				opcaocomputador = 1;	
			}
			
			//System.out.println(opcaocomputador);
			
			System.out.println("Computador escolheu a opção: " + opcaonome[opcaocomputador]);
					
			if (opcao == opcaocomputador ) {
				System.out.println("Você e o computador escolheram a mesma opcao - EMPATE !!!");		
			} else if (opcao == 1 && opcaocomputador == 3) { // Pedra e Tesoura
				System.out.println("Você ganhou esta !!!"); 
			} else if (opcao == 1 && opcaocomputador == 2) { // Pedra e Papel
				System.out.println("Você perdeu esta !!!"); 
			} else if (opcao == 2 && opcaocomputador == 1) { // Papel e Pedra
				System.out.println("Você ganhou esta !!!"); 
			} else if (opcao == 2 && opcaocomputador == 3) { // Papel e Tesoura
				System.out.println("Você ganhou esta !!!"); 
			} else if (opcao == 3 && opcaocomputador == 1) { // Tesoura e Pedra
				System.out.println("Você perdeu esta !!!"); 
			} else if (opcao == 3 && opcaocomputador == 2) { // Tesoura e papel
				System.out.println("Você perdeu esta !!!"); 
			}
		}	
	}
}
