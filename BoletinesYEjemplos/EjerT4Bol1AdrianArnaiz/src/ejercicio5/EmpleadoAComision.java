package ejercicio5;

public class EmpleadoAComision extends Empleado {
	private double incentivo;

	public EmpleadoAComision(String nombre, double sueldoBase, double recaudado, int idEmpleado, double incentivo) {
		super(nombre, sueldoBase, recaudado, idEmpleado);
		this.incentivo = incentivo;
	}
	
	@Override
	public double calcularSueldo() {
		int cien = 100;
		return super.calcularSueldo() + recaudado*(incentivo/100);
	}

}
