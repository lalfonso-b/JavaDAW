package ejemplo02Coche;

public class Main {
	
	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		
		coche1.matricula = "2121DEF";
		coche1.marca = "Volkswagen";
		coche1.modelo = "Taigo";
		coche1.averia = "Aire acondicionado no funciona";
		coche1.quilometros = 50000;
		
		Coche coche2 = new Coche();
		coche2.leeDatos();
		coche2.mostrar();
		
	}

}
