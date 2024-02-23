package ejemplos;

import javax.swing.JFrame;

public class Ejemplo01JFrame extends JFrame{
	
	public Ejemplo01JFrame() {
		
		super("Hola, Mundo!");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}

}
