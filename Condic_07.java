package Lista1;

import java.util.Scanner;
public class Ex_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Me diga um número inteiro e eu direi se é PAR ou IMPAR");
		int num = s.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O número " + num + " é PAR");
		}
		else {
			System.out.println("O número " + num + " é IMPAR");
		}
		s.close();
	}

}
