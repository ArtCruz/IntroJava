package Lista1;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o 1� valor inteiro: ");
		int v1 = s.nextInt();
		System.out.println("Digite o 2� valor inteiro: ");
		int v2 = s.nextInt();
		System.out.println("Digite o 3� valor inteiro: ");
		int v3 = s.nextInt();
		System.out.println("Digite o 4� valor inteiro: ");
		int v4 = s.nextInt();
		
		double media = (v1+v2+v3+v4)/4;
		
		System.out.println("A m�dia dos 4 valores � " + media);
		
		System.out.println("Os valores que s�o maiores que a m�dia s�o: " );
		if(v1 > media) {
			System.out.println(v1);
		}
		if(v2 > media) {
			System.out.println(v2);
		}
		if(v3 > media) {
			System.out.println(v3);
		}
		if(v4 > media) {
			System.out.println(v4);
		}
		s.close();
	}
}
