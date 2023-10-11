package actividades;

import java.util.Scanner;

public class Ejer01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime un número: ");
		float num1 = entrada.nextFloat();
		
		System.out.print("Dime otro número: ");
		float num2 = entrada.nextFloat();
		
		System.out.println("El producto de multiplicar " + num1 + " por " + num2 + " es " + num1*num2);
		
	}
	
}
