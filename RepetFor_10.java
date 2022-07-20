package Lista1;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		
		int negativos = 0;
		for (int i = 1; i < 6; i++) {
			System.out.println("Me diga um número: ");
			double num = s.nextDouble();
			
			if (num < 0)
				negativos += 1;
		}	
		
		System.out.println("Foram passados " + negativos + " números negativos");
		s.close();
	}

}
