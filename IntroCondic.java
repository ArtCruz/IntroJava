package condicionais;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe a NOTA 1: ");
		double nota1 = s.nextDouble();
		System.out.println("Informe a NOTA 2: ");
		double nota2 = s.nextDouble();
		System.out.println("Informe a NOTA 3: ");
		double nota3 = s.nextDouble();
		
		/*Decis�o: se o aluno est� em exame, est� reprovado ou est� aprovado
		*Regras: media >= 7 - Aprovado
		*		 media < 5 - Reprovado
		*		 media >= 5 e media < 7 - Em Exame
		*/
		System.out.println("Qual o tipo de media vc quer calcular? ");
		System.out.println("Digite [A] Aritm�tica ou Digite [P] Ponderada");
		String op�ao = s.next();//nextString() s� que n�o se bota o String pq j� foi especificado
		
		double media = 0;//Se n�o tivermos essa linha mostrando para o codigo 
		// a variavel media n�o ser� "existente para todo o codigo" pq ela
		// s� fica dentro dos if's
		
		if (op�ao.equalsIgnoreCase("A")) { //IMPORTANTE
			//Calcula m�dia aritm�tica	
			media = (nota1 + nota2 + nota3) / 3;
		}
		if (op�ao.equalsIgnoreCase("P")) {
			//Calcula m�dia ponderada
			System.out.println("Digite o peso da NOTA 1: ");
			double peso1 = s.nextDouble();
			System.out.println("Digite o peso da NOTA 2: ");
			double peso2 = s.nextDouble();
			System.out.println("Digite o peso da NOTA 3: ");
			double peso3 = s.nextDouble();
			
			media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
		}		
		
		
		if (media >= 7) {
			System.out.println("Aprovado com m�dia: " + media);
		}
		else	
			if (media < 5) {
				System.out.println("Reprovado com m�dia: " + media);
			}
			else
				if (media >= 5 && media < 7) {// Esse if poderia ser excluido
					System.out.println("Em exame com m�dia: " + media);
		/*  E == &&
		 * V && V = V
		 * V && F = F
		 * F && V = F
		 * F && F - F
		 * 
		 * OU == ||
		 * V || V = V
		 * V || F = V
		 * F || V = V
		 * F || F - F
		 * */
				}
		s.close();
			}

}
