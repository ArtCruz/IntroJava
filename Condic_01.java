package Lista1;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		double digit = s.nextDouble();
		
		//V�riaveis de divisores
		boolean div_dez = false;
		boolean div_cinco = false;
		boolean div_dois = false;
		
		//Tirar o '.0' no final do digit
		String resultado = String.format("%.0f", digit);
		
		if(digit % 10 == 0) {
			div_dez = true;
			System.out.println("O n�mero " + resultado + " � divisivel por 10");			
		}
		if(digit % 5 == 0) {
			div_cinco = true;
			System.out.println("O n�mero " + resultado + " � divis�vel por 5");
		}
		if(digit % 2 == 0) {
			div_dois = true;
			System.out.println("O n�mero " + resultado + " � divis�vel por 2");
		}
		if(div_dez == false && div_cinco == false && div_dois == false) {
			System.out.println("O n�mero " + resultado + " n�o � divis�vel por 10, 5 ou 2");
		}
		s.close();	
		}
	}

