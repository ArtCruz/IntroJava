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
		
		/*Decisão: se o aluno está em exame, está reprovado ou está aprovado
		*Regras: media >= 7 - Aprovado
		*		 media < 5 - Reprovado
		*		 media >= 5 e media < 7 - Em Exame
		*/
		System.out.println("Qual o tipo de media vc quer calcular? ");
		System.out.println("Digite [A] Aritmética ou Digite [P] Ponderada");
		String opçao = s.next();//nextString() só que não se bota o String pq já foi especificado
		
		double media = 0;//Se não tivermos essa linha mostrando para o codigo 
		// a variavel media não será "existente para todo o codigo" pq ela
		// só fica dentro dos if's
		
		if (opçao.equalsIgnoreCase("A")) { //IMPORTANTE
			//Calcula média aritmética	
			media = (nota1 + nota2 + nota3) / 3;
		}
		if (opçao.equalsIgnoreCase("P")) {
			//Calcula média ponderada
			System.out.println("Digite o peso da NOTA 1: ");
			double peso1 = s.nextDouble();
			System.out.println("Digite o peso da NOTA 2: ");
			double peso2 = s.nextDouble();
			System.out.println("Digite o peso da NOTA 3: ");
			double peso3 = s.nextDouble();
			
			media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
		}		
		
		
		if (media >= 7) {
			System.out.println("Aprovado com média: " + media);
		}
		else	
			if (media < 5) {
				System.out.println("Reprovado com média: " + media);
			}
			else
				if (media >= 5 && media < 7) {// Esse if poderia ser excluido
					System.out.println("Em exame com média: " + media);
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
