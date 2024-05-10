package actividades;

public class Ejer04b {

	public static void main(String[] args) {

		System.out.println("se ha restado " + calculoDivision(4, 6, 0) + " veces.");

	}

	private static int calculoDivision(int num1, int num2, int numDivisiones) {

		// Caso base: cuando num1 es menor que num2, hemos terminado la división
		if (num1 < num2) {

			return numDivisiones;

		}

		// Restamos num2 de num1 y llamamos recursivamente a la función con los nuevos valores

		return calculoDivision(num1 - num2, num2, numDivisiones + 1);

		// Alternativa
		// return num1 < num2 ? numDivisiones : calculoDivision(num1 - num2, num2, numDivisiones + 1);
	}

}