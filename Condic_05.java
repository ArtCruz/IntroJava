package Lista1;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		// Entradas
		System.out.println("Informe o seu prato principal OPÇÕES:)");
		System.out.println("[1]Vegetariano [2]Peixe [3]Frango [4]Carne");
		int prato = s.nextInt();

		System.out.println("Informe a sua opção de sobremesa OPÇÕES:)");
		System.out.println("[1]Abacaxi [2]Sorvete Diet [3]Mousse Diet [4]Mousse Chocolate");
		int sobremesa = s.nextInt();

		System.out.println("Informe a sua opção de bebida OPÇÕES:)");
		System.out.println("[1]Cha [2]Suco Laranja [3]Suco Melão [4]Refri Diet");
		int bebida = s.nextInt();

		int totalCalorias = 0;
		switch (prato) {
			case 1:
				totalCalorias = 180;
				break;
			case 2:
				totalCalorias = 230;
				break;
			case 3:
				totalCalorias = 250;
				break;
			case 4:
				totalCalorias = 350;
				break;
			default:
				System.out.println("Vc escolheu uma opção invalida!!!");
			}

		switch(sobremesa) {
			case 1:
				totalCalorias += 75;
				break;
			case 2:
				totalCalorias += 110;
				break;
			case 3:
				totalCalorias += 170;
				break;
			case 4:
				totalCalorias += 200;
				break;
			default:
				System.out.println("Vc escolheu uma opção invalida!!!");
			}

		switch (bebida) {
			case 1:
				totalCalorias = totalCalorias + 20;
				break;
			case 2:
				totalCalorias = totalCalorias + 70;
				break;
			case 3:
				totalCalorias = totalCalorias + 100;
				break;
			case 4:
				totalCalorias = totalCalorias + 65;
				break;
			default:
			System.out.println("Vc escolheu uma opção invalida!!!");
		}

		System.out.println("Vc consumiu " + totalCalorias + " calorias");
		System.out.println("Fim");
		s.close();
	}

}