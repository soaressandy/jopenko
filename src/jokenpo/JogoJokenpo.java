package jokenpo;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JogoJokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcaoJogador, opcaocomputador;
	
		// classe para ler a partir do teclado

		Scanner leitor = new Scanner(System.in);

		// classe para ler numeros aleatorios

		Random random = new Random();

		// classe criada para treinar depois da aula de 26/01

		Jokenpo jkp = new Jokenpo();

		jkp.ExibirTelaInicial();

		opcaoJogador = leitor.nextInt();

		if (opcaoJogador != 1 && opcaoJogador != 2 && opcaoJogador != 3) {
			System.out.println("Opcao Invalida !!!");
		} else {
			
			opcaocomputador = random.nextInt(3)+ 1;

			jkp.DeterminarResultadoJogo(opcaoJogador, opcaocomputador);

		}
		
		leitor.close();
	}
}
