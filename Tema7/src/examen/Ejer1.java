package examen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejer1 extends JFrame {
	private JLabel lblImagen;

	public Ejer1() {
		super("Fotos aleatorias");
		setSize(500, 380);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		lblImagen = new JLabel(new ImageIcon("imgs/arbol01.png"));
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setPreferredSize(new Dimension(100, 30));
		
		JButton btnReset = new JButton("Reset");
		btnReset.setPreferredSize(new Dimension(100, 30));
		
		add(lblImagen);
		add(btnSiguiente);
		add(btnReset);
		
		btnSiguiente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cambiarImagen();
			}
		});
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblImagen.setIcon(new ImageIcon("imgs/arbol01.png"));
			}
		});
		setVisible(true);
	}

	private void cambiarImagen() {
		String[] archivos = { "arbol01.png", "arbol02.png", "arbol03.png", "arbol04.png", "arbol05.png",
				"arbol06.png" };
		int numAleatorio = (int) (Math.random() * 6);
		lblImagen.setIcon(new ImageIcon("imgs/" + archivos[numAleatorio]));
	}

	public static void main(String[] args) {
		new Ejer1();
	}
}







