package actividades;

public class Ejer03 {

	public static void main(String[] args) {

		int num = 15;
		System.out.println("El número " + num + " en hexadecimal es " + aHex(num));

	}

	private static String transforma(int n) {

	}

	// Devuelve un número entre 0 y 15 en hexadecimal.
	private static String aHex(int n) {

		String[] cifrasHexadecimales = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E",
				"F" };

		return cifrasHexadecimales[n];
	}

}
