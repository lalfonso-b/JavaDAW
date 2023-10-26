package hoja1Condicionales;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("\n     ===== CALCULADORA =====\n");

		System.out.print("Primer operando: ");
		float num1 = entrada.nextFloat();

		System.out.print("Segundo operando: ");
		float num2 = entrada.nextFloat();

		System.out.println("Operación:");
		System.out.println("\t1) Suma");
		System.out.println("\t2) Resta");
		System.out.println("\t3) Multiplicación");
		System.out.println("\t4) División");

		int operacion = entrada.nextInt();

		switch (operacion) {

		case 1:
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;

		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case 4:
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		}

	}

}
