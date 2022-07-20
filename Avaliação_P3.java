package P3;

import java.util.Scanner;

public class P3final {
	public static void Lista_numperfs(int[][] matriz){
		int[] lista_numperfs = new int[25];
		int num_perfs=0;
		int cont=0;
		
		
		for(int lin= 0;lin<matriz.length;lin++) {
			for(int col= 0;col<matriz[lin].length;col++) {
				int div=0;
				for(int x=1;x<matriz[lin][col];x++) {
					if(matriz[lin][col]%x==0) {
						div+=x;
					}	
				}
				boolean rep= false;
				if(div==matriz[lin][col]) {
					for(int y=0;y<lista_numperfs.length;y++)
						if(div==lista_numperfs[y])
							rep=true;
					if(rep==false) {
						if(cont==0) {
							lista_numperfs[cont]=div;
							cont+=1;
						}
						else if(cont>0) {
							lista_numperfs[cont]=div;
							cont+=1;							
						}
					}
				}
			}
		}		

		int num_zeros=0;
		for(int i=1;i<lista_numperfs.length;i++) {
			if(lista_numperfs[i-1]!=0)
				System.out.println(lista_numperfs[i-1]);
			else
				num_zeros+=1;
				if(num_zeros==24)
					System.out.println("Não há numeros perfeitos nessa matriz");
		}
	}
	
	public static void main(String[] args) {
		int matriz[][]= new int[5][5];
		Scanner s =new Scanner(System.in);
		
		for(int lin= 0;lin<matriz.length;lin++) {
			for(int col= 0;col<matriz[lin].length;col++) {
				System.out.println("Informe o número para a linha: "+lin+" e coluna: "+col);
				matriz[lin][col]=s.nextInt();
			}
		}
		Lista_numperfs(matriz);
	}
}
