package Lista1;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Calculador de �ndice de Massa Corporal");
		
		System.out.println("\nQual o seu peso(kg)? ");
		double peso =s.nextDouble();
		
		System.out.println("Qual a sua altura (metros)? ");
		double altura = s.nextDouble();
		
		double imc = peso / (altura * altura);
		
		//Formatar o IMC para duas casas decimais
		String resultado = String.format("%.2f", imc);
		
		if (imc < 20) {
			System.out.println("Seu IMC foi de : " + resultado);
			System.out.println("Voc� est� - ABAIXO DO PESO -");
		}
		else
			if (imc < 25) {
				System.out.println("Seu IMC foi de : " + resultado);
				System.out.println("Voc� est� com - PESO NORMAL -");
			}
			else
				if (imc < 30) {
					System.out.println("Seu IMC foi de : " + resultado);
					System.out.println("Voc� est� com - SOBRE PESO -");			
				}
				else
					if (imc < 40) {
						System.out.println("Seu IMC foi de : " + resultado);
						System.out.println("Voc� est� - OBESO -");			
					}
					else
						if (imc >= 40) {
							System.out.println("Seu IMC foi de : " + resultado);
							System.out.println("Voc� est� com - OBESIDADE MORBIDA -");
						}
		s.close();
	}

}
