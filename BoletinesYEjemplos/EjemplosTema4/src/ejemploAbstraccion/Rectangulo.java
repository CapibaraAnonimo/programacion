package ejemploAbstraccion;

public class Rectangulo extends Figura {
	private double altura, base;
	
	public Rectangulo(double x, double y, double b, double h) {
		super(x, y);
		this.base = b;
		this.altura = h;
	}
	
	@Override
	public double calcularArea() {
		return base*altura;
	}

}
