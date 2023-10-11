package actividades;

import java.util.Scanner;

public class Ejer02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un número: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Escribe otro número: ");
		int num2 = entrada.nextInt();
		
		System.out.println("El resto de dividir " + num1 + " entre " 
				+ num2 + " da " + num1%num2);
		
	}

}
