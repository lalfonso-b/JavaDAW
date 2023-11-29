package hoja2;

public class Ejer16 {

	public static void main(String[] args) {

		String[][] notas = {
				{ "Jose Luis Martínez", "7" },
				{ "Antonia Ruiz", "9" },
				{ "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" },
				{ "Alberto López", "7" },
		};
		
		System.out.println("Nombre\t\t\tNota");
		System.out.println("======\t\t\t====");
		
		for (int fila = 0; fila < notas.length; fila++) {
			
			System.out.println(notas[fila][0] + "\t\t" + notas[fila][1]);
			
		}

		float media = 0;

		for (int fila = 0; fila < notas.length; fila++) {
			media = media + Float.parseFloat(notas[fila][1]);
		}

		System.out.println("La media es: " + media / notas.length);

	}

}