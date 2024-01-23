package ejemplo06Circulo;

public class Circulo {

	// Constante PI
	final double PI = 3.141593;

	// Coordenadas x, y del círculo.
	double x;
	double y;

	// Radio del círculo
	double radio;

	// Constructor implícito.
	Circulo() {

	}

	// Constructor explícito, que recibe los valores de todos los atributos.
	Circulo(double x, double y, double radio) {

		this.x = x;
		this.y = y;
		this.radio = radio;

	}

	// Constructor explícito que recibe sólo el valor del radio.
	Circulo(double radio) {

		this.radio = radio;
		// También se podría haber hecho "this(0, 0, radio);".

	}

	// Devuelve el área del círculo.
	double area() {
		return PI * radio * radio;
	}

	// Devuelve el perímetro del círculo.
	double perimetro() {
		return 2 * PI * radio;
	}

}
