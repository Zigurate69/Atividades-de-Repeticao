package LPAlore;

import java.util.Scanner;

public class Lpalesson58 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int a=0;
		String Username;
		System.out.println("Informe o nome de usuário: ");
		Username = ler.next();

		while (a<=10) {
			a++;
			System.out.println("O nome de usuário é: " +Username);
		}
		ler.close();
	}
}