package conversion;

public class Conversor {

	private final static double KM_A_MILLAS = 0.621371;
	private final static double MB_A_ATM = 0.000986923;
	private final static double CAL_A_JULIOS = 4.1868;

	public static double millas(double km) {
		return KM_A_MILLAS * km;
	}

}
