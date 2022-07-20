package Aula;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");

		double somaGeral = 0;
		int cont = 0;

		System.out.println("Calcular a m�dia de um aluno? S/N");
		String continua = s.next();
		while ( !continua.equalsIgnoreCase("S") && !continua.equalsIgnoreCase("N") ){
			System.out.println("OP��O INVALIDA!!!!!!!!!");
			System.out.println("Informe S/N");
			continua = s.next();
		}


		while(continua.equalsIgnoreCase("S")){
			//calculo de m�dia do aluno
			double soma = 0;
			System.out.println("Informe a quantidade de notas");
			int quant = s.nextInt();
			for (int i = 1; i <= quant; i++){
				System.out.println("Informe a nota " + i);
				double nota = s.nextDouble(); //10
				while (nota < 0 || nota > 10){
					System.out.println("Nota inv�lida!! Informe algo entre 0..10" );
					nota = s.nextDouble();
				}
				soma+= nota;
			}
		double media = soma / quant;

		somaGeral += media;
		cont++;
		System.out.println("A m�dia �: " + df.format(media));
		if (media >= 7 )
			System.out.println("Aprovado!");
		else
			if (media >= 5 )
				System.out.println("Em exame!");
			else
				System.out.println("Reprovado!");
		}


		System.out.println("Calcular mais uma m�dia? S/N");
		continua = s.next(); //x
		while ( !continua.equalsIgnoreCase("S") && !continua.equalsIgnoreCase("N") ){
			System.out.println("OP��O INVALIDA!!!!!!!!!");
			System.out.println("Informe S/N");
			continua = s.next();
		}
		System.out.println("A media geral �: " + df.format(somaGeral/cont));
		System.out.println("FIM DO PROGRAMA");
	}
}