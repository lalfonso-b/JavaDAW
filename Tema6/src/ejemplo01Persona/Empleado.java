package ejemplo01Persona;

public class Empleado extends Persona {

	private int codEmpleado;
	
	public Empleado(String apellidos, String nombre, String dni, int codEmpleado) {
		super(apellidos, nombre, dni);
		this.codEmpleado = codEmpleado;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Código de empleado: " + codEmpleado);
	}
		
}
