import java.util.Scanner;

import RespostasERespostas.Perguntas;
import RespostasERespostas.Respostas;


/**
 * 
 */

/**
 * @author ALUNO
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Respostas resposta = new Respostas();
		Perguntas mostrar = new Perguntas();
				
		int opcaoQuestionario;
		int alerta = 0;
		
		System.out.println("\"Bem vindo a lista de exercicios de LPOO do livro Como programar em java 10ª edição.\n");
		System.out.println("Estou disponibilizando duas formas de verificação das perguntas e respostas ");
		System.out.println("Digitando 1 você vera as perguntas e resposta em seguencia\n");
		System.out.println("Digitando 2 você tera acesso as questões uma por uma");
		
		//testar saidas
		resposta.Questao10();
		
		
		opcaoQuestionario = sc.nextInt();	
//		ATOMATIZANDO
//		opcaoQuestionario = 1;
		
		while(opcaoQuestionario > 0 || opcaoQuestionario < 2 ) { 
			
			switch(opcaoQuestionario){
				
			case 1: 
				mostrar.ExibirTodasQuestoes();
//				 
				break;
				
			case 2:
				
//				 
				break;
				
			default: 
				
				if(alerta < 2) {
					System.out.println("Infomação invalida");
					
					alerta++;
				}else{
					System.out.println(" Ho céus!");
					
					alerta = 0;
				} 
			}
			
			opcaoQuestionario = sc.nextInt();
		}
		
	}

}
