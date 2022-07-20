package Lista1;

import java.util.Scanner;
import java.lang.Math;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = 1000;
		while(num >=1000 && num<= 9999) {
			int quociente = num / 100;
			int resto = num % 100;
			int num_quad = quociente + resto;
			if(num_quad * num_quad == num )
				System.out.println("O número " + num + " tem essa propriedade.");
			num++;
		
			
		}

	}

}
