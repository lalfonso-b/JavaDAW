package ejemplo01Persona;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("López Martínez", "Juan", "10100100Y");
		p1.mostrar();

		Cliente cliente1 = new Cliente("Pérez Ortiz", "Rubén", "20100100R", "9012-1211-1732-1230");
		cliente1.mostrar();

	}

}
