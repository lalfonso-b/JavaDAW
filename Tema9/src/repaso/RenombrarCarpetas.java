package repaso;

import java.io.File;
import java.util.Scanner;

public class RenombrarCarpetas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Preguntar al usuario que nombre quiere dar a la carpeta y al archivo, y
		// cambiarle el nombre
		// usando File.renameTo()

		System.out.print("Nuevo nombre carpeta: ");
		String nombreCarpeta = entrada.nextLine();

		System.out.print("Nuevo nombre archivo: ");
		String nombreArchivo = entrada.nextLine();

		File archivoOriginal = new File("ficheros/archivoOriginal");
		File carpetaOriginal = new File("ficheros/CarpetaOriginal");

		archivoOriginal.renameTo(new File("ficheros/" + nombreArchivo));
		carpetaOriginal.renameTo(new File("ficheros/" + nombreCarpeta));

	}

}
