package Lista1;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] listaA =new int[5];
		int[] listaB =new int[5];
		int[] listaC =new int[10];
		
		for(int i = 0;i<listaA.length;i++) {
			System.out.println("Informe os valores para a lista A: ");
			listaA[i] = s.nextInt();
		}
		for(int i = 0;i<listaA.length;i++) {
			System.out.println("Informe os valores para a lista B: ");
			listaB[i] = s.nextInt();
		}
		for(int i=0;i<listaC.length;i++){
			if(i%2!=0) 
				listaC[i] = listaB[i/2];
			if(i%2==0) 
				listaC[i] = listaA[i/2];
		}
		for(int i=0;i<listaC.length;i++){
			System.out.println(listaC[i]);
		}
		s.close();
	} 
}
