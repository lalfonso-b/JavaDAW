import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Paleta extends JFrame implements ChangeListener {

	private JSlider sldRojo, sldVerde, sldAzul;
	private JButton btnColor;
	private JTextField txtColor;

	public static void main(String[] args) {
		new Paleta();
	}

	public Paleta() {

		super("Paleta");
		setSize(230, 330);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblRojo = new JLabel("Rojo");
		sldRojo = new JSlider(JSlider.HORIZONTAL, 0, 255, 255);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintLabels(true);
		sldRojo.setPaintTicks(true);

		sldRojo.addChangeListener(this);

		JLabel lblVerde = new JLabel("Verde");
		sldVerde = new JSlider(JSlider.HORIZONTAL, 0, 255, 200);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintLabels(true);
		sldVerde.setPaintTicks(true);

		sldVerde.addChangeListener(this);

		JLabel lblAzul = new JLabel("Azul");
		sldAzul = new JSlider(JSlider.HORIZONTAL, 0, 255, 50);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintLabels(true);
		sldAzul.setPaintTicks(true);

		sldAzul.addChangeListener(this);

		btnColor = new JButton("                          ");
		btnColor.setBackground(new Color(255, 200, 50));

		txtColor = new JTextField(6);
		txtColor.setText("#FFC833");

		add(lblRojo);
		add(sldRojo);
		add(lblVerde);
		add(sldVerde);
		add(lblAzul);
		add(sldAzul);
		add(btnColor);
		add(txtColor);

		setVisible(true);

	}

	@Override
	public void stateChanged(ChangeEvent e) {

		int rojo = sldRojo.getValue();
		int verde = sldVerde.getValue();
		int azul = sldAzul.getValue();

		btnColor.setBackground(new Color(rojo, verde, azul));

		txtColor.setText(hexadecimal(rojo, verde, azul));

	}

	private String hexadecimal(int rojo, int verde, int azul) {

		return "#" + aHexadecimal(rojo) + aHexadecimal(verde) + aHexadecimal(azul);

	}

	// Convierte un número de 0 a 255 en un número hexadecimal de dos cifras.
	private String aHexadecimal(int valor) {

		int cifra1 = valor / 16;
		int cifra2 = valor % 16;

		String caracter1 = caracterHex(cifra1);
		String caracter2 = caracterHex(cifra2);

		return caracter1 + caracter2;

	}

	// Convierte un número decimal entre 0 y 15 a hexadecimal.
	private String caracterHex(int cifra) {

		String caracteres[] = { "A", "B", "C", "D", "E", "F" };
		String caracter;

		if (cifra < 10) {
			caracter = "" + cifra;
		} else {
			caracter = caracteres[cifra - 10];
		}

		return caracter;

	}

}