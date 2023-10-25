package hoja1;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo te llamas?");
		String nombre = entrada.nextLine();
		
		if(nombre.equals("")) {
			nombre = "desconocido";
		}else {
			nombre = nombre; // Nombre se queda igual. No hacerlo así.
		}

		nombre = nombre.equals("") ? "desconocido" : nombre;

		System.out.println(nombre);

	}

}