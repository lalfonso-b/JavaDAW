package ejemplosListas;

public class Mascota {

	private String nombre;
	private String raza;
	private int edad;

	public Mascota(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
	// TODO: Crear un método equals que compare dos mascotas mirando sus tres atributos.

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
	}

}
