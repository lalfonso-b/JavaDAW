package prac1;

public class Video extends Medio {

	private String director;
	private String idioma;
	private static int iva = 10;

	public static void setIva(int iva) {
		Video.iva = iva;
	}
	
	public static int getIva() {
		return iva;
	}
}