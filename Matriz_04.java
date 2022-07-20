package Lista1;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int sp = 0;
		int ss = 0;
		int linss=0;
		int colss=matriz[0].length;
		
		for(int lin=0;lin<matriz.length;lin++) {
			for(int col=0;col<matriz[0].length;col++) {
				System.out.println("Informe um valor: ");
				matriz[lin][col]=s.nextInt();
				if(lin == col) {
					sp+=matriz[lin][col];
				}
				if((lin+col)==(matriz[lin].length-1)) {
					ss+=matriz[lin][col];
				}
			}
		}
		for(int lin=0;lin<matriz.length;lin++) {
			for(int col=0;col<matriz[0].length;col++) {
				System.out.print(matriz[lin][col] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("Ao subtrair a Diagonal Secundária da Diagonal Primária, temos: "+ (sp-ss));
	}

}
