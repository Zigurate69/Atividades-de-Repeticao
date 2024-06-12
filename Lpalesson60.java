package LPAlore;

import java.util.Scanner;

public class Lpalesson60 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a=0;
		int soma=0;
		int i=1;
		
		
		while (i<11) {
			System.out.println("Insira o " + i + " número: ");
			a = ler.nextInt();
			i++;
			soma = a+soma;
		}
		System.out.println("O resultado da soma destes números é: " +soma);
		ler.close();
	}
}