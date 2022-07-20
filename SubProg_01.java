package Lista1;

import java.util.Scanner;

public class Ex_01 {

	public static double VolEsfera(double a) {
		double raio = Math.pow(a, 3);
		return (1.3333 * 3.14159 * raio);
	}
		
	static Scanner s = new Scanner(System.in); //Por que tem quer ser static?
	public static void main(String[] args) {
		System.out.println("Informe o raio da esfera: ");
		double raioEsf = s.nextDouble();
		
		int resultado = (int) VolEsfera(raioEsf);
		System.out.println("O volume da esfera é aproximadamente de: "+resultado);
	}
}
