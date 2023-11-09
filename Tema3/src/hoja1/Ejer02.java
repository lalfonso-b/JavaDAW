package hoja1;

public class Ejer02 {

	public static void main(String[] args) {

		// Crea un array de Strings llamado meses cuyos valores sean los
		// nombres de los doce meses del año. Haz que después se muestren
		// todos los valores mediante un bucle while.

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", 
				"Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		
		int i = 0;
		while (i < meses.length) {

			System.out.println((i+1) + " " + meses[i]);
			i++;
		}

	}

}