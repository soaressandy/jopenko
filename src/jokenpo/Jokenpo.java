package jokenpo;

public class Jokenpo {

	void ExibirTelaInicial() {
		System.out.println("------------------------");
		System.out.println("      J O K E N P O     ");
		System.out.println("------------------------");
		System.out.println("1 - Pedra               ");
		System.out.println("2 - Papel               ");
		System.out.println("3 - Tesoura             ");
		System.out.println("------------------------");
		System.out.println("                        ");
		System.out.print("Digite sua opção......: ");
	}

	String ObterNomeJogada(int opcao) {

		String nomeJogada = new String();

		if (opcao == 1) {
			nomeJogada = "Pedra";
		} else if (opcao == 2) {
			nomeJogada = "Papel";
		} else if (opcao == 3) {
			nomeJogada = "Tesoura";
		}

		return nomeJogada;
	}

	void DeterminarResultadoJogo(int opcaoJogador, int opcaocomputador) {

		int pedra = 1;
		int papel = 2;
		int tesoura = 3;
		String nomeJogada = new String();
		
		nomeJogada = this.ObterNomeJogada(opcaoJogador);
		
		System.out.println("Você escolheu a opcão.....: " + nomeJogada);
		
		nomeJogada = this.ObterNomeJogada(opcaocomputador);
		
		System.out.println("Computador escolheu a opção: " + nomeJogada);

		if (opcaoJogador == opcaocomputador) {
			System.out.println("Você e o computador escolheram a mesma opcao - EMPATE !!!");
		} else if (opcaoJogador == pedra && opcaocomputador == tesoura) {
			System.out.println("Pedra ganha de Tesoura - você ganhou esta !!!");
		} else if (opcaoJogador == pedra && opcaocomputador == papel) { // Pedra e Papel
			System.out.println("Papel ganha de pedra - você perdeu esta !!!");
		} else if (opcaoJogador == papel && opcaocomputador == pedra) { // Papel e Pedra
			System.out.println("Papel ganha de pedra - você ganhou esta !!!");
		} else if (opcaoJogador == papel && opcaocomputador == tesoura) { // Papel e Tesoura
			System.out.println("Tesoura ganha de papel - você perdeu esta !!!");
		} else if (opcaoJogador == tesoura && opcaocomputador == pedra) { // Tesoura e Pedra
			System.out.println("Pedra ganha de Tesoura - você perdeu esta !!!");
		} else if (opcaoJogador == tesoura && opcaocomputador == papel) { // Tesoura e papel
			System.out.println("Tesoura ganha de Papel - você ganhou esta !!!");
		}
	}
}
