package Lista2;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Informe o primeiro valor inteiro: ");
		 int v1 = s.nextInt();
		 int maior = v1;
		 int menor = v1;
		 int meio = v1;
		 
		 System.out.println("Informe o segundo valor inteiro: ");
		 int v2 = s.nextInt();
		 if (v2 > maior)
			 maior = v2;
		 if (v2 < menor)
			 menor = v2;
		 
		 System.out.println("Informe o terceiro valor inteiro: ");
		 int v3 = s.nextInt();
		 if (v3 > maior)
			 maior = v3;
		 if (v3 < menor)
			 menor = v3;
		 /////////////////////
		 if (v2 < maior && v2 > menor)
			 meio = v2;
		 if (v3 < maior && v3 > menor)
			 meio = v3;
		 
		 System.out.println("Digite [C] para ver os numeros em ordem crescente e [D] para descrescente: ");
		 String ordem = s.next();
		 
		 if (ordem.equalsIgnoreCase("C")) {
			 System.out.println(menor);
			 System.out.println(meio);
			 System.out.println(maior);
		 }
		 if (ordem.equalsIgnoreCase("D")){
			 System.out.println(maior);
			 System.out.println(meio);
			 System.out.println(menor);
		 }
		 else {
			 System.out.println("Opção Inválida!");
		 }
		 s.close();
	}
	
}
