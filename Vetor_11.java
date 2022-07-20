package Lista1;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] lista = new int[10];
		
		for (int i = 0; i< lista.length; i++){
			System.out.println("Informe um valor inteiro");
			lista[i] = s.nextInt();
		}	
		//lista = 2 1 4 3 5 2 7 1 1 3	
		//1 =3 vezes
		//2 = 2 vezes
		//3 = 2 vezes
		//Definir se os vetores são iguais
		for (int i = 0; i< lista.length; i++){
			int cont = 1;
			for (int x = i+1; x < lista.length; x++){
				if ((lista[i] == lista[x]) && lista[x] != -1){
					cont++;
					lista[x] = -1;
				}
			}
			if (cont > 1)
				System.out.println("O valor " + lista[i] + " foi encontrado " + cont + " vezes");
		}
		s.close();
	}
}