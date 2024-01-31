package ejemplo13CuentaBancaria;

public class CuentaBancaria {

	private double saldo;

	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double cantidad) {
		saldo = saldo + cantidad;
	}

	public void depositar(double cantidad, double comision) {

		double cantidadReal = cantidad - comision * cantidad / 100;
		saldo = saldo + cantidadReal;

	}

	public boolean retirar(double cantidad) {
		if (cantidad <= saldo) {
			saldo -= cantidad;
			return true;
		}
		return false;

	}

	public boolean retirar(double cantidad, double comision) {

		double cantidadReal = cantidad + comision * cantidad / 100;
		if (cantidadReal <= saldo) {
			saldo = saldo - cantidadReal;
			return true;
		}

		return false;

	}

	public double obtenerSaldo() {
		return saldo;
	}
}
