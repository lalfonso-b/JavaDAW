package ejemplo10Coche;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos.
	private String matricula;
	private String marca;
	private String modelo;
	private String averia;
	private int quilometros;

	// Constructor explícito que tome los cinco valores de los atributos.
	Coche(String matricula, String marca, String modelo, String averia, int quilometros) {

		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.quilometros = quilometros;

	}

	// Constructor explícito que tome la matrícula, marca y modelo, y deje el resto
	// de valores sin modificar.
	Coche(String matricula, String marca, String modelo) {

		this(matricula, marca, modelo, null, 0);

	}

	// leeDatos() pregunta al usuario los valores de las propiedades y los lee desde
	// la terminal.
	void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("INTRODUCCIÓN DE DATOS DEL COCHE");

		System.out.print("Matrícula: ");
		matricula = entrada.nextLine();

		System.out.print("Marca: ");
		marca = entrada.nextLine();

		System.out.print("Modelo: ");
		modelo = entrada.nextLine();

		System.out.print("Avería: ");
		averia = entrada.nextLine();

		System.out.print("Quilometraje: ");
		quilometros = entrada.nextInt();

	}

	// Muestra todas las propiedades del objeto.
	void mostrar() {

		System.out.println("\nDATOS DEL COCHE");
		System.out.println("Matrícula: " + matricula + ".");
		System.out.println("Marca: " + marca + ".");
		System.out.println("Modelo: " + modelo + ".");
		System.out.println("Avería: " + averia + ".");
		System.out.println("Quilometraje: " + quilometros + ".");

	}

	// MÉTODOS DE ACCESO (GETTERS Y SETTERS)

//	private String matricula;
//	private String marca;
//	private String modelo;
//	private String averia;
//	private int quilometros;

	// Método que nos devuelve el valor del atributo matrícula.
	public String getMatricula() {
		return matricula;
	}

	// Método que nos permite dar un valor al atributo matrícula.
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// Método que nos devuelve el valor del atributo marca.
	public String getMarca() {
		return marca;
	}

	// Método que nos permite dar un valor al atributo marca.
	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Método que nos devuelve el valor del atributo modelo.
	public String getModelo() {
		return modelo;
	}

	// Método que nos permite dar un valor al atributo modelo.
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Método que nos devuelve el valor del atributo avería.
	public String getaveria() {
		return averia;
	}

	// Método que nos permite dar un valor al atributo averia.
	public void setAveria(String averia) {
		this.averia = averia;
	}

	// Método que nos devuelve el valor del atributo quilómetros.
	public int getQuilometros() {
		return quilometros;
	}

	// Método que nos permite dar un valor al atributo quilómetros.
	public void setQuilometros(int quilometros) {
		
		// Comprobamos que los quilómetros no sean un número negativo.
		if(quilometros < 0) {
			return;
		}
		
		this.quilometros = quilometros;
		
	}
}



















