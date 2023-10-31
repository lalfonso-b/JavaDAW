package hoja2Bucles;
// Crea un programa que escriba los 50 primeros

// números pares.

public class Ejer07 {

	public static void main(String[] args) {

		System.out.println("Los 50 primeros numeros pares:");

		int numPares = 1;
		int num = 0;

		while (numPares <= 50) {
			
			System.out.println(num);
			num += 2;
			
			numPares++;

		}

	}

}