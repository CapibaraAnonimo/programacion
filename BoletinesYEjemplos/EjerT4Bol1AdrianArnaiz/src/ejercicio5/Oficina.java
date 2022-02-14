package ejercicio5;

public class Oficina {
	private Empleado empleados[];

	public Oficina(Empleado[] empleados) {
		super();
		this.empleados = empleados;
	}
	
	public double calcularSueldo(int empleado, double impuesto) {
		return empleados[empleado-1].calcularSueldo(impuesto);
	}
	
	public double CalcularTotal(double impuesto) {
		double total = 0;
		for(int i = 0; i < empleados.length; i++) {
			if(empleados[i] == null)
				i = empleados.length;
			else
				total = total + empleados[i].calcularSueldo(impuesto);
		}
		return total;
	}

}
