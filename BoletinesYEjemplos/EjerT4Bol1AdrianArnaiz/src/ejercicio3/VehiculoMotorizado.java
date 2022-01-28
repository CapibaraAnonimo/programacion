package ejercicio3;

public class VehiculoMotorizado {
	protected int cilindrada;
	protected int caballos;
	protected int tipoCombustible;
	
	
	public VehiculoMotorizado(int cilindrada, int caballos, int tipoCombustible) {
		super();
		this.cilindrada = cilindrada;
		this.caballos = caballos;
		this.tipoCombustible = tipoCombustible;
	}
	
	public double calcularImpuesto() {
		return 70.0;
	}
	
	@Override
	public String toString() {
		return "Cilindrada: " + cilindrada + "\nCaballos: " + caballos + "\nTipo de Combustible: " + tipoCombustible;
	}

}
