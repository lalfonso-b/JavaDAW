package hoja1;

public class Ejer15 {

	public static void main(String[] args) {

		double[] temperaturas = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 
				11.5, 10, 10.1, 9.8, 9, 6 };

		double sumaMediaTemp = 0;

		System.out.println("La temperatura media:");

		for (int i = 0; i < temperaturas.length; i++) {

			sumaMediaTemp = sumaMediaTemp + temperaturas[i];

		}

		System.out.println("\n" + sumaMediaTemp / temperaturas.length 
				+ " ºC");

	}

}