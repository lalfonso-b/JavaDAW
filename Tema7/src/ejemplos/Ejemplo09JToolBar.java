package ejemplos;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Ejemplo09JToolBar extends JFrame {

	public Ejemplo09JToolBar() {

		super("Barra de herramientas");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JToolBar tlbHerramientas = new JToolBar();

		ImageIcon imgNuevo = new ImageIcon("iconos/1.png");
		JButton btnNuevo = new JButton(imgNuevo);
		tlbHerramientas.add(btnNuevo);

		ImageIcon imgAbrir = new ImageIcon("iconos/52.png");
		JButton btnAbrir = new JButton(imgAbrir);
		tlbHerramientas.add(btnAbrir);

		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");
		JButton btnGuardar = new JButton(imgGuardar);
		tlbHerramientas.addSeparator();
		tlbHerramientas.add(btnGuardar);

		add(tlbHerramientas, BorderLayout.NORTH);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo09JToolBar();
	}

}
