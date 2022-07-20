package Lista1;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Calculador de Índice de Massa Corporal");
		
		System.out.println("\nQual o seu peso(kg)? ");
		double peso =s.nextDouble();
		
		System.out.println("Qual a sua altura (metros)? ");
		double altura = s.nextDouble();
		
		double imc = peso / (altura * altura);
		
		//Formatar o IMC para duas casas decimais
		String resultado = String.format("%.2f", imc);
		
		if (imc < 20) {
			System.out.println("Seu IMC foi de : " + resultado);
			System.out.println("Você está - ABAIXO DO PESO -");
		}
		else
			if (imc < 25) {
				System.out.println("Seu IMC foi de : " + resultado);
				System.out.println("Você está com - PESO NORMAL -");
			}
			else
				if (imc < 30) {
					System.out.println("Seu IMC foi de : " + resultado);
					System.out.println("Você está com - SOBRE PESO -");			
				}
				else
					if (imc < 40) {
						System.out.println("Seu IMC foi de : " + resultado);
						System.out.println("Você está - OBESO -");			
					}
					else
						if (imc >= 40) {
							System.out.println("Seu IMC foi de : " + resultado);
							System.out.println("Você está com - OBESIDADE MORBIDA -");
						}
		s.close();
	}

}
