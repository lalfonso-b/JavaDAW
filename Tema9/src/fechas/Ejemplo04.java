package fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		LocalDate[] fechas = new LocalDate[5];

		System.out.println("Introduce 5 fechas:");

		// Pedir por terminal las cinco fechas y guardarlas en el array.
		for (int i = 0; i < fechas.length; i++) {

			System.out.print("Fecha " + i + ": ");
			fechas[i] = LocalDate.parse(entrada.nextLine());

		}

		// Mostrar por terminal la lista de fechas.

		System.out.println("\nFechas introducidas:");
		for (int i = 0; i < fechas.length; i++) {
			System.out.println(fechas[i].toString());
		}

		// Indicar la fecha más antigua.
		
		
		
		int posMin = 0;
		
		for (int i = 1; i < fechas.length; i++) {
			
			if(fechas[i].isBefore(fechas[posMin])) {
				posMin = i;
			}
			
		}
		
		System.out.println("La fecha más antigua es:" + fechas[posMin]);
		
		// Ordenar las fechas de más antigua a más reciente.
		
	}

}















