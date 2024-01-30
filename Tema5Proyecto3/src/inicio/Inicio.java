package inicio;

import java.util.Scanner;

import biblioteca.Autor;

public class Inicio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Leemos los datos de un autor y los guardamos en un objeto de la clase Autor.
		
		System.out.println("******* ALTA DE AUTOR *******");
		
		System.out.print("Nombre del autor: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Email del autor: ");
		String email = entrada.nextLine();
		
		System.out.print("Año de nacimiento del autor: ");
		int anyo = entrada.nextInt();
		
		Autor autor1 = new Autor(nombre, email, anyo);
		
		System.out.println("\nDatos del autor: \n" + autor1.toString());
		
	}

}

















