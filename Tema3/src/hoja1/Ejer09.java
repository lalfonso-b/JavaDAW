package hoja1;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[] letra = { "", "a)", "b)", "c)", "d)" };

		System.out.println("Escribe una pregunta tipo test: ");
		String[] test = new String[5];

		for (int i = 0; i < test.length; i++) {
			System.out.println("Crea un tipo test.");
			test[i] = entrada.nextLine();
		}

		for (int i = 0; i < test.length; i++) {
			System.out.println(letra[i] + test[i]);
		}

		entrada.close();
	}

}