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
		
		System.out.println("Esse projeto j� � a resposta da quest�o");
	}
	
	public void Questao2() {
		
		System.out.println("O programa Java: imprimindo uma linha de texto\n "
				+ "Tem 2 class e 1 metedodo");
	}
	public void Questao3() {
		System.out.println("Welcome to Java Programming!");
		System.out.println("N�o houve problemas com a compila��o do c�digo\n"
				+ "Copie colei e rodeio o c�digo sem erros");
	}
	public void Questao4() {
		System.out.println("Bem-vindo");
		System.out.println("Welry matricula ficticia: 8457Yaa-458 ");
		System.out.println("Sauda��es!");
		System.out.println("\n");
	}
	public void Questao5() {
		String texto = "Bem-vindo, Welry matricula ficticia: 8457Yaa-458 "
				+ "Sauda��es!\n";
		System.out.println(texto);
	}
	public void Questao6() {
		String texto = "Bem-vindo, \nWelry \nmatricula \nficticia: \n8457Yaa-458 "
				+ "\nSauda��es!\n";
		System.out.println(texto);
	}
	public void Questao7() {
		String texto = "Bem-vindo, \tWelry \tnmatricula \tficticia: \t8457Yaa-458 "
				+ "\tSauda��es!\n";
		System.out.println(texto);
	}
	public void Questao8() {
		String texto = "\"Bem-vindo, \t\"Welry \t\"nmatricula \t\"ficticia: \t\"8457Yaa-458 "
				+ "\t\"Sauda��es!\"\n";
		System.out.println(texto);
	}
	public void Questao9() {
		String nome = "Welry Sanbey", matr�cula = "14584-Y484", data ="03-10-2022", hora="04:05:15";
    System.out.printf(nome," ",matr�cula, " ",data, " ",hora );
	}
	public void Questao10() {
		
		// cria um Scanner para obter entrada a partir da janela de comando�
		 Scanner input = new Scanner(System.in); 
		 int number1; // primeiro n�mero a somar 
		 int number2; // segundo n�mero a somar 
		 int sum; // soma de number1 e number2 
		 
		 System.out.print("Insira o primeiro n�mero inteiro: "); // prompt 
		 number1 = input.nextInt(); // l� primeiro o n�mero fornecido pelo usu�rio 
		 
		 System.out.print("Digite o segundo inteiro: "); // prompt 
		 number2 = input.nextInt(); // l� o segundo n�mero fornecido pelo usu�rio 
		 
		 sum = number1 + number2; // soma os n�meros, depois armazena o total em sum
		 System.out.printf("A soma � %d%n", sum); // exibe a soma 
		 
		 String resposta = "Discri��o do ponto de vista do us�ario: "
		 		+ "O programa solicita que o usuario insita um n�mero inteiro "
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
