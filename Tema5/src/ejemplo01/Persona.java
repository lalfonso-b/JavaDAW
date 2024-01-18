package ejemplo01;

public class Persona {

	// Propiedades o atributos de la clase.
	String apellidos;
	String nombre;
	String dni;
	String fechaNacimiento;

	// Métodos.
	void mostrar() {
		System.out.println("\nNombre completo: " + apellidos + ", " + nombre + ".");
		System.out.println("DNI: " + dni + ".");
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + ".");
	}

	// tieneDni() devuelve true si la persona tiene dni y false si no lo tiene.
	// O sea, si dni es distinto de null, o no.
	boolean tieneDni() {
		if (dni != null) {
			return true;
		}
		return false;
	}

}
