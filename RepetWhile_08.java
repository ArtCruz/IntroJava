package Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.##");
		
		boolean cont = true;
		int lucro_menor = 0;
		int lucro_entre = 0;
		int lucro_mais = 0;
		double total_compra = 0;
		double total_venda = 0;
		double lucro_total = 0;
		int produtos = 0;
		
		while(cont == true) {
			System.out.println("Você gostaria de inserir mais um produto? S/N");
			String more = s.next();
			while(!more.equalsIgnoreCase("S") && !more.equalsIgnoreCase("N")) {
				System.out.println("Opção Inválida!!!");
				System.out.println("Informe S/N");
				more = s.next();
			}
			if(more.equalsIgnoreCase("S")){
				System.out.println("Qual o nome do produto? ");
				String nome = s.next();
				System.out.println("Qual o preço de compra? ");
				double compra = s.nextDouble();
				total_compra += compra;
				System.out.println("Qual o preço de venda? ");
				double venda = s.nextDouble();
				total_venda += venda;
				produtos++;
				
				double  lucro = ((venda * 100) / compra) - 100;
				lucro_total += lucro;
				
				if(lucro < 10) {
					lucro_menor ++;
				}
				if(lucro >= 10 && lucro <= 20) {
					lucro_entre ++;
				}
				if(lucro > 20) {
					lucro_mais ++;
				}
			}
			if(more.equalsIgnoreCase("N")) 
				cont = false;
		}
		System.out.println("De " + produtos + " produtos informados: ");
		if(lucro_menor != 0)
			System.out.println(lucro_menor + " tinham menos de 10% de lucro");
		if(lucro_entre != 0)
			System.out.println(lucro_entre + " tinham entre 10% e 20% de lucro");
		if(lucro_entre != 0)
			System.out.println(lucro_mais + " tinham mais de 20% de lucro");
		System.out.println("O valor total de compra foi de: " + total_compra);
		System.out.println("O valor total de venda foi de: " + total_venda);
		System.out.println("O lucro total foi de: " + df.format(lucro_total)+"%");
		System.out.println("Fim do Programa!");

	}

}
