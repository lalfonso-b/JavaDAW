package ejemplos;

public class Ejemplo12 {

	public static void main(String[] args) {

		// Actividad: Escribe una tabla con edades y altura de
		// un grupo de personas
		// Edad Altura
		// 12 1,50
		// La tabla se llamará datos ( al menos 4 filas).
		// Múestrala en forma de tabla.

		double[][] datos = { { 12, 1.50 }, { 15, 1.75 }, { 21, 1.69 }, { 32, 1.90 } };

		System.out.println("Edad\tAltura\n");

		for (int fila = 0; fila < datos.length; fila++) {

			// Para cada fila mostramos sus columnas.
			for (int col = 0; col < datos[0].length; col++) {
				System.out.print(datos[fila][col] + "\t");
			}

			System.out.println();

		}

	}

}