package Lista1;

public class Ex_08 {

	public static void main(String[] args) {
	
		int cont = 0;
		int num1 = 1;
		int num2 = 1;
		while(cont<= 15) {
			int soma = num1 + num2;
			if(cont == 0) {
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(soma);
			}
			else
				System.out.println(soma);
			num1 = num2;
			num2 = soma;
			cont++;
		}

	}

}
