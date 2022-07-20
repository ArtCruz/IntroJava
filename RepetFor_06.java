package Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_08 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		
		int bom_aprov = 0;
		int tens = 0;
		int aluno_exemplar = 0;
		
		for (int i = 1; i <= 50; i++) {
			double media_aluno = 0;
			for (int b = 1; b <= 6; b++) {
				System.out.println("Me informe a media do aluno " + i +" no " + b + " bimestre: ");
				double nota_aluno = s.nextDouble();
				if (nota_aluno == 10) 
					tens += 1;
			
				media_aluno += nota_aluno;
				
			}
			media_aluno = media_aluno / 6;
			if (tens >= 2 && media_aluno >= 9) 
				aluno_exemplar += 1;
			

			System.out.println("A media anual do aluno "+ i +" é " + df.format(media_aluno));
			if (media_aluno >= 7 && media_aluno <= 7.9) 
				bom_aprov += 1;
			
		}
		System.out.println(bom_aprov + " aluno obtiveram honras pelo bom aproveitamento");
		System.out.println("O porcentual de alunos exemplares foi de " + aluno_exemplar * 2 + "%");
	}
}
