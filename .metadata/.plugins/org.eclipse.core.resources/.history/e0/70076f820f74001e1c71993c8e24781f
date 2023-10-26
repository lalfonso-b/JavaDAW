/* 
 Programa que pregunta al usuario una temperatura:
   - Si el usuario no escribe un número, el programa le informará de su 
   torpeza.
   - Si el valor de la temperatura es menor de 15ºC, le dirá que hace
   fresquito.
   - Si el valor está entre 15 (inclusive) y 25ºC (no incluído) le dirá 
   que hace buen tiempo.
   - Si hace 25ºC o más le dirá que hace calor.   
*/
package ejemplosCondicionales;


import java.util.Scanner;

public class Ejemplo09 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una temperatura:");
		if(entrada.hasNextDouble()) {
			double temp = entrada.nextDouble();
			
			if(temp < 15) {
				System.out.println("¡Hace fresquito!");
			}else if(temp>=15 && temp <25) {
				System.out.println("Hace buen tiempo.");
			}else {
				System.out.println("¡Hace calor!");
			}
			
		}else {
			System.out.println("Eres torpe.");
		}
		
	}

}













