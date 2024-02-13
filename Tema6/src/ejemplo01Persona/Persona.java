package ejemplo01Persona;

public class Persona {

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

	public void mostrar() {
		System.out.println("\n" + nombre + " " + apellidos + ", con DNI " + dni + ".");
	}

}
