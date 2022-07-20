package Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex_04 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");

		int maiorIndice = -1;
		int maiorCur = 0;

		//Entrada
		System.out.println("Informe um código de curso (-1 para terminar)");
		int codCur = s.nextInt();

		while (codCur != -1){
			//Processamento de um curso
			System.out.println("Informe quantidade de vagas");
			int quantVagas = s.nextInt();
	
			System.out.println("Informe quantidade de candidatos sexo masc.");
			int quantMasc = s.nextInt();
	
			System.out.println("Informe quantidade de candidatos sexo fem.");
			int quantFem = s.nextInt();
	
			int indice = (quantMasc + quantFem) / quantVagas;
			double percFem = ((double)quantFem / (double)(quantMasc + quantFem)) * 100;
	
			System.out.println("Indice candidato/vaga: " + indice);
			System.out.println("Percentual sexo feminino: " + df.format(percFem));
	
			if (indice > maiorIndice){
				maiorIndice = indice;
				maiorCur = codCur;
			}
	
	
			System.out.println("Informe um código de curso (-1 para terminar)");
			codCur = s.nextInt();
		}

		//Saida - escrever curso com maior índice
		System.out.println("Maior indice candidato/vaga: " + maiorIndice);
		System.out.println("Codigo do curso: " + maiorCur);


		}
}
