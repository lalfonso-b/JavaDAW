package hoja2;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Ejer1 extends JFrame {

	public Ejer1() {

		super("Velocidad de crucero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);

		JSlider sld = new JSlider(10, 120, 90);

		sld.setPaintLabels(true);
		sld.setPaintTicks(true);
		sld.setMajorTickSpacing(20);
		sld.setMinorTickSpacing(5);

		add(sld);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer1 ventana = new Ejer1();

	}

}