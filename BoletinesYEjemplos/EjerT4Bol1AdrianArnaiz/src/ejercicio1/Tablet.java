package ejercicio1;

public class Tablet extends Ordenador {
	private double precioSeguro;

	public Tablet(int capacidadGb, int hz, double precioBase, double precioSeguro) {
		super(capacidadGb, hz, precioBase);
		this.precioSeguro = precioSeguro;
	}

	@Override
	public double calcularPrecio() {
		return super.calcularPrecio() + precioSeguro;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nPrecio Seguro: " + precioSeguro;
	}

}
