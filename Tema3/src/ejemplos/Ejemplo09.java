package ejemplos;

import java.util.Arrays;

// Intercambiar los valores de dos variables.
public class Ejemplo09 {

	public static void main(String[] args) {

		int a= 10, b = 25;
		
		// b = 10 y a = 25;
		
		int aux;
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("a = " + a + "; b = " + b);
		
		// Lo mismo pero ahora intercambiaremos dos posiciones de un array.
		
		String[] mascotas = {"Perro", "Gato", "Hamster", "Ardilla", "Conejo"};
		
		// Intercambiamos la posicion 1 (Gato) por 3 (Ardilla).
		
		System.out.println(Arrays.toString(mascotas));
		
		String auxx;
		auxx = mascotas[1];
		mascotas[1] = mascotas[3];
		mascotas[3] = auxx;
		
		System.out.println(Arrays.toString(mascotas));
		
	}

}
