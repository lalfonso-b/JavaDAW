package hoja2Bucles;
import java.util.Scanner;


public class Ejer17 {


public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

System.out.println("Introduce un número");

int num = entrada.nextInt();

for (int mult = 1; mult <= 10; mult++) {

System.out.println(num + " x " + mult + " = " + (num*mult));

}


}


}