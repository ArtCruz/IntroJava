package Lista1;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int cont=0;
		
		for(int lin=0;lin<matriz.length;lin++) {
			for(int col=0;col<matriz[lin].length;col++) {
				System.out.println("Informe um valor: ");
				matriz[lin][col]=s.nextInt();
				int div=0;
				for(int numzero=1;numzero<=matriz[lin][col];numzero++) {
					if(matriz[lin][col]%numzero==0)
						div+=1;
				}
				if(div==2)
					cont++;
				}

			}
		for(int lin=0;lin<matriz.length;lin++) {
			for(int col=0;col<matriz[lin].length;col++) {
				System.out.print(matriz[lin][col]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("Nós temos "+cont+" números primos na matriz.");
	}

}
