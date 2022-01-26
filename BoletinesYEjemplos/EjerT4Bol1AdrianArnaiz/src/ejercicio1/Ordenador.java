package ejercicio1;

public class Ordenador {
	private int capacidadGb;
	private int hz;
	private double precioBase;
	
	public Ordenador(int capacidadGb, int hz, double precioBase) {
		super();
		this.capacidadGb = capacidadGb;
		this.hz = hz;
		this.precioBase = precioBase;
	}
	
	public double calcularPrecio() {
		return precioBase*1.30;
	}
	
	@Override
	public String toString() {
		return "Capacidad: "+ capacidadGb + "\nHz: " + hz + "\nPrecio Base: " + precioBase;
	}

}
