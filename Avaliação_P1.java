package P1;

import java.util.Scanner;
public class Prova {

	public static void main(String[] args) { 

		Scanner s = new Scanner (System.in); 

		 

		boolean correto = false; 

		int vzs_errou = 0; 

		 

		while(correto == false) { 

			System.out.println("Digite a palavra Hipopotomonstrosesquipedaliofobia"); 

			String palavra = s.next(); 

			 

			if(palavra.equalsIgnoreCase("Hipopotomonstrosesquipedaliofobia")){ 

				System.out.println("Parab�ns voc� digitou corretamente! "); 

				correto = true; 

			} 

			if(!palavra.equalsIgnoreCase("Hipopotomonstrosesquipedaliofobia")){ 

				System.out.println("Tente Novamente, voc� consegue :)"); 

				vzs_errou += 1; 

			}	 

		} 

		System.out.println("Voc� errou " + vzs_errou + " vezes a palavra"); 

	} 
}