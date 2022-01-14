package ejercicio;

public class Piso {
	private String direccion = new String();
	private int metros2 = 0;
	private boolean reformar = true;
	private int precioVenta = 0;
	
	public Piso(String direccion, int metros2, boolean reformar, int precioVenta) {
		this.direccion = direccion;
		this.metros2 = metros2;
		this.reformar = reformar;
		this.precioVenta = precioVenta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMetros2() {
		return metros2;
	}

	public void setMetros2(int metros2) {
		this.metros2 = metros2;
	}

	public boolean isReformar() {
		return reformar;
	}

	public void setReformar(boolean reformar) {
		this.reformar = reformar;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	@Override
	public String toString() {
		String ref = new String("No");
		if(reformar)
			ref = "Sí";
		return "\n\nDireccion: " + direccion + "\nMetros Cuadrados: " + metros2 + "\nPara Reformar: " 
					+ ref + "\nPrecio: " + precioVenta;
	}
	
}
