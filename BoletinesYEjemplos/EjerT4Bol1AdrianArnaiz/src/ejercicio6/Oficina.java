package ejercicio6;

public class Oficina {
	private Cuenta cuentas[];
	private double dineros;
	private double ganancias;
	private double perdidas;

	public Oficina(Cuenta[] cuentas, double dineros) {
		super();
		this.cuentas = cuentas;
		this.dineros = dineros;
	}

	public void sacarDinero(int cliente, double cantidad) {
		cuentas[cliente - 1].sacarDinero(cantidad);
		dineros = dineros - cantidad;
		if (cuentas[cliente - 1] instanceof CuentaEmpresa)
			ganancias++;
	}

	public void ingresarDinero(int cliente, double cantidad) {
		cuentas[cliente - 1].ingresarDinero(cantidad);
		dineros = dineros + cantidad;
		if (cuentas[cliente - 1] instanceof CuentaJoven)
			perdidas++;
	}

	public double devolverGanancias() {
		return ganancias;
	}

	public double devolverPerdidas() {
		return perdidas;
	}

}
