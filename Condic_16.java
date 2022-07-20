package Lista2;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe a medida do cateto adjacente: ");
		double ca = s.nextDouble();
		System.out.println("Informe a medida do cateto oposto: ");
		double co = s.nextDouble();
		System.out.println("Informe a medida da hipotenusa: ");
		double hip = s.nextDouble();
		
		if (Math.pow(hip, 2) == Math.pow(ca, 2)+Math.pow(co, 2)) {
			System.out.println("É possivel formar um triângulo retângulo com tais medidas");
		}
		else {
			System.out.println("Não é possível formar um triângulo com tais medidas");
		}
		s.close();
	}

}
