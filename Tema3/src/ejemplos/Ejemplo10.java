package ejemplos;

import java.util.Arrays;

// Algoritmo de seleccion

public class Ejemplo10 {

	public static void main(String[] args) {

		int[] valores = {20, 12, 22, 15, 3};
		
		System.out.println(Arrays.toString(valores));
		
		// Indicará ña posición del minimo del Array sin ordenar.
		int posMin;
		int aux;
		
		// Ponemos valores.length - 1 para ahorrarnos el ultimo paso.
		for (int i = 0; i < valores.length - 1; i++) {
			// La variable [i] indica a partir de que posicion de la array aun esta desordenado.
			
			
			// En cada pasada del bucle se buscará el mínimo desde [i] hasta el final.
			posMin = i;
			
			// Recorremos el array desde la posicion [i] hasta el final.
			// Usando [i + 1] nos ahorramos una interraccion del bucle.
			for (int j = i+1; j < valores.length; j++) {
				
				if (valores[j] < valores[posMin]) {
					posMin = j;
				}
				
			}
			
			// Intercambiamos las posiciones [i] y posMIn
			aux = valores[i];
			valores[i] = valores[posMin];
			valores[posMin] = aux;
			
			System.out.println(Arrays.toString(valores));
			
		}
		
	}

}
