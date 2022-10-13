package RespostasPerguntas;

import java.util.Scanner;

public class Gerenciador {
	Perguntas mostrar = new Perguntas();
	Scanner sc = new Scanner(System.in);
	private int tentativa = 4;


	public void Aviso() {
		System.out.println("\"Bem vindo a lista de exercicios de LPOO do livro Como programar em java 10ª edição.\n");
		System.out.println("Estou disponibilizando duas formas de verificação das perguntas e respostas ");
		System.out.println("Digitando 1 você vera as perguntas e resposta em seguencia\n"
				+ "caso seja solicitado você tera que preencher com os dados solicitados para resposta\n");
		System.out.println("Digitando 2 você tera acesso as questões uma por uma\n");
		System.out.println("Digitando 3 você Finaliza o programa\n");
	}
	public void TodasPerguntas() {
		mostrar.ExibirTodasQuestoes();
	}
	public void UmaPerguntaPorVez() {
		System.out.println("Pronto pode colocar ao questão desejada: \n");
		System.out.println("Lembrando que algumas questões solicitam que o usuário insira os\n");
		System.out.println("os dados para serem exibidos em tela\n");
		int questao = sc.nextInt();
		if(questao>0 || questao<17) {
		mostrar.ExibirUmaQuestaoPorVez(questao);
		}else {
			System.out.println(""+questao +" é um valor invalido" );
		}
	}
	public void ExibirTentativas() {
		
		if (this.tentativa == 0 ) {
			System.out.println("Por favor reinicia o sistema");
			
		}else {
			System.out.println("Você só tem mais "+(this.tentativa - 1)+ " tentativas");
			
		} 
	}
	public int Finalizar() {
		this.tentativa--;
		return this.tentativa;
	}
}
