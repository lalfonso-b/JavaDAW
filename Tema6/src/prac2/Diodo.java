package prac2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diodo extends Componente {

	private double tensionInversa;

	public Diodo(double intensidadMaxima, double longitud, double tensionInversa) {

		super(intensidadMaxima, longitud);
		this.tensionInversa = tensionInversa;

	}

	@Override
	public void conectar() {
		System.out.println("Componente conectado.");
	}

	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("DATOS DEL DIODO");

		try {

			System.out.print("Intensidad máxima: ");
			double intensidadMaxima = entrada.nextDouble();

			System.out.print("Longitud: ");
			double longitud = entrada.nextDouble();

			System.out.print("Tensión inversa: ");
			double tensionInversa = entrada.nextDouble();

			// Actualizamos los atributos aquí y de esa forma, si se produce cualquier error
			// no va a cambiar ninguno.
			setIntensidadMaxima(intensidadMaxima);
			setLongitud(longitud);
			this.tensionInversa = tensionInversa;

		} catch (InputMismatchException ime) {
			System.out.println("Entrada incorrecta.");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		} finally {
			System.out.println("Fin de lectura de datos");
		}

	}

	@Override
	public String toString() {
		return "Intensidad máxima: " + getIntensidadMaxima() + "\nLongitud: " + getLongitud() + "\nTensión inversa: "
				+ tensionInversa;
	}

}
