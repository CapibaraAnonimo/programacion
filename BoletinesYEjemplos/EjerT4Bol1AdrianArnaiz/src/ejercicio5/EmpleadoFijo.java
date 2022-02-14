package ejercicio5;

public class EmpleadoFijo extends Empleado {

	public EmpleadoFijo(String nombre, double sueldoBase, double recaudado, int idEmpleado) {
		super(nombre, sueldoBase, recaudado, idEmpleado);
	}

	public double calcularSueldo(double impuesto) {
		int cien = 100;
		return super.calcularSueldo(impuesto) * (1 - (impuesto / cien));
	}

}
