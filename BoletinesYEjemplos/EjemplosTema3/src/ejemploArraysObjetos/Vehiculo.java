package ejemploArraysObjetos;

public class Vehiculo {
	// Atributos
	private String modelo;
	private double potencia;

	// Constructores
	public Vehiculo() {
	}

	public Vehiculo(String modelo, double potencia) {
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", potencia=" + potencia + "]";
	}
}
