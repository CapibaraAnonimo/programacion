package ejercicio1;

public class Portatil extends Ordenador {
	private int descuento;

	public Portatil(int capacidadGb, int hz, double precioBase, int descuento) {
		super(capacidadGb, hz, precioBase);
		this.descuento = descuento;
	}
	
	@Override
	public double calcularPrecio() {
		return super.calcularPrecio()*(1-(descuento/100));
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nDescuento: " + descuento;
	}

}
