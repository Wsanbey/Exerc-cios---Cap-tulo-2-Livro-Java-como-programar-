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
				+ "Crie um projeto no Eclipse segundo o seguinte tutorial. Descreva sua experiência.\r\n"
				+ "Você pode usar o tutorial disponível no ava.\r\n"
				+ "a. Crie um pacote \"capitulo_02\" no seu projeto e coloque todas as classes\r\n"
				+ "deste exercício dentro dele. Pode usar o tutorial em vídeo do ava, que mostra\r\n"
				+ "como fazer.\r\n",
//				QUESTAO 2				
				" 2: "
				+ "Explique em linhas gerais o que você compreendeu sobre o exemplo da figura 2.1\r\n"
				+ "na página 28. Quantas classes e métodos você vê?\r\n",
//				QUESTAO 3
				" 3: "
				+ "Execute o código da figura 2.1 e observe a saída. Explique o que você precisou\r\n"
				+ "fazer para compilar e executar o código.\r\n",
//				QUESTAO 4
				" 4: "
				+ "Modifique o código comentando a linha 9. Depois se inspire nela para imprimir:\r\n"
				+ "a. O texto \"Bem-vindo, \"\r\n"
				+ "b. Seu nome e matrícula\r\n"
				+ "c. o texto \" ! Saudações!\"\r\n"
				+ "d. Uma quebra de linha.\r\n"
				+ "e. Use os métodos \"print()\" e \"println()\", até a próxima orientação sobre\r\n"
				+ "métodos. Lá na frente usaremos printf.\r\n"
				+ "f. Use uma linha diferente de código para cada item.\r\n",
//				QUESTAO 5
				"  5: "
				+ "Insira uma nova linha de código que imprime outra cópia do mesmo texto, mas\r\n"
				+ "agora utilize um único objeto String. Ou seja, seu texto vai todo entre \"\".",
//				QUESTAO 6
				"  6: "
				+ "Insira uma nova linha de código que imprime outra cópia do mesmo texto, mas\r\n"
				+ "agora cada palavra vai em uma linha diferente. Utilize um único objeto String. Ou\r\n"
				+ "seja, seu texto vai todo entre \"\". Se inspire no código da figura 2.4.\r\n",
//				QUESTAO 7
				"  7: "
				+ "Insira um novo conjunto de linhas, baseado nas suas respostas anteriores. Imprima\r\n"
				+ "o mesmo texto do item 3) (não do item 4), ok?) , mas dessa vez insira um caractere\r\n"
				+ "1\r\n"
				+ "de tabulação antes de cada linha. Cada palavra inserida vai em uma linha diferente.\r\n"
				+ "Veja a figura 2.5 para ajudar.",
//				QUESTAO 8
				"  8: "
				+ "Crie um novo bloco de código inspirado no anterior. Faça sua saída da questão\r\n"
				+ "anterior apresentar o mesmo texto, porém desta vez inclua na sua saída aspas\r\n"
				+ "duplas. Cuidado com as seqüências de escape.\r\n"
				+ "Use os dois caracteres \\\" dentro de seu texto para obter este efeito.\r\n",
//				QUESTAO 9
				"  9: "
				+ "Crie quatro variáveis do tipo String, para seu nome, sua matrícula, a data/hora em\r\n"
				+ "que você está programando agora e mais outro texto qualquer que você escolheu\r\n"
				+ "livremente (não vale a string vazia). Refaça o código em 4)3) usando essas variáveis,mas execute sua impressão com o\r\n"
				+ "System.out.printf.",
//				QUESTAO 10
				"  10: "
				+ "Execute o código da figura 2.7, página 36, traduzindo par o português os textos que\r\n"
				+ "são impressos. Explique como o programa funciona do ponto de vista do usuário (o\r\n"
				+ "programa faz isso, depois aquilo...). Descreva o que aconteceu em poucas linhas.\r\n"
				+ "Note que aqui você terá que criar uma nova classe no seu projeto, então as\r\n"
				+ "respostas irão no arquivo desta nova classe.",
//				QUESTAO 11
				"  11: "
				+ "Explique em detalhes a linha 11 da figura 2.7, indicando exatamente o que acontece\r\n"
				+ "ali, que código está executando e como os objetos envolvidos trabalham em\r\n"
				+ "conjunto.",
//				QUESTAO 12
				"  12: "
				+ "Comente a linha 3, tente compilar e observe o que acontece. O que ocorre com a\r\n"
				+ "linha 11? Por que isto ocorre? Qual o papel da linha 3?",
//				QUESTAO 13
				"  13: "
				+ "Execute o código da figura 2.15 (nova classe aqui!), passando inteiros para cada\r\n"
				+ "entrada. Traduza as mensagens de saída nas linhas 17 e 20. Explique o que ele faz\r\n"
				+ "em duas ou 3 linhas (por favor: comentários no código, antes da classe).",
//				QUESTAO 14
				"  14: "
				+ "Modifique o código para adicionar impressões ao final. A saída deve usar printf e\r\n"
				+ "deve mostrar, em cada linha separada: a soma, a subtração, a multiplicação, a\r\n"
				+ "divisão e também o resto da divisão inteira entre os dois valores.\r\n"
				+ "Exemplo de formato:\r\n"
				+ "\"A soma de 12 e 3 é 15\"\r\n"
				+ "Ou então\r\n"
				+ "\"O resultado 12 + 3 => 15, uhú! funciona esse treco!\".\r\n"
				+ "Sinta-se livre para mexer no texto de saída, mas garanta que os valores\r\n"
				+ "estão corretos.\r\n",
//				QUESTAO 15
				"  15: "
				+ "Execute o código da questão anterior, mas quando o programa pedir entrada, digite\r\n"
				+ "letras ao invés de números. Explique o que ocorre com seu código.",
//				QUESTAO 16
				"  16: "
				+ " Execute o código da questão anterior. Se um dos valores de entrada for zero, deve\r\n"
				+ "ocorrer um erro em uma das operações. Faça o teste e veja o que acontece. Diga\r\n"
				+ "2\r\n"
				+ "qual das entradas causa o erro, qual a operação que falha e por quê. Depois,\r\n"
				+ "modifique seu código para testar essa condição (com if) e evitar que o erro ocorra,\r\n"
				+ "imprimindo uma mensagem que explique ao seu usuário como proceder para obter o\r\n"
				+ "resultado correto.\r\n",
//				QUESTAO 17
				"  17: "
				+ "Crie a classe Exercicios. Implemente dentro dela os exercícios 2.3, 2.4, 2.5 e 2.6\r\n"
				+ "(página 49), sempre com mensagens em português.\r\n"
				+ "Tente fazer um código que seja seu, de forma a melhorar a sua experiência de\r\n"
				+ "programação. Se depois de uma hora de trabalho você perceber que está travado,\r\n"
				+ "pode consultar as respostas na página seguinte para implementar o código. Não\r\n"
				+ "faça isso antes de tentar ou jogará fora a chance de aprender.\r\n"
				+ "Lembre-se das dicas no arquivo de orientações gerais. Lá eu digo que no mercado\r\n"
				+ "de trabalho ninguém irá perguntar suas notas. Mas todo mundo irá saber se você\r\n"
				+ "consegue ou não programar, simplesmente pelos seus resultados. Isso é\r\n"
				+ "impossível de esconder.\r\n"
				+ "A responsabilidade da escolha é sua. Faça uma boa escolha, pelo bem do seu\r\n"
				+ "futuro profissional.",
		};
		
		System.out.println("Questão"+ questao[opcao]);
	}

	private void desenhar() {
		System.out.println("####################################################\n");
	}
	
}
