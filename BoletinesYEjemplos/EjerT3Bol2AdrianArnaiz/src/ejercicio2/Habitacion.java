package ejercicio2;

public class Habitacion {
	private int tipo;
	private double precioBase;
	private boolean servivioExtra;
	private String nombreCliente;
	private int dias;
	private boolean ocupada;
	private boolean hecha;
	
	public Habitacion(int tipo, double precioBase, boolean servivioExtra, String nombreCliente, int dias,
			boolean ocupada, boolean hecha) {
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.servivioExtra = servivioExtra;
		this.nombreCliente = nombreCliente;
		this.dias = dias;
		this.ocupada = ocupada;
		this.hecha = hecha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isServivioExtra() {
		return servivioExtra;
	}

	public void setServivioExtra(boolean servivioExtra) {
		this.servivioExtra = servivioExtra;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public boolean isHecha() {
		return hecha;
	}

	public void setHecha(boolean hecha) {
		this.hecha = hecha;
	}

	
}
