package hoja1;

import java.util.Scanner;

public class EjerPrimos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número entero");
		long num = entrada.nextLong();

		boolean primo = true;

		if (num < 1) {

			primo = false;

		} else {

			for (int i = 2; i <= num -1; i++) {
				
				if (num % i == 0) {

					primo = false;
					break;

				}
			}
		}

		if (primo) {
			System.out.println(num + " es un número primo.");
		} else {
			System.out.println(num + " es un número compuesto.");
		}

	}

}