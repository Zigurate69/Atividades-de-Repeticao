package LPAlore;

import java.util.Scanner;

public class Lpalesson62 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int a;
		int soma=0;
		int media;

		for (int i=1; i<=20; i++) {
			System.out.println("Informe a idade da " + i + " pessoa: ");
			a = ler.nextInt();
			soma = soma+a;
			
			
			
		}
		System.out.println("O resultado da soma destas idades é: " +soma);
		
		media = soma/20;
		
		System.out.println("O resultado da média destas idades é: " +media);
		ler.close();
	}
}