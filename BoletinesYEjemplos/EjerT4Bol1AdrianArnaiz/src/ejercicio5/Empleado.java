package ejercicio5;

public class Empleado {
	protected String nombre;
	protected double sueldoBase;
	protected double recaudado;
	protected int idEmpleado;

	public Empleado(String nombre, double sueldoBase, double recaudado, int idEmpleado) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.recaudado = recaudado;
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getRecaudado() {
		return recaudado;
	}

	public void setRecaudado(double recaudado) {
		this.recaudado = recaudado;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public double calcularSueldo(double impuesto) {
		return sueldoBase;
	}

}
