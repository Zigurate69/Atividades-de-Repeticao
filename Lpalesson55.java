package LPAlore;

import java.util.Scanner;

public class Lpalesson55 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int soma=0;

		for (int i=0; i<15; i++) {
			soma = soma+i;
			System.out.println("O resultado da soma dos números é: " +soma);
		}
		ler.close();
	}
}