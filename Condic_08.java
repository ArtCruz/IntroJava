package Lista1;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Quanto voc� tirou na 1� prova? ");
		double p1 = s.nextDouble();
		System.out.println("Quanto voc� tirou na 2� prova? ");
		double p2 = s.nextDouble();
		System.out.println("Quanto voc� tirou na 3� prova? ");
		double p3 = s.nextDouble();
		System.out.println("Quanto voc� tirou na 4� prova? ");
		double p4 = s.nextDouble();
		
		double media = (p1+p2+p3+p4)/4;
		
		if(media >= 7)	{
			System.out.println("Sua m�dia � " + media);
			System.out.println("Voc� est� - APROVADO -");
			
		}
		if(media < 7) {
			System.out.println("Sua m�dia � " + media);
			System.out.println("\nQual a nota do seu exame? ");
			double exame = s.nextDouble();
			
			double media_final = (media + exame) / 2;
			
			if (media_final >= 5) {
				System.out.println("Sua m�dia � " + media_final);
				System.out.println("Voc� est� - APROVADO -");
			}
			else {
				System.out.println("Sua m�dia � " + media_final);
				System.out.println("Voc� est� - REPROVADO -");
			}
		}
		s.close();
	}
}
