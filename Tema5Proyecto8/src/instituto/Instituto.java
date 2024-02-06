package instituto;

import auxiliar.Alumno;

public class Instituto {

	private final int MAX_ALUMNOS = 5;

	private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];

	public void addAlumno(Alumno alumno) {

		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				return;
			}

		}

	}

	public void delAlumno(int numExpediente) {

		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExpediente) {
				alumnos[i] = null;
				return;
			}

		}

	}

	public void muestraAlumnos() {

		System.out.println("***** ALUMNOS IES SON FERRER *****");

		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] != null) {

				System.out.println(alumnos[i].toString());

			}

		}

		System.out.println();

	}

}