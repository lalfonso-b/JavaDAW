package prac2;

public class Simulador {

	public static void main(String[] args) {

//		Componente componente1 = new Componente(100, 20);
		Condensador condensador1 = new Condensador(100, 10, 10);
		Diodo diodo1 = new Diodo(30, 30, 10);
		Led led1 = new Led(40, 30, 10, "Verde");

		diodo1.leeDatos();
		System.out.println(diodo1.toString());
	}

}
