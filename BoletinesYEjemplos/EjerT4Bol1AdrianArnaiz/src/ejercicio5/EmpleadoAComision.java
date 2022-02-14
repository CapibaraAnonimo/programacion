package ejercicio5;

public class EmpleadoAComision extends Empleado {
	private double incentivo;
	
	public EmpleadoAComision(String nombre, double sueldoBase, double recaudado, int idEmpleado, double incentivo) {
		super(nombre, sueldoBase, recaudado, idEmpleado);
		this.incentivo = incentivo;
	}
	
	public double calcularSueldo(double impuesto) {
		int cien = 100;
		double sueldo = super.calcularSueldo(impuesto) + recaudado*(incentivo/cien);
		if(sueldo >= 500)
			System.out.printf("Felicidades %s, ha ganado 500 o más euros\n", nombre);
		return sueldo;
	}

}
