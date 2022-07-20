package Lista1;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		double media_pos = 0;
		int val_nega = 0;
		int val_entre = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um valor inteiro: ");
			int num = s.nextInt();
			
			if (num > 0)
				media_pos += num;
			if (num < 0)
				val_nega += 1;
			if(5 <= num && num <= 50)
				val_entre += 1; 
						
					
		}
		System.out.println("A média dos valores positivos é " + media_pos/(10 - val_nega));
		System.out.println("Existem " + val_nega + " valores negativos");
		System.out.println("Existem " + val_entre + " valores entre 5 e 50");
		s.close();
	}

}
