package hoja2Bucles;

public class Ejer15 {

	public static void main(String[] args) {

		System.out.println("¡¡¡Potencias de 3!!!");

		int exp = 0;
		int potencia = 1;

		do {
			System.out.println("3 ^ " + exp + " = " + potencia);
			exp++;
			potencia = potencia * 3;
		} while (potencia < 12000);
	}

}
