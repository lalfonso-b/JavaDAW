package examen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejer3 extends JFrame {
	
	private final double CARGA_MAXIMA = 150;
	private double cargaTotal = 0;

	public Ejer3() {
		super("Payload");
		setSize(400, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);
		
		String[][] cargas = { { "Detector de partículas de alta energía", "19.2" },
				{ "Subsistema espectrómetro de plasma", "12.5" }, { "Analizador de polvo cósmico", "40" },
				{ "Magnetómetro", "4.5" }, { "Detector de ondas de plasma", "51" }, { "Espectrómetro de masas", "43" },
				{ "Instrumento para radioastronomía planetaria", "80" } };
		
		JLabel lblCarga = new JLabel("Elija las cargas (carga máxima, " + CARGA_MAXIMA + " kg):");
		
		JComboBox<String> cmbCargas = new JComboBox<String>();
		cmbCargas.setPreferredSize(new Dimension(370, 30));
		
		for (int i = 0; i < cargas.length; i++) {
			cmbCargas.addItem(cargas[i][0] + " (" + cargas[i][1] + " kg)");
		}
		
		JButton btnAdd = new JButton("Añadir carga");
		btnAdd.setPreferredSize(new Dimension(150, 30));
		
		JTextArea txtCarga = new JTextArea();
		JScrollPane scrCarga = new JScrollPane(txtCarga);
		scrCarga.setPreferredSize(new Dimension(370, 100));
		
		JLabel lblCargaTotal = new JLabel("0 kg");
		lblCargaTotal.setFont(new Font("Arial", Font.PLAIN, 70));
		lblCargaTotal.setPreferredSize(new Dimension(350, 100));
		
		add(lblCarga);
		add(cmbCargas);
		add(btnAdd);
		add(scrCarga);
		add(new JLabel("Carga total:"));
		add(lblCargaTotal);
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int pos = cmbCargas.getSelectedIndex();
				
				cargaTotal = cargaTotal + Double.parseDouble(cargas[pos][1]);
				
				txtCarga.append(cargas[pos][0] + " ... " + cargas[pos][1] + " kg\n");
				
				lblCargaTotal.setText(redondear(cargaTotal) + " kg");
				
				if (cargaTotal > CARGA_MAXIMA) {
					JOptionPane.showMessageDialog(null, "El peso de la carga ha superado el máximo permitido",
							"Payload", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		setVisible(true);
	}

	private double redondear(double num) {
		return Math.round(num * 100) / 100.0;
	}

	public static void main(String[] args) {
		new Ejer3();
	}
}