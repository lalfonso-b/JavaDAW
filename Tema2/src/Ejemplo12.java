import java.util.Scanner;

public class Ejemplo12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// DADA UNA COMPRA, SI SUPERA LOS 100 EUROS TENDRÁ UN DECUENTO
		// DEL 10%, SI NO, LO TENDRÁ DEL 5%

		System.out.println("Introduzca el importe de su compra:");

		float importe = entrada.nextFloat();

		int descuento;

//		if (importe > 100) {
//			descuento = 10;
//		} else {
//			descuento = 5;
//		}

		descuento = importe > 100 ? 10 : 5;

		float precioFinal = importe - importe * descuento / 100;

		System.out.println("Disfruta usted del " + descuento + "% de descuento.");

		System.out.println("A pagar: " + precioFinal + " euros.");
	}

}