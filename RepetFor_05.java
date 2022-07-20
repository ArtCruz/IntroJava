package Lista1;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num_pos = 0;
		int num_neg = 0;
		int num_nul = 0;
		
		for (int i =1;i <= 20;i++) {
			System.out.println("Me informe um valor inteiro: ");
			int valor = s.nextInt();
			if (valor<0)
				num_neg += 1;
			
			if (valor>0)
				num_pos += 1;
			if (valor==0)
				num_nul += 1;
			
		}
		
		double tot_neg = (num_neg * 5);
		double tot_pos = (num_pos * 5);
		double tot_nul = (num_nul * 5);
		
		System.out.println("A porcentagem de valores negativos é " + tot_neg + "%");
		System.out.println("A porcentagem de valores positivos é " + tot_pos + "%");
		System.out.println("A porcentagem de valores nulos é " + tot_nul + "%");
	}
}
