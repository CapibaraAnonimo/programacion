package ejercicio6;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(double saldo, double mantenimiento) {
		super(saldo, mantenimiento);
	}

	@Override
	public void sacarDinero(double cantidad) {
		puntos++;
		saldo = saldo - cantidad;
	}

	@Override
	public void ingresarDinero(double cantidad) {
		puntos++;
		saldo = saldo + cantidad;
	}

}
