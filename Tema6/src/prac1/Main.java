package prac1;

public class Main {

	public static void main(String[] args) {

//		Medio me1 = new Medio(); Da error porque Medio ahora es abstracta

//		Mp3 mp1 = new Mp3();
//		Ogg o1 = new Ogg();

		Medio m1 = new Mp3("Lobo hombre en París", 180, "La Unión", "Pop", 1);

		m1.reproducir();
		((Mp3) m1).guardar();

		Guardable g1 = new Ogg("Carmen", 1000, "Bizet", "Ópera", 2);

	}

}
