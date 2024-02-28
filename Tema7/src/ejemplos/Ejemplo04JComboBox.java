package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo04JComboBox extends JFrame {

	public Ejemplo04JComboBox() {

		super("Provincias");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblProvincia = new JLabel("Selecciona tu provincia preferida:");
		JComboBox<String> cmbProvincias = new JComboBox<>();
		cmbProvincias.addItem("Islas Baleares");
		cmbProvincias.addItem("Alicante");
		cmbProvincias.addItem("Murcia");
		cmbProvincias.addItem("Valencia");
		cmbProvincias.addItem("Jaén");
		cmbProvincias.addItem("Albacete");

		add(lblProvincia);
		add(cmbProvincias);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo04JComboBox ventana = new Ejemplo04JComboBox();
	}

}
