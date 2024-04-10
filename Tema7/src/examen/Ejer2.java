package examen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejer2 extends JFrame {
	

	public Ejer2() {
		super("Potencia");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);
		
		JLabel lblPotencia = new JLabel("Ajuste la potencia (en CV):");
		
		JSlider sldPotencia = new JSlider(JSlider.HORIZONTAL, 0, 2000, 300);
		sldPotencia.setMajorTickSpacing(500);
		sldPotencia.setMinorTickSpacing(100);
		sldPotencia.setPaintLabels(true);
		sldPotencia.setPaintTicks(true);
		sldPotencia.setPreferredSize(new Dimension(300, 40));
		
		JProgressBar prgPotencia = new JProgressBar(JProgressBar.VERTICAL, 0, 2000);
		prgPotencia.setValue(300);
		prgPotencia.setStringPainted(true);
		prgPotencia.setForeground(Color.GREEN);
		prgPotencia.setPreferredSize(new Dimension(50, 220));
		
		add(lblPotencia);
		add(sldPotencia);
		add(prgPotencia);
		
		sldPotencia.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				prgPotencia.setValue(sldPotencia.getValue());
				if (sldPotencia.getValue() <= 1400) {
					prgPotencia.setForeground(Color.GREEN);
				} else if (sldPotencia.getValue() <= 1800) {
					prgPotencia.setForeground(Color.ORANGE);
				} else {
					prgPotencia.setForeground(Color.RED);
				}
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer2();
	}
}