package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo08 {

	public static void main(String[] args) {
		
		// Preguntamos al usuario cuál es la festividad equivalente a
		// Halloween en España. Mientras no acierte, le repetimos la
		// pregunta. Luego le felicitamos.
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		do {
			System.out.println("¿Cómo se llama la festividad equivalente "
					+ "a Halloween en España?");
			nombre = entrada.nextLine();
		}while(!nombre.equals("Todos los santos"));
		
		System.out.println("¡Correcto!");
		
	}
	
}
