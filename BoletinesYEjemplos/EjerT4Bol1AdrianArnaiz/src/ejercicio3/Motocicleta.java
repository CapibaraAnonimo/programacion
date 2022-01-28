package ejercicio3;

public class Motocicleta extends VehiculoMotorizado {

	public Motocicleta(int cilindrada, int caballos, int tipoCombustible) {
		super(cilindrada, caballos, tipoCombustible);
	}
	
	@Override
	public double calcularImpuesto() {
		return super.calcularImpuesto() + ((double) caballos)*0.60;
	}

}
