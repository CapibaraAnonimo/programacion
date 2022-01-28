package ejercicio3;

public class Coche extends VehiculoMotorizado {

	public Coche(int cilindrada, int caballos, int tipoCombustible) {
		super(cilindrada, caballos, tipoCombustible);
	}
	
	@Override
	public double calcularImpuesto() {
		return super.calcularImpuesto() + 0.25*((double) cilindrada);
	}

}
