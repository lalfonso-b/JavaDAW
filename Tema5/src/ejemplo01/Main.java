package ejemplo01;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable persona1, de tipo Persona, y le asignamos un objeto de
		// tipo Persona.
		Persona persona1 = new Persona();

		// Damos valores a las propiedades de persona1.
		persona1.apellidos = "Sánchez";
		persona1.nombre = "Mario";
		persona1.dni = "22100100T";
		persona1.fechaNacimiento = "10/10/1980";

		// Queremos mostrar algunos datos de persona1.
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");
		System.out.println("Nació el " + persona1.fechaNacimiento + ".");
		
		// Podemos cambiar cualquier propiedad.
		persona1.apellidos = "Sánchez Pérez";
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
