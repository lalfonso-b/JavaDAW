package actividades;

public class Ejer04 {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 6;
		
		System.out.println(num1 + " divido entre " + num2 + " es " + division(num1,num2) + " (número entero).");
		
	}
	
	private static int division(int dividendo, int divisor) {
		
		int cantidadRestas = 0;
		
		if(dividendo >= divisor) {
			
			cantidadRestas++;
			
			return division((dividendo - divisor), divisor) + cantidadRestas;
			
		}
		
		return 0;
	}
	
}