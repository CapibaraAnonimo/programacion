package ejercicio4;

public class Producto {
	protected double precioUnitario;
	protected String nombre;
	protected int idProducto;

	public Producto(double precioUnitario, String nombre, int idProducto) {
		super();
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.idProducto = idProducto;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", idProducto=" + idProducto + "]";
	}

	public double calcularPrecio() {
		return precioUnitario;
	}

}
