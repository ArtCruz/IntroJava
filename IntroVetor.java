package Aula;

import java.util.Scanner;
public class Aula {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		/* Listas: é homogeneo se for botar só string é so string, se for só int é só int
		 * */
		
		int valor = 34;
		String [] listaString = new String[4];;//lista de String que pode armazenar 4 String´s
								  //       0 1 2 3 4
		int[] lista1 = new int[5]; // --> | | | | | |
		lista1[0] = 5;
		lista1[4] = 8;
		lista1[1] = -5;
		lista1[2] = 7;
		lista1[3] = 3;
		System.out.println(lista1[4]);
		
		int[] lista2 = new int[5];
		
		for (int i = 0; i < lista2.length; i ++) {
			System.out.println("Informe valor para a posição de indíce " + i);
			lista2[i] = s.nextInt();
		}
	}

}
