package instituto;

import auxiliar.Alumno;

public class Instituto {

	private final int MAX_ALUMNOS = 5;
	private Alumno[] alumnos;

	public Instituto() {
		alumnos = new Alumno[MAX_ALUMNOS];
	}

	public void addAlumno(Alumno alumno) {

		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				return;
			}

		}

	}

	public void delAlumno(int numExpediente) {

		int pos = buscaAlumno(numExpediente);

		if (pos != -1) {
			alumnos[pos] = null;
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

	public int numAlumnos() {

		int numAlumn = 0;

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				numAlumn++;
			}
		}

		return numAlumn;
	}

	public int buscaAlumno(int numExp) {

		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
				return i;
			}

		}

		return -1;
	}

}