package hoja2;

import java.util.Scanner;

/*
Escribe un programa que pida 10 precios de productos y los guarde en un array llamado productos. 
Después recorrerá el array hasta encontrar un precio menor que 0. Si lo encuentra escribirá el 
mensaje "Se ha encontrado un valor no válido en la posición x. El programa terminará" (x es la 
posición del array donde está ese dato). Si no lo encuentra, calculará la suma de todos los precios 
y la mostrará. 

Utiliza una variable semáforo llamada preciosCorrectos, que valdrá true si todos los precios 
son mayores o iguales a cero, y false si se encuentra un número negativo.
*/
public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float[] productos = new float[10];

		// Rellenamos el array productos con los números que escriba el usuario.

		System.out.println("Introduzca los precios de diez productos.\n");
		for (int i = 0; i < productos.length; i++) {

			System.out.print("Precio " + (i + 1) + ": ");
			productos[i] = entrada.nextFloat();

		}

		// Suponemos que, en principio, los precios son correctos. Si encontramos alguno
		// que no lo sea (negativo) cambiaremos el valor de preciosCorrectos a false.
		boolean preciosCorrectos = true;

		// Suma de todos los precios.
		float suma = 0;

		// Revisamos el array sumando los precios y buscando si hay algún valor menor
		// que 0.
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] >= 0) {
				// Si un precio es correcto lo añadimos a la suma.
				suma = suma + productos[i];
			} else {
				// Si hay un precio negativo, salimos del bucle tras poner preciosCorrectos a
				// false e informar al usuario.
				preciosCorrectos = false;
				System.out.println(
						"\nSe ha encontrado un valor no válido en la posición " + i + ". El programa terminará.");
				break;
			}
		}

		// Indicamos la suma de todos los precios, si todos son correctos.
		if (preciosCorrectos) {
			System.out.println("\nLa suma de todos los precios es: " + suma + " euros.");
		}

	}

}
