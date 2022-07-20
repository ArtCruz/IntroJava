package Repetição;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Entrou no for");
			System.out.println(i);
		}
		double soma = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe nota " + i);
			 double nota = s.nextDouble();
			 soma += nota;
		}
		double media = soma/5;
		
		System.out.println("Sua média é: " + df.format(media));
		
	}

}
