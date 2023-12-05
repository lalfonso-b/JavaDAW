package hoja2Bucles;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entero = 0;
		for (int i = 1; i <= 5; i++) {

			System.out.println("INTRODUCE EL NÚMERO ENTERO:");
			entero = sc.nextInt();

		}

		System.out.println("Has fallado,el número era " + entero);

		sc.close();

	}

}