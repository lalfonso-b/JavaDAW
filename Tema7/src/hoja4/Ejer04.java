package hoja4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Ejer04 extends JFrame {

	public Ejer04() {
		super("Paleta");
		setSize(230, 300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel lblRojo = new JLabel("Rojo");
		JSlider sldRojo = new JSlider(JSlider.HORIZONTAL, 0, 255, 250);

		JLabel lblVerde = new JLabel("Verde");
		JSlider sldVerde = new JSlider(JSlider.HORIZONTAL, 0, 255, 200);

		JLabel lblAzul = new JLabel("Azul");
		JSlider sldAzul = new JSlider(JSlider.HORIZONTAL, 0, 255, 50);

		sldRojo.setMajorTickSpacing(50);
		sldVerde.setMajorTickSpacing(50);
		sldAzul.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldVerde.setMinorTickSpacing(25);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintLabels(true);
		sldVerde.setPaintLabels(true);
		sldRojo.setPaintLabels(true);
		sldAzul.setPaintTicks(true);
		sldRojo.setPaintTicks(true);
		sldVerde.setPaintTicks(true);

		JButton btnAmarillo = new JButton();
		btnAmarillo.setBackground(Color.ORANGE);
		btnAmarillo.setPreferredSize(new Dimension(90, 25));

		JTextField txtColor = new JTextField("#FFC833");

		add(lblRojo);
		add(sldRojo);
		add(lblVerde);
		add(sldVerde);
		add(lblAzul);
		add(sldAzul);
		add(btnAmarillo);
		add(txtColor);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer04();
	}

}