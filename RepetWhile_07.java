package Lista1;

import java.text.DecimalFormat;

public class Ex_02 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#00.0");

		double F = 50;
			while (F <= 150){
				double C = 5f/9f * (F -32);
				System.out.println(F + " graus Farheneit = " + df.format(C)+ " graus celsius");
				F++; //F+=1; F = F + 1;
			}

		}

}