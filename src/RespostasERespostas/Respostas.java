package RespostasERespostas;

import java.util.Scanner;

public class Respostas {
	
//	public void Respostas(int i) {
//		switch(i) {
//		case 1:
//			Questao1();
//			break;
//		}
//	}
	
	public void Questao1() {
		
		System.out.println("Esse projeto já é a resposta da questão");
	}
	
	public void Questao2() {
		
		System.out.println("O programa Java: imprimindo uma linha de texto\n "
				+ "Tem 2 class e 1 metedodo");
	}
	public void Questao3() {
		System.out.println("Welcome to Java Programming!");
		System.out.println("Não houve problemas com a compilação do código\n"
				+ "Copie colei e rodeio o código sem erros");
	}
	public void Questao4() {
		System.out.println("Bem-vindo");
		System.out.println("Welry matricula ficticia: 8457Yaa-458 ");
		System.out.println("Saudações!");
		System.out.println("\n");
	}
	public void Questao5() {
		String texto = "Bem-vindo, Welry matricula ficticia: 8457Yaa-458 "
				+ "Saudações!\n";
		System.out.println(texto);
	}
	public void Questao6() {
		String texto = "Bem-vindo, \nWelry \nmatricula \nficticia: \n8457Yaa-458 "
				+ "\nSaudações!\n";
		System.out.println(texto);
	}
	public void Questao7() {
		String texto = "Bem-vindo, \tWelry \tnmatricula \tficticia: \t8457Yaa-458 "
				+ "\tSaudações!\n";
		System.out.println(texto);
	}
	public void Questao8() {
		String texto = "\"Bem-vindo, \t\"Welry \t\"nmatricula \t\"ficticia: \t\"8457Yaa-458 "
				+ "\t\"Saudações!\"\n";
		System.out.println(texto);
	}
	public void Questao9() {
		String nome = "Welry Sanbey", matrícula = "14584-Y484", data ="03-10-2022", hora="04:05:15";
    System.out.printf(nome," ",matrícula, " ",data, " ",hora );
	}
	public void Questao10() {
		
		// cria um Scanner para obter entrada a partir da janela de comandoÿ
		 Scanner input = new Scanner(System.in); 
		 int number1; // primeiro número a somar 
		 int number2; // segundo número a somar 
		 int sum; // soma de number1 e number2 
		 
		 System.out.print("Insira o primeiro número inteiro: "); // prompt 
		 number1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário 
		 
		 System.out.print("Digite o segundo inteiro: "); // prompt 
		 number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário 
		 
		 sum = number1 + number2; // soma os números, depois armazena o total em sum
		 System.out.printf("A soma é %d%n", sum); // exibe a soma 
		 
		 String resposta = "Discrição do ponto de vista do usúario: "
		 		+ "O programa solicita que o usuario insita um número inteiro "
		 		+ "logo em seguida o proximo e assim o programa calcula os valores "
		 		+ "e imprime em tela o resultado da soma dos produtos";
		 
		 System.out.println(resposta);
		 
	}
	public void Questao11() {}
	public void Questao12() {}
	public void Questao13() {}
	public void Questao14() {}
	public void Questao15() {}
	public void Questao16() {}
	public void Questao17() {}
	
	}
