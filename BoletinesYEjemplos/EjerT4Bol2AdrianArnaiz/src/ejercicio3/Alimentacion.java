package ejercicio3;

public class Alimentacion extends Producto implements Pudrible {
	private double descuentoCaducidadProxima;
	private int diasCaducidad;

	public Alimentacion(double precioUnitario, String nombre, int idProducto, double descuentoCaducidadProxima,
			int diasCaducidad) {
		super(precioUnitario, nombre, idProducto);
		this.descuentoCaducidadProxima = descuentoCaducidadProxima;
		this.diasCaducidad = diasCaducidad;
	}

	public double getDescuentoCaducidadProxima() {
		return descuentoCaducidadProxima;
	}

	public void setDescuentoCaducidadProxima(double descuentoCaducidadProxima) {
		this.descuentoCaducidadProxima = descuentoCaducidadProxima;
	}

	public int getDiasCaducidad() {
		return diasCaducidad;
	}

	public void setDiasCaducidad(int diasCaducidad) {
		this.diasCaducidad = diasCaducidad;
	}

	public boolean tieneDescuento() {
		int dias = 2;
		if (diasCaducidad <= dias)
			return true;
		else
			return false;
	}

	@Override
	public double calcularPrecio() {
		if (tieneDescuento())
			return super.calcularPrecio() * (1 - (descuentoCaducidadProxima / 100));
		else
			return super.calcularPrecio();

	}

	@Override
	public String toString() {
		return "Alimentacion [descuentoCaducidadProxima=" + descuentoCaducidadProxima + ", diasCaducidad="
				+ diasCaducidad + ", precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", idProducto="
				+ idProducto + "]";
	}

	@Override
	public String avisoCaducidad(int diasCaducidad) {
		int diasDescuento = 2;
		if(tieneDescuento()) {
			return "\tSe aplica descuento por caducidad próxima";
		}
		else
			return "";
	}

}
