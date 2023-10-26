
public class Ejemplo09 {

	public static void main(String[] args) {

		// Constantes: no pueden cambiar de valor una vez que han sido
		// inicializadas.

		final float PI = 3.1416F;
		final boolean APTO = false;
		final String SALUDO = "Estimado Sr/a: ";

		final float GRAVEDAD_TIERRA = 9.8F;
		final int IVA = 21;
		final double TEMPERATURA_DESEADA_CAMARA = -20;
		final double TEMPERATURA_EBULLICION_AGUA = 100;

		System.out.println("La temperatura de ebullición del agua es " + TEMPERATURA_EBULLICION_AGUA + "ºC.");

		System.out.println("El compresor de la cámara frigorífica "
				+ "funcionará mientras no se alcance la temperatura de " + TEMPERATURA_DESEADA_CAMARA + "ºC.");

	}

}