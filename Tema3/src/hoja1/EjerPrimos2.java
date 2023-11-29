package hoja1;

// Programa que muestre en pantalla los números primos
// que haya desde 2 hasta 1000.

public class EjerPrimos2 {

	public static void main(String[] args) {

		boolean primo;

		for (int i = 2; i <= 1000; i++) {

			primo = true;

			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {

					primo = false;
					break;

				}

			}

			if (primo) {

				System.out.println(i);

			}

		}

	}

}