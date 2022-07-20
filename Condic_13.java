package Lista2;

import java.util.Scanner;

public class Ex_03 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Me informe quantos anos, meses e dias de vida você tem: ");
		
		System.out.println("Anos: ");
		int ano = s.nextInt();
		
		System.out.println("Meses: ");
		int meses = s.nextInt();
		
		if (meses > 11)
			System.out.println("Dados dos meses estão incoerentes");
		else {
			System.out.println("Dias: ");
			int dias = s.nextInt();
			
			if (dias > 30)
				System.out.println("Dados dos dias estão incoerentes");
			else {
				int dias_totais = (ano*365)+(meses*30)+dias;
				
				System.out.println("Você viveu " + dias_totais + " dias");
				
			}
		}
		s.close();
	}
	
}
