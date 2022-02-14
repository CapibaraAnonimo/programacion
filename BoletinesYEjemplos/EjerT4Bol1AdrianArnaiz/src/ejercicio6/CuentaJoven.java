package ejercicio6;

public class CuentaJoven extends Cuenta {

	public CuentaJoven(double saldo, double mantenimiento) {
		super(saldo, mantenimiento);
		this.mantenimiento = 0;
	}

	@Override
	public void sacarDinero(double cantidad) {
		saldo = saldo - cantidad;

	}

	@Override
	public void ingresarDinero(double cantidad) {
		double regalo = 1.0;
		saldo = saldo + cantidad + regalo;

	}

}
