package Lista1;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] matriz=new int[3][3];
		int maior = 0;
		int menor = 0;
		int cont = 0;
		
		for(int lin = 0;lin<matriz.length;lin++) {
			for(int col = 0;col<matriz[0].length;col++) {
				System.out.println("Informe uma valor: ");
				matriz[lin][col] = s.nextInt();
				if (cont==0) {
					maior=matriz[lin][col];
					menor=matriz[lin][col];
				}
				if(matriz[lin][col]>maior)
					maior = matriz[lin][col];
				if(matriz[lin][col]<menor)
					menor = matriz[lin][col];
				cont++;
			}
		}
		
		for(int lin = 0;lin<matriz.length;lin++) {
			for(int col = 0;col<matriz[0].length;col++) {
				System.out.print(matriz[lin][col]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println("O maior valor é "+maior);
		System.out.println("O menor valor é "+menor);
	}

}
