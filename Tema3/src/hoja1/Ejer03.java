package hoja1;

public class Ejer03 {

	public static void main(String[] args) {

		// Crea un array llamado densidades con las densidades (en g/cm3)

		// de los nueve (sí, nueve) planetas del Sistema Solar.

		// Haz que después se muestren todos los valores mediante un bucle for.

		String[] planetas = { "Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno",
				"Pluton" };

		double[] densidades = { 5.4, 5.2, 5.5, 3.9, 1.3, 0.7, 1.3, 1.6, 1.88 };

		System.out.println("Aqui estan las densidades de los 9 planetas del sistema solar:");

		System.out.println();

		for (int i = 0; i < densidades.length; i++) {

			System.out.println("La densidad de " + planetas[i] 
					+ " es: " + densidades[i] + " g/cm3");
		}
	}

}