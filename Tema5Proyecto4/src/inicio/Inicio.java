package inicio;

import java.util.Scanner;

import biblioteca.Autor;

public class Inicio {

	public static void main(String[] args) {

		System.out.println("\nDatos del autor: \n" + autor1.toString());

		// Leemos los datos de un libro (suponemos que del autor anterior) y los
		// guardamos en un objeto Libro.

//		System.out.println("\n******* ALTA DE LIBRO *******");
//
//		// Limpiamos el buffer de entrada para evitar que se salte la siguiente lectura.
//		entrada.nextLine();
//
//		System.out.print("Título: ");
//		String titulo = entrada.nextLine();
//
//		System.out.print("ISBN: ");
//		String isbn = entrada.nextLine();
//
//		System.out.print("Año actual: ");
//		anyo = entrada.nextInt();
//
//		Libro libro1 = new Libro(titulo, isbn, autor1);
//		Libro.setAnyoActual(anyo);
//
//		System.out.println("\nDatos del libro: \n" + libro1.toString());

	}

	// Leemos los datos de un autor y los guardamos en un objeto de la clase Autor.
	private Autor leerAutor() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("******* ALTA DE AUTOR *******");

		System.out.print("Nombre del autor: ");
		String nombre = entrada.nextLine();

		System.out.print("Email del autor: ");
		String email = entrada.nextLine();

		System.out.print("Año de nacimiento del autor: ");
		int anyo = entrada.nextInt();

		return new Autor(nombre, email, anyo);

	}

}
