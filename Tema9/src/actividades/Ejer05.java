package actividades;

public class Ejer05 {

	public static void main(String[] args) {

		int n = 5;
		System.out.println("La suma de 1 a " + n + " es " + sumar(n));

	}

	public static int sumar(int num) {

		if (num == 1) {
			return 1;
		}

		return num + sumar(num - 1);

	}

}