package ejemplo04Persona;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable persona1, de tipo Persona, y le asignamos un objeto de
		// tipo Persona. Usamos el constructor y así evitamos asignar valor a cada
		// atributo por separado.
		Persona persona1 = new Persona("Sánchez", "Mario", "22100100T", "10/10/1980");

		// Queremos mostrar algunos datos de persona1.
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");
		System.out.println("Nació el " + persona1.fechaNacimiento + ".");

		// Podemos cambiar cualquier propiedad.
		persona1.apellidos = "Sánchez Pérez";
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");

		// Podemos crear tantos objetos Persona como necesitemos.
		Persona persona2 = new Persona("Martínez López", "María");

		System.out.println("Nuestra persona 2 se llama " + persona2.nombre + " " + persona2.apellidos + ".");

		// Al crear persona2 no le dimos un valor a fechaNacimiento, por lo que será
		// null.
		System.out.println("María nació el " + persona2.fechaNacimiento + ".");
		
		

	}

}