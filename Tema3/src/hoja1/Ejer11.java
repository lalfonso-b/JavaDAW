package hoja1;

public class Ejer11 {

	public static void main(String[] args) {

		String[] matriculas = new String[100];

		// Asignamos un valor inicial de "sinmatricula" a cada posición
		// del array.
		for (int i = 0; i < matriculas.length; i++) {
			matriculas[i] = "sinmatricula";
		}

		// Mostramos el resultado
		System.out.println("Listado de matrículas");
		System.out.println("============================");
		for (int i = 0; i < matriculas.length; i++) {
			System.out.println(matriculas[i]);
		}

	}

}
