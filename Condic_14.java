package Lista2;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantos dias de vida você tem? ");
		int dias_totais = s.nextInt();
		
		String msg = "Você tem ";
		
		int totais_anos = dias_totais/365;
		if (totais_anos > 0)	
			msg += (totais_anos +" anos ");
		
		int totais_meses = (dias_totais%365)/30;
		if (totais_meses != 0)
			msg += (totais_meses + " meses ");
		
		int totais_dias = ((dias_totais%365)%30);
		if (totais_dias != 0)
			msg += (totais_dias + " dias");
		
		System.out.println(msg);
		s.close();
	}
}
