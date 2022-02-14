package ejercicio6;

public class CuentaEmpresa extends Cuenta {

	public CuentaEmpresa(double saldo, double mantenimiento) {
		super(saldo, mantenimiento);
		this.mantenimiento = 0;
	}

	@Override
	public void sacarDinero(double cantidad) {
		double penalizacion = 1;
		saldo = saldo - cantidad - penalizacion;
	}

	@Override
	public void ingresarDinero(double cantidad) {
		saldo = saldo + cantidad;
	}

}
