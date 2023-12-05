package hoja2Bucles;

public class Ejer15b {

	public static void main(String[] args) {

		System.out.println("¡¡¡Potencias de 3!!!");

		int exp = 0;
		int potencia = 1;

		do {
			System.out.println("3 ^ " + exp + " = " + potencia);
			exp++;
			potencia = (int) Math.pow(3, exp);

		} while (potencia < 12000);
	}

}
