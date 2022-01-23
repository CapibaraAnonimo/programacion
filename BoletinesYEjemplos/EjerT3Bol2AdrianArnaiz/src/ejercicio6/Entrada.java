package ejercicio6;

public class Entrada {
	private int id;
	private double precio;
	private boolean libre;
	private int fila;
	private int butaca;
	
	public Entrada(int id, double precio, int fila, int butaca) {
		this.id = id;
		this.precio = precio;
		this.libre = true;
		this.fila = fila;
		this.butaca = butaca;
	}
	
	public boolean isLibre() {
		return libre;
	}
	
	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + "\nFila: " + fila + "\nButaca: " + butaca;
	}
	
}
