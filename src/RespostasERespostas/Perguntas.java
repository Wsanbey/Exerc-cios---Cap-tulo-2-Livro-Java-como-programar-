package RespostasERespostas;

public class Perguntas {
	
	public void ExibirTodasQuestoes() {
		
		for (int i = 0; i < 14; i++) {
			desenhar();
			Questoes(i);
			System.out.println("\n");
		}
	}
	
	public void ExibirUmaQuestaoPorVez(int questao) {
		
		Questoes(questao); 
	}
		
	
	private void Questoes(int opcao) {
		String[] questao = {
//				QUESTAO 1
				"1: "
				+ "Crie um projeto no Eclipse segundo o seguinte tutorial. Descreva sua experi�ncia.\r\n"
				+ "Voc� pode usar o tutorial dispon�vel no ava.\r\n"
				+ "a. Crie um pacote \"capitulo_02\" no seu projeto e coloque todas as classes\r\n"
				+ "deste exerc�cio dentro dele. Pode usar o tutorial em v�deo do ava, que mostra\r\n"
				+ "como fazer.\r\n",
//				QUESTAO 2				
				" 2: "
				+ "Explique em linhas gerais o que voc� compreendeu sobre o exemplo da figura 2.1\r\n"
				+ "na p�gina 28. Quantas classes e m�todos voc� v�?\r\n",
//				QUESTAO 3
				" 3: "
				+ "Execute o c�digo da figura 2.1 e observe a sa�da. Explique o que voc� precisou\r\n"
				+ "fazer para compilar e executar o c�digo.\r\n",
//				QUESTAO 4
				" 4: "
				+ "Modifique o c�digo comentando a linha 9. Depois se inspire nela para imprimir:\r\n"
				+ "a. O texto \"Bem-vindo, \"\r\n"
				+ "b. Seu nome e matr�cula\r\n"
				+ "c. o texto \" ! Sauda��es!\"\r\n"
				+ "d. Uma quebra de linha.\r\n"
				+ "e. Use os m�todos \"print()\" e \"println()\", at� a pr�xima orienta��o sobre\r\n"
				+ "m�todos. L� na frente usaremos printf.\r\n"
				+ "f. Use uma linha diferente de c�digo para cada item.\r\n",
//				QUESTAO 5
				"  5: "
				+ "Insira uma nova linha de c�digo que imprime outra c�pia do mesmo texto, mas\r\n"
				+ "agora utilize um �nico objeto String. Ou seja, seu texto vai todo entre \"\".",
//				QUESTAO 6
				"  6: "
				+ "Insira uma nova linha de c�digo que imprime outra c�pia do mesmo texto, mas\r\n"
				+ "agora cada palavra vai em uma linha diferente. Utilize um �nico objeto String. Ou\r\n"
				+ "seja, seu texto vai todo entre \"\". Se inspire no c�digo da figura 2.4.\r\n",
//				QUESTAO 7
				"  7: "
				+ "Insira um novo conjunto de linhas, baseado nas suas respostas anteriores. Imprima\r\n"
				+ "o mesmo texto do item 3) (n�o do item 4), ok?) , mas dessa vez insira um caractere\r\n"
				+ "1\r\n"
				+ "de tabula��o antes de cada linha. Cada palavra inserida vai em uma linha diferente.\r\n"
				+ "Veja a figura 2.5 para ajudar.",
//				QUESTAO 8
				"  8: "
				+ "Crie um novo bloco de c�digo inspirado no anterior. Fa�a sua sa�da da quest�o\r\n"
				+ "anterior apresentar o mesmo texto, por�m desta vez inclua na sua sa�da aspas\r\n"
				+ "duplas. Cuidado com as seq��ncias de escape.\r\n"
				+ "Use os dois caracteres \\\" dentro de seu texto para obter este efeito.\r\n",
//				QUESTAO 9
				"  9: "
				+ "Crie quatro vari�veis do tipo String, para seu nome, sua matr�cula, a data/hora em\r\n"
				+ "que voc� est� programando agora e mais outro texto qualquer que voc� escolheu\r\n"
				+ "livremente (n�o vale a string vazia). Refa�a o c�digo em 4)3) usando essas vari�veis,mas execute sua impress�o com o\r\n"
				+ "System.out.printf.",
//				QUESTAO 10
				"  10: "
				+ "Execute o c�digo da figura 2.7, p�gina 36, traduzindo par o portugu�s os textos que\r\n"
				+ "s�o impressos. Explique como o programa funciona do ponto de vista do usu�rio (o\r\n"
				+ "programa faz isso, depois aquilo...). Descreva o que aconteceu em poucas linhas.\r\n"
				+ "Note que aqui voc� ter� que criar uma nova classe no seu projeto, ent�o as\r\n"
				+ "respostas ir�o no arquivo desta nova classe.",
//				QUESTAO 11
				"  11: "
				+ "Explique em detalhes a linha 11 da figura 2.7, indicando exatamente o que acontece\r\n"
				+ "ali, que c�digo est� executando e como os objetos envolvidos trabalham em\r\n"
				+ "conjunto.",
//				QUESTAO 12
				"  12: "
				+ "Comente a linha 3, tente compilar e observe o que acontece. O que ocorre com a\r\n"
				+ "linha 11? Por que isto ocorre? Qual o papel da linha 3?",
//				QUESTAO 13
				"  13: "
				+ "Execute o c�digo da figura 2.15 (nova classe aqui!), passando inteiros para cada\r\n"
				+ "entrada. Traduza as mensagens de sa�da nas linhas 17 e 20. Explique o que ele faz\r\n"
				+ "em duas ou 3 linhas (por favor: coment�rios no c�digo, antes da classe).",
//				QUESTAO 14
				"  14: "
				+ "Modifique o c�digo para adicionar impress�es ao final. A sa�da deve usar printf e\r\n"
				+ "deve mostrar, em cada linha separada: a soma, a subtra��o, a multiplica��o, a\r\n"
				+ "divis�o e tamb�m o resto da divis�o inteira entre os dois valores.\r\n"
				+ "Exemplo de formato:\r\n"
				+ "\"A soma de 12 e 3 � 15\"\r\n"
				+ "Ou ent�o\r\n"
				+ "\"O resultado 12 + 3 => 15, uh�! funciona esse treco!\".\r\n"
				+ "Sinta-se livre para mexer no texto de sa�da, mas garanta que os valores\r\n"
				+ "est�o corretos.\r\n",
//				QUESTAO 15
				"  15: "
				+ "Execute o c�digo da quest�o anterior, mas quando o programa pedir entrada, digite\r\n"
				+ "letras ao inv�s de n�meros. Explique o que ocorre com seu c�digo.",
//				QUESTAO 16
				"  16: "
				+ " Execute o c�digo da quest�o anterior. Se um dos valores de entrada for zero, deve\r\n"
				+ "ocorrer um erro em uma das opera��es. Fa�a o teste e veja o que acontece. Diga\r\n"
				+ "2\r\n"
				+ "qual das entradas causa o erro, qual a opera��o que falha e por qu�. Depois,\r\n"
				+ "modifique seu c�digo para testar essa condi��o (com if) e evitar que o erro ocorra,\r\n"
				+ "imprimindo uma mensagem que explique ao seu usu�rio como proceder para obter o\r\n"
				+ "resultado correto.\r\n",
//				QUESTAO 17
				"  17: "
				+ "Crie a classe Exercicios. Implemente dentro dela os exerc�cios 2.3, 2.4, 2.5 e 2.6\r\n"
				+ "(p�gina 49), sempre com mensagens em portugu�s.\r\n"
				+ "Tente fazer um c�digo que seja seu, de forma a melhorar a sua experi�ncia de\r\n"
				+ "programa��o. Se depois de uma hora de trabalho voc� perceber que est� travado,\r\n"
				+ "pode consultar as respostas na p�gina seguinte para implementar o c�digo. N�o\r\n"
				+ "fa�a isso antes de tentar ou jogar� fora a chance de aprender.\r\n"
				+ "Lembre-se das dicas no arquivo de orienta��es gerais. L� eu digo que no mercado\r\n"
				+ "de trabalho ningu�m ir� perguntar suas notas. Mas todo mundo ir� saber se voc�\r\n"
				+ "consegue ou n�o programar, simplesmente pelos seus resultados. Isso �\r\n"
				+ "imposs�vel de esconder.\r\n"
				+ "A responsabilidade da escolha � sua. Fa�a uma boa escolha, pelo bem do seu\r\n"
				+ "futuro profissional.",
		};
		
		System.out.println("Quest�o"+ questao[opcao]);
	}

	private void desenhar() {
		System.out.println("####################################################\n");
	}
	
}
