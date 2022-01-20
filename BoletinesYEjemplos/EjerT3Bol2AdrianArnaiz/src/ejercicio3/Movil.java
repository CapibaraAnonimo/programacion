package ejercicio3;

public class Movil {
	private String marca;
	private String modelo;
	private boolean vendido;
	private double precioUnitario;
	
	public Movil(String marca, String modelo, double precioUnitario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = false;
		this.precioUnitario = precioUnitario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	@Override
	public String toString() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precioUnitario;
	}
	
}
