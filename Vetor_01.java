package Lista1;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] lista = new int[12];
		for(int i = 0; i < lista.length ; i++) {
			System.out.println("Digite um n�mero para a posi��o " + i);
			lista[i] = s.nextInt();
		}
		
		System.out.println("Escolha uma posi��o no vetor: ");
		int x = s.nextInt();
		System.out.println("Escolha mais uma posi��o no vetor: ");
		int y = s.nextInt();
		System.out.println("A soma da posi��o "+ x +" mais a posi��o "+ y + " � igual a: " +(lista[x]+lista[y]));
		s.close();
	}

}
