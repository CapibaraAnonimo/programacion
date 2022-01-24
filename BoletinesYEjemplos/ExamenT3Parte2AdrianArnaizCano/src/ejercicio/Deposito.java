package ejercicio;

public class Deposito {
	private double altura;
	private double radio;
	private int litros;
	private double coste;
	
	public Deposito(double altura, double radio, int litros, double coste) {
		this.altura = altura;
		this.radio = radio;
		this.litros = litros;
		this.coste = coste;
	}

	public double getCoste() {
		return coste;
	}
	
	public int getLitros() {
		return litros;
	}
	
	public double calcularVolumen() {
		return altura*Math.PI*Math.pow(radio, 2);
	}
	
	@Override
	public String toString() {
		return "Litros: " + litros;
	}

}
