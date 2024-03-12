package ejemplos;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo14GridLayout extends JFrame {

	public Ejemplo14GridLayout() {

		super("Biblioteca");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new GridLayout(1, 2));

		setLocationRelativeTo(null);

		// Parte izquierda
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblTitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField(20);

		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField(20);

		panelIzquierdo.add(lblTitulo);
		panelIzquierdo.add(txtTitulo);
		panelIzquierdo.add(lblAutor);
		panelIzquierdo.add(txtAutor);

		// Parte derecha
		JButton btnAlta = new JButton("Alta");

		// Ventana
		add(panelIzquierdo);
		add(btnAlta);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo14GridLayout();
	}

}
