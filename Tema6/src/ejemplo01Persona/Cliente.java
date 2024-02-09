package ejemplo01Persona;

public class Cliente extends Persona {

	private String visa;

	public Cliente(String apellidos, String nombre, String dni, String visa) {
		// Pasamos los apellidos, nombre y dni como argumentos al constructor de la
		// clase padre, Persona.
		super(apellidos, nombre, dni);
		
		// Inicializamos a mano el resto de atributos que no son heredados.
		this.visa = visa;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("Visa: " + visa + ".");
	}

}
