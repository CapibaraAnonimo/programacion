package ejercicio3;

public class OficinaDeRecaudacionForzosa {
	private VehiculoMotorizado vehiculos[];
	
	public OficinaDeRecaudacionForzosa(VehiculoMotorizado v[]) {
		vehiculos = v;
	}
	
	public double calcularTotalImpuestos() {
		double total = 0;
		for(int i = 0; i < vehiculos.length; i++) {
			total = total + vehiculos[i].calcularImpuesto();
		}
		return total;
	}
	
	public double totalImpuestosMotocicletas() {
		double total = 0;
		for(int i = 0; i < vehiculos.length; i++) {
		}
		return total;
	}

}
