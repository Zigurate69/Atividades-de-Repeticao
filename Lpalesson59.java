package LPAlore;

import java.util.Scanner;

public class Lpalesson59 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		int a;
		int soma=0;
		
		for (int i=1; i<11; i++) {
			System.out.println("Insira o " + i + " número: ");
			a = ler.nextInt();
			soma = a+soma;
		}
		System.out.println("O resultado da soma destes números é: " +soma);
		ler.close();
	}
}