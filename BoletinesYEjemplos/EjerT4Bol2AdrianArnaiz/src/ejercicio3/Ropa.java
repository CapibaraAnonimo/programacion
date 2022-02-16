package ejercicio3;

public class Ropa extends Producto {
	private double descuetnoGeneral;

	public Ropa(double precioUnitario, String nombre, int idProducto, double descuetnoGeneral) {
		super(precioUnitario, nombre, idProducto);
		this.descuetnoGeneral = descuetnoGeneral;
	}

	public double getDescuetnoGeneral() {
		return descuetnoGeneral;
	}

	public void setDescuetnoGeneral(double descuetnoGeneral) {
		this.descuetnoGeneral = descuetnoGeneral;
	}

	@Override
	public double calcularPrecio() {
		return super.calcularPrecio() * (1 - (descuetnoGeneral / 100));
	}

	@Override
	public String toString() {
		return "Ropa [descuetnoGeneral=" + descuetnoGeneral + ", precioUnitario=" + precioUnitario + ", nombre="
				+ nombre + ", idProducto=" + idProducto + "]";
	}

}
