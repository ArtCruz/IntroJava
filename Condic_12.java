package Lista2;

import java.util.Scanner;

public class Ex_02 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantos anos voc� tem? ");
		int idade = s.nextInt();
		
		if (idade == 0)
			System.out.println("Voc� ainda n�o completou um ano ");
		else
			if (idade == 1)
				System.out.println("Voc� tem um ano ");
			else
				if (idade == 2)
					System.out.println("Voc� tem 2 anos ");
				else
					/* 
					 * 
					 * */
					if (idade == 125)
						System.out.println("Voc� tem 125 anos ");
		s.close();
	}
	
	
}
