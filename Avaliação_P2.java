package P2;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		   Scanner s=new Scanner(System.in);
		   int[][] matriz=new int[6][6];
		   int[][] matrizpri=new int[3][3];
		   int[][] matrizsec=new int[3][3];
		   int soma=0;
		   
		   for(int lin=0;lin<matriz.length;lin++) {
			   for(int col=0;col<matriz[lin].length;col++){
				   System.out.println("Informe um valor: ");
				   matriz[lin][col]=s.nextInt();
				   if(lin<=2 && col<=2) 
					   matrizpri[lin][col]=matriz[lin][col];
				   if(lin>=3 && col>=3) 
					   matrizsec[(lin-3)][(col-3)]=matriz[lin][col];
			   }
		   }
		   for(int lin=0;lin<matrizpri.length;lin++) {
			   for(int col=0;col<matrizpri[lin].length;col++){
				   soma+=matrizpri[lin][col];
			   }
		   }
		   for(int lin=0;lin<matrizsec.length;lin++) {
			   for(int col=0;col<matrizsec[lin].length;col++){
				   soma+=matrizsec[lin][col];
			   }
		   }
		   System.out.println("A soma dos quadrantes pré-definidos é: "+soma);
		}

}