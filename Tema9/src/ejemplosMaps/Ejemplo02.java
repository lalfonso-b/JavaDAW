package ejemplosMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Mapa que relacione DNI (clave) y persona (valor).
		Map<String, String> personas = new HashMap<>();
		
		// Añadimos algunas personas.
		personas.put("10333444T", "Francisco Fernández");
		personas.put("15200200D", "María Jiménez");
		personas.put("32100100E", "Lupe Sánchez");
		personas.put("20111011A", "Laura Martínez");
		
		// Preguntamos al usuario un DNI y le decimos el nombre de la persona.
		System.out.println("Introduzca un DNI: ");
		String dni = entrada.nextLine();
		
		if(personas.containsKey(dni)) {
			System.out.println("El nombre es: " + personas.get(dni));
		}else {
			System.out.println("DNI no encontrado.");
		}
		
		// Eliminamos a la persona cuyo DNI hemos leído.
		personas.remove(dni);
		
		// Ver en forma de tabla la información del mapa.
		
		
		
	}

}





