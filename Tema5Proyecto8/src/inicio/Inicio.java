package inicio;

import auxiliar.Grupo;

public class Inicio {

	public static void main(String[] args) {

		// Creamos un objeto Grupo paśandole los datos en el constructor.
		Grupo grupo1 = new Grupo(12, "ESO", 3, "B");

		System.out.println(grupo1.toString());

		// Creamos un objeto Grupo sin pasarle ningún dato, y luego usamos leeDatos()
		// para inicializar todos sus atributos.
		Grupo grupo2 = new Grupo();
		
		grupo2.leeDatos();
		System.out.println(grupo2.toString());

	}

}
