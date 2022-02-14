package ejercicio6;

public abstract class Cuenta {
	protected double saldo;
	protected double mantenimiento;
	protected int puntos;
	
	public Cuenta(double saldo, double mantenimiento) {
		this.saldo = saldo;
		this.mantenimiento = mantenimiento;
		puntos = 0;
	}
	
	public abstract void sacarDinero(double cantidad);
	
	public abstract void ingresarDinero(double cantidad);

}
