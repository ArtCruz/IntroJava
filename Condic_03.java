package Lista1;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Me informe o seu Saldo M�dio do ano passado: ");
		double saldo = s.nextDouble();
		
		if (saldo<=500) {
			System.out.println("Voc� n�o tem direito a nenhum cr�dito");
		}
		else
			if(saldo >= 501 && saldo<= 1000) {
				System.out.println("O seu saldo m�dio � de: R$" + saldo);
				double credito = saldo * 0.3;
				System.out.println("O valor do seu cr�dito � de: R$" + credito);
			}
			else
				if(saldo >= 1001 && saldo <= 3000) {
					System.out.println("O seu saldo m�dio � de: R$" + saldo);
					double credito = saldo * 044;
					System.out.println("O valor do seu cr�dito � de: R$" + credito);
				}
				else
					if(saldo >= 3001) {
						System.out.println("O seu saldo m�dio � de: R$" + saldo);
						double credito = saldo * 0.5;
						System.out.println("O valor do seu cr�dito � de: R$" + credito);
					}
		s.close();
	}

}
