package ejercicio5;

public class EmpleadoFijo extends Empleado {
	private double impuesto;

	public EmpleadoFijo(String nombre, double sueldoBase, double recaudado, int idEmpleado, double impuesto) {
		super(nombre, sueldoBase, recaudado, idEmpleado);
		this.impuesto = impuesto;
	}

	@Override
	public double calcularSueldo() {
		int cien = 100;
		return super.calcularSueldo() * (1 - (impuesto / cien));
	}

}
