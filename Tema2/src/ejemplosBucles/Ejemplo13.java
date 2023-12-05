package ejemplosBucles;

import java.util.Scanner;

/*
(Ejercicio 9 usando una variable semáforo)

Escribe un programa que calcule el resto de una división entre enteros 
con el procedimiento de ir restando repetidamente el divisor del 
dividendo hasta que el resultado es menor que el divisor.

Ejemplo de esta operación:
	20 % 6
	20 - 6 = 14
	14 – 6 = 8
	8–6=2

Ahí paramos, ya que la resta da un número menor que 6. El resto vale 2.
 */

public class Ejemplo13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int dividendo, divisor, resultado = 0;

		System.out.println("Escribe dos números enteros");

		System.out.print("Dividendo: ");
		dividendo = entrada.nextInt();

		System.out.print("Divisor: ");
		divisor = entrada.nextInt();

		if (dividendo < divisor) {
			System.out.println("El dividendo debe ser mayor o igual " + "al divisor.");

		} else {

			// Variable semáforo.
			boolean continuarDividiendo = true;

			while (continuarDividiendo) {

				resultado = dividendo - divisor;

				System.out.println(dividendo + " - " + divisor + " = " + resultado);

				dividendo = resultado;

				if (resultado < divisor) {
					continuarDividiendo = false;
				}

			}

			System.out.println("Resto: " + resultado);

		}

	}
}
