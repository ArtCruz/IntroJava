package Lista1;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Escreva um número inteiro entre 1 e 7 e eu direi seu dia da semana correspondente.");
		int dia = s.nextInt();
		
		if(dia == 1) {
			System.out.println("O dia " + dia + " é Domingo");			
		}
		else
			if(dia == 2) {
				System.out.println("O dia " + dia + " é Segunda-Feira");
			}
			else
				if(dia == 3) {
					System.out.println("O dia " + dia + " é Terça-Feira");
				}
				else
					if(dia == 4) {
						System.out.println("O dia " + dia + " é Quarta-Feira");
					}
					else
						if(dia == 5) {
							System.out.println("O dia " + dia + " é Quinta-Feira");
						}
						else
							if(dia == 6) {
								System.out.println("O dia " + dia + " é Sexta-Feira");
							}
							else
								if(dia == 7) {
									System.out.println("O dia " + dia + " é Sábado");
								}
								else{
									System.out.println("Não existe um dia da semana com esse número");
								}
		
		s.close();
	}

}
