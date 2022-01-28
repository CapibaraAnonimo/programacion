package ejercicio3;

public class Furgoneta extends VehiculoMotorizado {

	public Furgoneta(int cilindrada, int caballos, int tipoCombustible) {
		super(cilindrada, caballos, tipoCombustible);
	}
	
	@Override
	public double calcularImpuesto() {
		return super.calcularImpuesto() + 20.5;
	}

}
