
public class Paquete {

	private int codigo;
	private String destinatario;
	private Direccion direccion;

	public Paquete(int codigo, String destinatario, Direccion direccion) {
		this.codigo = codigo;
		this.destinatario = destinatario;
		this.direccion = direccion;
	}

	public String toString() {
		return codigo + " " + destinatario + " (" + direccion.toString() + ")";
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public int getCodigoPaquete() {
		return codigo;
	}

}
