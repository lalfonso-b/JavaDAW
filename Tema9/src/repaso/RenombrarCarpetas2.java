package repaso;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class RenombrarCarpetas2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Preguntar al usuario que nombre quiere dar a la carpeta y al archivo, y
		// cambiarle el nombre
		// usando File.renameTo()

		// JFileChooser para averiguar el archivo al que queremos cambiar de nombre.

		JFileChooser elegirArchivo = new JFileChooser("ficheros");

		int eleccion = elegirArchivo.showOpenDialog(null);

		if (eleccion != JFileChooser.APPROVE_OPTION) {
			System.out.println("No se ha elegido archivo. El programa terminará.");
			return;
		}

		File archivoOriginal = elegirArchivo.getSelectedFile();
		System.out.println(archivoOriginal.toString());

		System.out.print("Nuevo nombre archivo: ");
		String nombreArchivo = entrada.nextLine();

		archivoOriginal.renameTo(new File("ficheros/" + nombreArchivo));

	}

}
