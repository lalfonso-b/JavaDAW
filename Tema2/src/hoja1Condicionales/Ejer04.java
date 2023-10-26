package hoja1Condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String password;

		System.out.println("Introduzca la contraseña, SÓLO NUMEROS");
		password = entrada.nextLine();

		// Al ser String, para ver si password es "1234" hay que usar el
		// método equals(), no podemos utilizar "==".
		if (password.equals("1234")) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Acceso denegado");
		}

	}

}