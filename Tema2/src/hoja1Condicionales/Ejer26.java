package hoja1Condicionales;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"Introduzca cuándo quiere usted saber el horario de " + "la tienda:\nEntre semana o Fin de semana.");

		String dia = entrada.nextLine();
		dia = dia.toLowerCase();

		String hora;

		hora = dia.equals("entre semana") ? "20.00" : "14.00";

		System.out.println("La hora de cierre es a las " + hora + "h.");

		entrada.close();

	}

}