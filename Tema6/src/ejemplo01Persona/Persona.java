package ejemplo01Persona;

// Hacemos que la clase Persona sea abstracta y de ese modo no se podrán crear objetos de tipo Persona.
public abstract class Persona {

	private String apellidos;
	private String nombre;
	private String dni;

	public Persona() {

	}

	public Persona(String apellidos, String nombre, String dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
	}

	// Hacemos este método abstracto. Así, no le ponemos contenido y obligamos a que
	// las clases hijas lo implementen.
	public abstract void mostrar();

}
