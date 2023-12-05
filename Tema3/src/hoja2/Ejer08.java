package hoja2;

import java.util.Arrays;

public class Ejer08 {
	public static void main(String[] args) {

		/*
		 * La siguiente tabla muestra la humedad relativa en una localidad de Mallorca a
		 * lo largo de las 24 horas de un día. Crea un programa capaz de recorrer este
		 * array e indicar cuáles han sido las humedades máxima y mínima del día, y a
		 * qué horas se han producido.
		 */

		// Declaramos el array
		int[] humedad = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50,
				45 };

		// variables que guardarán la posición en el array del máximo
		// y mínimo.
		int horaMax = 0;
		int horaMin = 0;

		// Recorremos el array
		for (int i = 0; i < humedad.length; i++) {
			// Comprobamos si la humedad es mayor que la humedadMax
			if (humedad[i] > humedad[horaMax]) {
				// Si es mayor, guardamos la humedad y la hora
				horaMax = i;
			}

			// Comprobamos si la humedad es menor que la humedadMin
			if (humedad[i] < humedad[horaMin]) {
				// Si es menor, guardamos la humedad y la hora
				horaMin = i;
			}
		}

		// Mostramos los resultados
		System.out.println("La humedad máxima ha sido de " + humedad[horaMax] + "% a las " + horaMax + " horas.");
		System.out.println("La humedad mínima ha sido de " + humedad[horaMin] + "% a las " + horaMin + " horas.");

		// Mostramos el array
		System.out.println(Arrays.toString(humedad));

	}
}