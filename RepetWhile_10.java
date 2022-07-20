package Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");

		int maiorConsumo = -1;
		int menorConsumo = 999999999;
		int totalRes = 0;
		int totalCom = 0;
		int totalInd = 0;
		int cont = 0;

		//Entrada

		System.out.println("Qual o valor do Kw/hora?");
		double precoKw = s.nextDouble();

		System.out.println("Calcular consumo? S/N");
		String continua = s.next();

		while (continua.equalsIgnoreCase("S")){
			//Processamento mais um consumidor
			System.out.println("Informe o tipo de consumidor [1]Residencial [2]Comercial [3]Industrial");
			int tipo = s.nextInt();
	
			System.out.println("Informe quantidade de Kw consumidos");
			int consumokw = s.nextInt();
	
			double conta = consumokw * precoKw;
			System.out.println("Valor da conta a pagar: " + df.format(conta));
	
			if (consumokw > maiorConsumo)
				maiorConsumo = consumokw;
	
			if (consumokw < menorConsumo)
				menorConsumo = consumokw;
	
			switch (tipo){
			case 1: totalRes += consumokw;
				break;
			case 2: totalCom += consumokw;
				break;
			case 3: totalInd += consumokw;
				break;
	
			}
			cont++;
	
			System.out.println("Calcular consumo? S/N");
			continua = s.next();
			}

		//Saida - escrever curso com maior índice
		System.out.println("Maior consumo (Kw):" + maiorConsumo);
		System.out.println("Menor consumo (Kw):" + menorConsumo);
		System.out.println("Consumo da classe residencial (Kw):" + totalRes);
		System.out.println("Consumo da classe comercial (Kw):" + totalCom);
		System.out.println("Consumo da classe industrial (Kw):" + totalInd);
		System.out.println("Media geral de consumo(Kw):" + df.format((totalRes + totalCom + totalInd)/ cont));
	}

}
