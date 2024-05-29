package repaso;

import java.io.File;
import java.util.Scanner;

public class CrearRistraCarpetas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una ristra de carpetas y te la crearé en tu carpeta personal...");
		String ristraCarpetas = entrada.nextLine();

		String rutaCarpetaPersonal = System.getProperty("user.home");

		File nuevaCarpeta = new File(rutaCarpetaPersonal + "/" + ristraCarpetas);
		System.out.println("Se va a crear la carpeta: " + rutaCarpetaPersonal + "/" + ristraCarpetas);

		boolean resultado = nuevaCarpeta.mkdirs();
		if (resultado) {
			System.out.println("Ok");
		} else {
			System.out.println("No se ha podido crear.");
		}

	}

}
