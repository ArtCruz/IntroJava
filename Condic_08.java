package Lista1;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Quanto você tirou na 1ª prova? ");
		double p1 = s.nextDouble();
		System.out.println("Quanto você tirou na 2ª prova? ");
		double p2 = s.nextDouble();
		System.out.println("Quanto você tirou na 3ª prova? ");
		double p3 = s.nextDouble();
		System.out.println("Quanto você tirou na 4ª prova? ");
		double p4 = s.nextDouble();
		
		double media = (p1+p2+p3+p4)/4;
		
		if(media >= 7)	{
			System.out.println("Sua média é " + media);
			System.out.println("Você está - APROVADO -");
			
		}
		if(media < 7) {
			System.out.println("Sua média é " + media);
			System.out.println("\nQual a nota do seu exame? ");
			double exame = s.nextDouble();
			
			double media_final = (media + exame) / 2;
			
			if (media_final >= 5) {
				System.out.println("Sua média é " + media_final);
				System.out.println("Você está - APROVADO -");
			}
			else {
				System.out.println("Sua média é " + media_final);
				System.out.println("Você está - REPROVADO -");
			}
		}
		s.close();
	}
}
