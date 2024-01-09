package hoja2;

public class Ejer12 {

	public static void main(String[] args) {

		int numAtom[] = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int min = 0;
		int aux = 0;

		System.out.println("Números atómicos ordenados de menor a mayor:");

		for (int i = 0; i < numAtom.length - 1; i++) {

			min = i;

			for (int j = i + 1; j < numAtom.length; j++) {

				if (numAtom[j] < numAtom[min]) {
					min = j;
				}

			}

			aux = numAtom[i];
			numAtom[i] = numAtom[min];
			numAtom[min] = aux;

			System.out.println(numAtom[i]);

		}

		// Mostramos la última posición.
		System.out.println(numAtom[numAtom.length - 1]);

		System.out.println("\nNúmero atómico mayor: " + numAtom[numAtom.length - 1]);
		System.out.println("Número atómico menor: " + numAtom[0]);

	}

}