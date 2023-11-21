package hoja1;
public class Ejer13 {

	public static void main(String[] args) {

		int[] potencias = new int[20];
		int i;
		int base = 2;
		
		
		for (i = 0; i < potencias.length; i++) {
			potencias[i] = (int) Math.pow(base,i);
			
		}
		System.out.println("Primeras 20 potencias de 2:");
		
		i = 0;
		while (i < potencias.length) {
			System.out.println("2^" + i  + " = " + potencias[i]);
			i++;
		}
	}
}