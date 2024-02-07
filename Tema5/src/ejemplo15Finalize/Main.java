package ejemplo15Finalize;

public class Main {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 2; i++) {
			Coche coche = new Coche("1001DFT","Seat","Toledo");
			coche = null;
		}
		
		System.out.println("fin");

	}

}
