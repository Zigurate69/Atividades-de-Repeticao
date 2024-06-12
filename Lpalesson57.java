package LPAlore;

import java.util.Scanner;

public class Lpalesson57 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		String a;
		
		System.out.println("Informe o nome de usuário: ");
		a = ler.next();

		for (int i=0; i<=10; i++) {
			System.out.println("O nome do usuário é : " +a);
		}
		ler.close();
		
	}
}