public class Inicio {

	public static void main(String[] args) {

		// Crear Objetos

		Motor motor1 = new Motor(1, "Mitsubishi", "V3");
		Motor motor2 = new Motor(2, "Samsung", "A1");

		Lavadora lav1 = new Lavadora(201, motor1, "Balay", 450);
		Lavadora lav2 = new Lavadora(202, motor2, "Edesa", 410);

		Taller taller1 = new Taller();

		// To String Lavadora

		System.out.println("***PRIMERA LAVADORA***");

		System.out.println(lav1.toString());
		System.out.println();

		// Añadimos la lavadora
		taller1.addLavadora(lav1);
		taller1.addLavadora(lav2);

		// Mostramos la lavadora
		taller1.listaLavadoras();

		// Borramos una Lavadora
		taller1.borraLavadora(5);
		System.out.println();
		taller1.listaLavadoras();

		// Volvemos a añadir
		taller1.addLavadora(lav2);

		// Buscamos la lavadora
		System.out.println("Posicion de la lavadora en el el Array : " + taller1.buscaLavadora(5));

	}

}