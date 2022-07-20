package Lista2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_07 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println("Digite a coordenada do P1: ");
		System.out.println("P1 -> x1: ");
		double x1 = s.nextDouble();
		System.out.println("P1 -> y1:");
		double y1 = s.nextDouble();
		
		System.out.println("Digite a coordenada do P2: ");
		
		System.out.println("P2 -> x2: ");
		double x2 = s.nextDouble();
		System.out.println("P2 -> y2:");
		double y2 = s.nextDouble();
		
		if (x1 > x2) {
			System.out.println("Tais valores não são válidos, pois P1 > P2");
		}
		else {
			double distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
			System.out.println("A distancia entre os dois pontos é "+ df.format(distancia));
		}
		s.close();
	}
	
}
