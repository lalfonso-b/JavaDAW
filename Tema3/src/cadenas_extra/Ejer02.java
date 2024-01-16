package cadenas_extra;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Separador de nombre y extensión de archivos ***\n");

		System.out.println("Escribe un nombre de archivo con su extensión:");
		String archivo = entrada.nextLine();

		System.out.print("\nNombre: " + nombreArchivo(archivo));
		System.out.print("\nExtensión: " + extensionArchivo(archivo));
	}

	static String nombreArchivo(String archivo) {

		int posUltimoPunto = archivo.lastIndexOf(".");

		return archivo.substring(0, posUltimoPunto);
	}

	static String extensionArchivo(String archivo) {
		int posUltimoPunto = archivo.lastIndexOf(".");

		return archivo.substring(posUltimoPunto + 1);
	}

}