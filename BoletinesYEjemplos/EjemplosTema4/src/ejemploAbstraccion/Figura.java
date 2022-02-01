package ejemploAbstraccion;

public abstract class Figura{
	private double x;
	private double y;
	
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public abstract double calcularArea();
}