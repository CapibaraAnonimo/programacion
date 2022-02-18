package ejercicio;

public class Visitante implements IEntrada {
	protected String nombre;
	protected int id;
	protected double precioBase;
	protected int edad;

	public Visitante(String nombre, int id, double precioBase, int edad) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.precioBase = precioBase;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public double calcularPrecioEntrada() {
		int menores = 0;
		double descuentoAbu = 50;

		if (edad < 18)
			return menores;
		else if (edad >= 18 && edad <= 65)
			return precioBase;
		else
			return precioBase * (1 - (descuentoAbu / 100));
	}

	@Override
	public String toString() {
		return nombre + "\tid = " + id + "\tedad = " + edad;
	}

}
