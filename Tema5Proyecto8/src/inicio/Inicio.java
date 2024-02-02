package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;

public class Inicio {

	public static void main(String[] args) {

		// Creamos un objeto Grupo paśandole los datos en el constructor.
		Grupo grupo1 = new Grupo(12, "ESO", 3, "B");

		System.out.println(grupo1.toString());

		// Creamos un objeto Grupo sin pasarle ningún dato, y luego usamos leeDatos()
		// para inicializar todos sus atributos.
		Grupo grupo2 = new Grupo();
		
//		grupo2.leeDatos();
//		System.out.println(grupo2.toString());
		
		// Creamos un objeto Alumno pasándole los datos al constructor (le asignamos el grupo 3º B).
		Alumno alumno1 = new Alumno(100, "Pérez López", "Luis", grupo1);
		System.out.println(alumno1.toString());
		
		// Creamos un objeto Alumno llamando al método leeDatos().
		Alumno alumno2 = new Alumno();
		alumno2.leeDatos();
		System.out.println(alumno2.toString());
		
		System.out.println("¿Cuál es tu edad?");
		int edad = Consola.leerInt("¡Tu edad debe ser un número entero!");

	}

}






