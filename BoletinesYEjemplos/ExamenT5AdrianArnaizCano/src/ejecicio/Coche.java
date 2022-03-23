package ejecicio;

public class Coche implements Comparable<Coche> {
	private String matricula;
	private String marca;
	private String modelo;
	private int precio;
	private String color;

	public Coche(String matricula, String marca, String modelo, int precio, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", color=" + color + "]";
	}

	@Override
	public int compareTo(Coche o) {
		return matricula.compareToIgnoreCase(o.getMatricula());
	}
	

}
