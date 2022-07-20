package Lista1;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] lista = new int[10];
		int impar = 1;
		for(int i=0;i<lista.length;i++) {
			lista[i] = impar;
			impar += 2;
		}
		for(int i =0;i <lista.length;i++) {
			System.out.println(lista[i]);
		}
		s.close();
	}
}