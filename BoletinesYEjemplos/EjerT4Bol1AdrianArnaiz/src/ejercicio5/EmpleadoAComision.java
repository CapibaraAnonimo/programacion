package ejercicio5;

public class EmpleadoAComision extends Empleado {
	
	public EmpleadoAComision(String nombre, double sueldoBase, double recaudado, int idEmpleado, double incentivo) {
		super(nombre, sueldoBase, recaudado, idEmpleado);
	}
	
	public double calcularSueldo(double incentivo) {
		int cien = 100;
		return super.calcularSueldo() + recaudado*(incentivo/cien);
	}

}
