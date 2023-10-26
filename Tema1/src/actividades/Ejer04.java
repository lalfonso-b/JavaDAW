package actividades;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nombre del alumno: ");
		String nombre = entrada.nextLine();

		System.out.print("Nota 1: ");
		float nota1 = entrada.nextFloat();

		System.out.print("Nota 2: ");
		float nota2 = entrada.nextFloat();

		System.out.print("Nota 3: ");
		float nota3 = entrada.nextFloat();

		float media = (nota1 + nota2 + nota3) / 3;

		System.out.println("La nota media del alumno es " + media);

	}

}
