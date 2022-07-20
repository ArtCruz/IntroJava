package Lista1;

import java.util.Scanner;
public class Ex_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Informe um valor inteiro positivo");
		int valor = s.nextInt(); //18

		String binario = "";
		while (valor >= 2){
			//divide mais uma vez
			int resto = valor % 2;
			binario = resto + binario; //concatena o resto no inicio da string que é diferente de binario += resto
			valor = valor / 2;
		}
		binario = valor + binario;

		System.out.println(binario);

		}
}