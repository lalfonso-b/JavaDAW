// Crea un programa que pida la temperatura de un reactor nuclear. 

// Si ésta supera los 120ºC, se mostrará en pantalla el mensaje: 

// "TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!


package hoja1;


import java.util.Scanner;


public class Ejer01 {


	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*** MENU DEL REACTOR ***");

		System.out.println("\n¿Cual es la temperatura actual del reactor?");

		float temp = entrada.nextFloat();

		

		if(temp > 120) {

			System.out.println("*** TEMPERATURA DEL REACTOR CRÍTICA ***");

			System.out.println("¡CORRED, INSENSATOS!");

		}

		

		System.out.println("\nFin del aviso");

	}


}