package ejemplo06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa para dividir 20 entre un nº");
		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();
		
		int num = Integer.parseInt(numero);
		System.out.println("La división de 20 entre " + num + " es " + 20 / num);

	}

}
