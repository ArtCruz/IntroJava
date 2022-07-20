package Lista2;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a Nota 1:");
		double n1 = s.nextDouble();
		System.out.println("Digite a Nota 2:");
		double n2 = s.nextDouble();
		System.out.println("Digite a Nota 3:");
		double n3 = s.nextDouble();
		
		System.out.println("Você quer média Aritmética[A] ou Ponderada[P]? ");
		String answer = s.next();
		
		if (answer.equalsIgnoreCase("P")) {
			System.out.println("Digite o Peso1:");
			double p1 = s.nextDouble();
			System.out.println("Digite o Peso 2:");
			double p2 = s.nextDouble();
			System.out.println("Digite o Peso 3:");
			double p3 = s.nextDouble();
			
			double media = ((p1*n1)+(p2*n2)+(p3*n3))/(p1+p2+p3);
			
			System.out.println("A sua média é de " + media);
		}
		if (answer.equalsIgnoreCase("A")) {
			double media = (n1 + n2 + n3)/3;
			
			System.out.println("A sua média é de " + media);
				}
		s.close();
	}

}
