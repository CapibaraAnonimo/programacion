package ejercicio;
/**
 * Clase deposito
 * @author Adrián
 * @since 1.3
 * @version 2.4
 */
public class Deposito {
	/**
	 * Se guarda la altura del deposito
	 */
	private double altura;
	private double radio;
	private int litros;
	private double coste;
	/**
	 * 
	 * Crea el objeto
	 * @param altura Es la altura del deposito
	 * @param radio
	 * @param litros
	 * @param coste
	 */
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
		return altura*Math.PI*Math.pow(radio, 2); //Se calcula el volumen
	}
	
	@Override
	public String toString() {
		return "Litros: " + litros;
	}

}
