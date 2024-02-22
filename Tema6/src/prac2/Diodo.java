package prac2;

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

		System.out.print("Intensidad máxima: ");
		double intensidadMaxima = entrada.nextDouble();
		setIntensidadMaxima(intensidadMaxima);

		System.out.print("Longitud: ");
		double longitud = entrada.nextDouble();
		setLongitud(longitud);

		System.out.print("Tensión inversa: ");
		tensionInversa = entrada.nextDouble();

	}

	@Override
	public String toString() {
		return "Intensidad máxima: " + getIntensidadMaxima() + "\nLongitud: " + getLongitud() + "\nTensión inversa: "
				+ tensionInversa;
	}

}
