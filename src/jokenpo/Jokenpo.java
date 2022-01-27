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
		System.out.print("Digite sua op��o......: ");
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
		
		System.out.println("Voc� escolheu a opc�o.....: " + nomeJogada);
		
		nomeJogada = this.ObterNomeJogada(opcaocomputador);
		
		System.out.println("Computador escolheu a op��o: " + nomeJogada);

		if (opcaoJogador == opcaocomputador) {
			System.out.println("Voc� e o computador escolheram a mesma opcao - EMPATE !!!");
		} else if (opcaoJogador == pedra && opcaocomputador == tesoura) {
			System.out.println("Pedra ganha de Tesoura - voc� ganhou esta !!!");
		} else if (opcaoJogador == pedra && opcaocomputador == papel) { // Pedra e Papel
			System.out.println("Papel ganha de pedra - voc� perdeu esta !!!");
		} else if (opcaoJogador == papel && opcaocomputador == pedra) { // Papel e Pedra
			System.out.println("Papel ganha de pedra - voc� ganhou esta !!!");
		} else if (opcaoJogador == papel && opcaocomputador == tesoura) { // Papel e Tesoura
			System.out.println("Tesoura ganha de papel - voc� perdeu esta !!!");
		} else if (opcaoJogador == tesoura && opcaocomputador == pedra) { // Tesoura e Pedra
			System.out.println("Pedra ganha de Tesoura - voc� perdeu esta !!!");
		} else if (opcaoJogador == tesoura && opcaocomputador == papel) { // Tesoura e papel
			System.out.println("Tesoura ganha de Papel - voc� ganhou esta !!!");
		}
	}
}
