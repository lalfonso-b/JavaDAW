package ejemplo12Static;

public class Unidades {

	// Los siguientes atributos son estáticos. Esto hace que tengan el mismo valor
	// para cualquier objeto de la clase Unidades.

	static double PI = 3.141593;

	// Factor de conversión de quilómetros a metros
	static double quilometros = 1000;

	// Factor de conversión de centilitros a litros.
	static double centilitros = 0.01;

	// Método que dado un número nos devuelve el área del círculo cuyo radio es ese
	// número.
	public double areaCirculo(double radio) {
		return PI * radio * radio;
	}

}
