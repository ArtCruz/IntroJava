package Aula;

import java.util.Scanner;

public class Aula {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] [] matriz = new int[5][5];//Criasse uma matriz com[5] linhas e [5] colunas
		
		matriz[0] [4] = 9;
		
		for(int lin = 0;lin<matriz.length; lin++) {
			for(int col = 0; col<matriz[0].length;col++) {
				System.out.println("Informe um valor inteiro: ");
				matriz[lin][col]=s.nextInt();
			}
		}
		for(int lin = 0;lin<matriz.length; lin++) {
			for(int col = 0; col<matriz[0].length;col++) {
				System.out.print(matriz[lin][col]+" ");//Imprimir mas continuar na mesma linha
			}
			System.out.println("");//Imprimir para pular de linha
		}
	}
}
