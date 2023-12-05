package hoja2;

/*
La siguiente tabla guarda el número de espectadores que vieron La 2 a las 23:00 horas, 
cada día de la semana. Escribe un programa que busque el máximo y el mínimo de 
audiencia en esta semana.
*/
public class Ejer07 {

	public static void main(String[] args) {

		int[] espectadores = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };

		// Buscamos el mínimo y el máximo de audiencia.

		int posMin = 0, posMax = 0;

		for (int i = 0; i < espectadores.length; i++) {

			if (espectadores[i] < espectadores[posMin]) {
				posMin = i;
			} else if (espectadores[i] > espectadores[posMax]) {
				posMax = i;
			}

		}

		// Informamos de los resultados.

		System.out.println("Resultados de audiencia de la semana en La 2, a las 23:00 horas:");
		System.out.println("\n   Máximo: " + espectadores[posMax] + " espectadores.");
		System.out.println("   Mínimo: " + espectadores[posMin] + " espectadores.");

	}

}
