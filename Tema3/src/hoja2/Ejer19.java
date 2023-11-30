package hoja2;

import java.util.Scanner;

public class Ejer19 {

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
		for (int fila = 0; fila < nominas.length; fila++) {

			for (int col = 0; col < nominas[0].length; col++) {
				System.out.print(nominas[fila][col] + "\t\t");
			}
			System.out.println();
		}

		// Calculamos el el gasto mensual de la empresa sumando los 
		// sueldos.
		for (int i = 0; i < nominas.length; i++) {

			sueldoTotal += Double.parseDouble(nominas[i][2]);
		}

		System.out.println("\nEl gasto mensual en sueldos es: " 
				+ sueldoTotal + "€.");

	}

}