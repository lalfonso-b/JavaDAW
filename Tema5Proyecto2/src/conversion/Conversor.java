package conversion;

public class Conversor {

	// Atributos-------------------------------------------------
	private static final double KM_A_MILLAS = 0.621371;
	private static final double MB_A_ATM = 0.000986923;
	private static final double CAL_A_JULIOS = 4.1862;

	// Constructor implicito-------------------------------------

	public Conversor() {

	}

	// Metodos---------------------------------------------------
	public static double millas(double km) {
		return km * KM_A_MILLAS;
	}

	public static double km(double millas) {
		return millas / KM_A_MILLAS;
	}

	public static double atmosferas(double milibares) {
		return milibares * MB_A_ATM;
	}

	public static double milibares(double atmosferas) {
		return atmosferas / MB_A_ATM;
	}

	public static double julios(double calorias) {
		return calorias * CAL_A_JULIOS;
	}

	public static double calorias(double julios) {
		return julios / CAL_A_JULIOS;
	}

}
