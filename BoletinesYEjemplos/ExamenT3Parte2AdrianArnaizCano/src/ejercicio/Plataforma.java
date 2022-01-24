package ejercicio;

public class Plataforma {
	private Deposito depositos[];
	private static double capacidadTotal;
	
	public Plataforma() {
		depositos = new Deposito[100];
	}
	
	public double getCapacidadTotal() {
		return capacidadTotal;
	}
	
	public void anyadirDeposito(double altura, double radio, int litros, double coste) {
		for(int i = 0; i < depositos.length; i++) {
			if(depositos[i] == null) {
				depositos[i] = new Deposito(altura, radio, litros, coste);
				capacidadTotal = capacidadTotal + metrosALitros(depositos[i].calcularVolumen());
				i = depositos.length;
			}
		}
	}
	
	public double metrosALitros(double metros) {
		return metros/1000;
	}
	
	public double calcularPrecioVenta(int deposito, double porcentaje) {
		if(depositos[deposito-1] != null)
			return depositos[deposito-1].getCoste()*(1+(porcentaje/100));
		else
			return 0;
	}
	
	public double litrosPlataforma() {
		double litros = 0;
		for(int i = 0; i < depositos.length; i++) {
			if(depositos[i] != null)
				litros = litros + depositos[i].getLitros();
			else
				i = depositos.length;
		}
		return litros;
	}
	
	public double gananciasDeposito(int deposito, double precio) {
		if(depositos[deposito-1] != null)
			return depositos[deposito-1].getLitros()*precio;
		else
			return 0;
	}
	
	public double gananciasPlataforma(double precio) {
		double ganancia = 0;
		for(int i = 0; i < depositos.length; i++) {
			if(depositos[i] != null)
				ganancia = ganancia + gananciasDeposito(i+1, precio);
			else
				i = depositos.length;
		}
		return ganancia;
	}
	
	public double gananciaPlataformaLlena(double precio) {
		return capacidadTotal*precio;
	}

	public void imprimirDepositos() {
		for(int i = 0; i < depositos.length; i++) {
			if(depositos[i] != null)
				System.out.println((i+1) + ".\n" + depositos[i]);
		}
	}
	
}
