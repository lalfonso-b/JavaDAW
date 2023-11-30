package hoja2;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[][] nominas = new String[4][3];
		double sueldoTotal = 0;

		// Cogemos los datos de los empleados por consola.
		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.print("Apellidos del empleado: ");
			nominas[fila][0] = entrada.nextLine();

			System.out.print("Nombre del empleado: ");
			nominas[fila][1] = entrada.nextLine();

			System.out.print("Sueldo del empleado: ");
			nominas[fila][2] = entrada.nextLine();
		}

		// Mostramos la tabla
		System.out.println("\nApellidos\tNombre\t\tSueldo");
		System.out.println("=================================================");

		int posMin = 0;
		for (int fila = 0; fila < nominas.length; fila++) {

			// Mostramos la fila "fila".
			System.out.print(nominas[fila][0] + "\t\t" + nominas[fila][1] + "\t\t" + nominas[fila][2]);

			System.out.println();

			// Calculamos el el gasto mensual de la empresa sumando los
			// sueldos.
			sueldoTotal += Double.parseDouble(nominas[fila][2]);

			// Buscamos al empleado con menor salario.
			if (Double.parseDouble(nominas[fila][2]) < Double.parseDouble(nominas[posMin][2])) {
				posMin = fila;
			}

		}

		System.out.println("\nEl gasto mensual en sueldos es: " + sueldoTotal + "€.");

		System.out.println(nominas[posMin][1] + " " + nominas[posMin][0] + " es el que menos cobra, apenas "
				+ nominas[posMin][2] + " euros.");

	}

}