package cadenas_extra;

import java.util.Iterator;

import java.util.Scanner;

public class Ejer03 {

//	Escribe un programa que pida al usuario una frase. Si su longitud es menor o igual

//	a 20 caracteres, la mostrará sin cambios. Pero si supera los 20 caracteres, 

//	mostrará los 17 primeros caracteres seguidos de tres puntos suspensivos, 

//	de manera que la longitud total sea de 20.

//	Usa un método llamado recortar() que reciba una cadena y devuelva la cadena original

//	o recortada, según corresponda.

	public static void main(String[] args) {

		String frase = "";

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Acortador de texto ***\n");
		System.out.println("Escribe una frase y la cortaré de manera que no exceda" + "los 20 caracteres: ");
		frase = entrada.nextLine();

		System.out.println("Frase recortada:\n" + recortar(frase));

	}

	static String recortar(String frase) {

		char longitudFrase = 20;

		if (frase.length() <= longitudFrase) {
			return frase;
		} else {
			return frase.substring(0, 17) + "...";
		}

	}

}