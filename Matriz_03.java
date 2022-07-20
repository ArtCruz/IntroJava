package Lista1;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int matrizA[][]=new int[3][3];
		int matrizB[][]=new int[3][3];
		int soma=0;
		
		for(int lin=0;lin<matrizA.length;lin++) {
			for(int col=0;col<matrizA.length;col++) {
				System.out.println("Informe um valor para a matrizA: ");
				matrizA[lin][col] = s.nextInt();
				soma+= matrizA[lin][col];
			}
		}
		
		for(int lin=0;lin<matrizB.length;lin++) {
			for(int col=0;col<matrizB.length;col++) {
				System.out.println("Informe um valor para a matrizB: ");
				matrizB[lin][col] = s.nextInt();
				soma+= matrizB[lin][col];
			}
		}
		
		System.out.println("A soma de todos os valores é: "+soma);
	}


}
