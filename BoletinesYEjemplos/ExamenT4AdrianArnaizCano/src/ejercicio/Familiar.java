package ejercicio;

public class Familiar extends Visitante {
	private int hijosCentro;

	public Familiar(String nombre, int id, double precioBase, int edad, int hijosCentro) {
		super(nombre, id, precioBase, edad);
		this.hijosCentro = hijosCentro;
	}

	@Override
	public double calcularPrecioEntrada() {
		double descuentoPorHijo = 1;
		if (super.calcularPrecioEntrada() - hijosCentro * descuentoPorHijo < 0)
			return 0;
		return super.calcularPrecioEntrada() - hijosCentro * descuentoPorHijo;
	}

	@Override
	public String toString() {
		return super.toString() + "\tNumero hijos en el centro = " + hijosCentro;
	}

}
