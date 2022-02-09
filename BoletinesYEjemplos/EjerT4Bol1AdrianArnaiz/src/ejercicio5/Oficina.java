package ejercicio5;

public class Oficina {
	private Empleado empleados[];
	private int numeroEmleados;

	public Oficina(Empleado[] empleados) {
		super();
		this.empleados = empleados;
		numeroEmleados = empleados.length;
	}
	
	public double calcularSueldo(int empleado, double modificador) {
		if(empleados[empleado-1] instanceof EmpleadoFijo) {
			return ((EmpleadoFijo)empleados[empleado]).calcularSueldo(modificador);
		}
		else if(empleados[empleado-1] instanceof EmpleadoAComision) {
			return ((EmpleadoAComision)empleados[empleado]).calcularSueldo(modificador);
		}
		else {
			return empleados[empleado].calcularSueldo();
		}
	}
	
	public double CalcularTotal() {
		double total = 0;
		for(int i = 0; i < empleados.length; i++) {
			
		}
		return 100;
	}

}
