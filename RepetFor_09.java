package Lista1;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Que número vc quer ver a tabuada? ");
		int num = s.nextInt();
		
		int digit = 1;
		
		for(; digit <= 10; digit++) {
			System.out.println(num + " X " + digit + " = " + num*digit);
		}
		
		s.close();
	}

}
