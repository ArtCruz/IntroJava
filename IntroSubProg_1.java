package Aula;

public class Aula1 {

	//Declaração void - para subprogramas que não retornam valor
	public static void somaNumeros(int valor1, int valor2){
	System.out.println("A soma é " + (valor1+valor2));
	}

	//Função - retorna valor
	public static int somaNumeros2(int n1, int n2){
	return n1 + n2;
	}


	public static void main(String[] args) {
	int num1 = 10;
	int num2 = 20;

	somaNumeros(num1, num2);

	int resultado = somaNumeros2(num1, num2);
	System.out.println("A soma é " + resultado);
	}
}
