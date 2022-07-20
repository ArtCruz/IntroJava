package Lista1;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int maior_val = 0;
		int menor_val = 0;
		double media_val = 0;
		
		
		for (int i = 1; i <= 500; i++) {
			System.out.println("Me informe o " + i + " valor inteiro: ");
			int valor = s.nextInt();
			
			if (i == 1) {
				maior_val = valor;
				menor_val = valor;
			}
			
			else
				if(valor > maior_val)
					maior_val = valor;
			
				if (valor < menor_val)
					menor_val = valor;
				
				media_val += valor;
		}
		double media = media_val / 500;
		
		System.out.println("O maior valor encontrado foi: " + maior_val);
		System.out.println("O menor valor encontrado foi: " + menor_val);
		System.out.println("A média dos valores foi: " + media);
		
		s.close();
	}

}
