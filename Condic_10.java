package Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ #####0.00");

		//Entradas
		System.out.println("Informe a quantidade de peixes (kg)");
		double peso = s.nextDouble();

		if (peso > 500) {
		double multa = (peso - 500) * 4;
		System.out.println("Sua multa é " + df.format(multa));
		}
		else
		System.out.println("Vc não tem multa");

		System.out.println("Fim");
		s.close();
		}

}