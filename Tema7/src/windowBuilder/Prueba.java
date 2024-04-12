package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Prueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JMenu mnArchivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prueba() {
		setTitle("Pruebas con WindowBuilder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		mnArchivo = new JMenu("Archivo");
		barraMenu.add(mnArchivo);
		
		JMenuItem itemNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(itemNuevo);
		
		JMenuItem itemAbrir = new JMenuItem("Abrir");
		mnArchivo.add(itemAbrir);
		
		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);
		
		JMenuItem itemCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(itemCerrar);
		
		JMenuItem itemSalir = new JMenuItem("Salir");
		itemSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnArchivo.add(itemSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 12, 70, 15);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(12, 34, 151, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(15);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(12, 65, 70, 15);
		contentPane.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(12, 87, 151, 19);
		contentPane.add(txtApellidos);
		
		JScrollPane scrComentarios = new JScrollPane();
		scrComentarios.setBounds(224, 12, 214, 218);
		contentPane.add(scrComentarios);
		
		JTextArea txtComentarios = new JTextArea();
		scrComentarios.setViewportView(txtComentarios);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(12, 118, 70, 15);
		contentPane.add(lblProvincia);
		
		JComboBox<String> cmbProvincias = new JComboBox<>();
		cmbProvincias.setModel(new DefaultComboBoxModel<String>(new String[] {"Alicante", "Albacete", "Murcia", "Islas Baleares"}));
		cmbProvincias.setBounds(12, 145, 151, 24);
		contentPane.add(cmbProvincias);
	}
}
