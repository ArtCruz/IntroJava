package Lista1;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Escreva um n�mero inteiro entre 1 e 7 e eu direi seu dia da semana correspondente.");
		int dia = s.nextInt();
		
		if(dia == 1) {
			System.out.println("O dia " + dia + " � Domingo");			
		}
		else
			if(dia == 2) {
				System.out.println("O dia " + dia + " � Segunda-Feira");
			}
			else
				if(dia == 3) {
					System.out.println("O dia " + dia + " � Ter�a-Feira");
				}
				else
					if(dia == 4) {
						System.out.println("O dia " + dia + " � Quarta-Feira");
					}
					else
						if(dia == 5) {
							System.out.println("O dia " + dia + " � Quinta-Feira");
						}
						else
							if(dia == 6) {
								System.out.println("O dia " + dia + " � Sexta-Feira");
							}
							else
								if(dia == 7) {
									System.out.println("O dia " + dia + " � S�bado");
								}
								else{
									System.out.println("N�o existe um dia da semana com esse n�mero");
								}
		
		s.close();
	}

}
