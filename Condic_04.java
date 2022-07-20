package Lista1;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Descubra sua classe eleitoral");
		System.out.println("\nQual a sua idade? ");
		double idade = s.nextDouble();
		
		if (idade >= 18 && idade < 65) {
			System.out.println("Você é um - ELEITOR OBRIGATÓRIO -");		
		}
		else
			if(idade < 16) {
				System.out.println("Você - NÃO É UM ELEITOR -");
			}
			else {
				System.out.println("Você é um - ELEITOR FACULTATIVO -");
			}
		s.close();
	}

}
