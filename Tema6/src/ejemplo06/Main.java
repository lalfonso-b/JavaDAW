package ejemplo06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");

		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();
		
		int num;
		try {
			
			num = Integer.parseInt(numero);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);
			
		} catch (NumberFormatException nfe) {
			
			System.out.println("¡Tienes que escribir un número entero!");
			
		} catch (ArithmeticException ae) {
			
			System.out.println("¡No se puede dividir por cero!");
			
		} catch (Exception e) {
			
			System.out.println("Se ha producido un error inesperado. El programa se cerrará.");
			System.out.println(e.toString());
			System.exit(0);
			
		}

		System.out.println("\nAhora seguiría el código fuera del catch...");

	}

}












