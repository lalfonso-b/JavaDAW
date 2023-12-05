package hoja2Bucles;

import java.util.Scanner;

/*
Escribe una aplicación que pregunte repetidamente un número entero hasta 
que el usuario escriba un valor entre 1 y 10. A continuación el programa 
escribirá un mensaje informando del número introducido.
 */
public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número entero:");
		int num = entrada.nextInt();

		while (num < 1 || num > 10) {
			System.out.println("Tienes que decir un nº entre 1 y 10. " + "Vuelve a probar:");
			num = entrada.nextInt();
		}

		System.out.println("Tu número es el " + num);

	}

}
