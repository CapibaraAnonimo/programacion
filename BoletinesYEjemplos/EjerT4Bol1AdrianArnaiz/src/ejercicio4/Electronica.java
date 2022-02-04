package ejercicio4;

public class Electronica extends Producto {
	private double impuesto;

	public Electronica(double precioUnitario, String nombre, int idProducto, double impuesto) {
		super(precioUnitario, nombre, idProducto);
		this.impuesto = impuesto;
	}

	public double getimpuesto() {
		return impuesto;
	}

	public void setimpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public double calcularPrecio() {
		return super.calcularPrecio() * (1 - (impuesto / 100));
	}

	@Override
	public String toString() {
		return "Electronica [impuesto=" + impuesto + ", precioUnitario=" + precioUnitario + ", nombre=" + nombre
				+ ", idProducto=" + idProducto + "]";
	}

}
