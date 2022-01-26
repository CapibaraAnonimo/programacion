package ejemploHerencia;

public class Empleado extends Trabajador {
	int cosa2;

	public Empleado(int cosa1, int cosa2) {
		super(cosa1);
		this.cosa2 = cosa2;
	}
	
	@Override
	public double calcularPaga(){
		return cosa2*10.0;
	}
	
	
}
