package ejercicio;

/**
 * Una clase que gestiona los depositos de una plataforma petrolifera
 * @author Adrián Arnaiz
 * @see java.util.Arrays
 * @since 15/1/2022
 * @version 1.0
 */
public class Plataforma {
	/**
	 * Aquí se guarda la lista de depositos
	 */
	private Deposito depositos[];
	private static double capacidadTotal;
	
	/**
	 * Constructor de Plataforma
	 */
	public Plataforma() {
		depositos = new Deposito[100];
	}
	
	public double getCapacidadTotal() {
		return capacidadTotal;
	}
	
	/**
	 * 
	 * @param altura altura del deposito que se va a añadir
	 * @param radio radio del deposito que se va a añadir
	 * @param litros litros del deposito que se va a añadir
	 * @param coste coste de construccion del deposito que se va a añadir
	 */
	public void anyadirDeposito(double altura, double radio, int litros, double coste) {
		for(int i = 0; i < depositos.length; i++) {
			if(depositos[i] == null) {
				depositos[i] = new Deposito(altura, radio, litros, coste);
				capacidadTotal = capacidadTotal + metrosALitros(depositos[i].calcularVolumen());
				i = depositos.length;
			}
		}
	}
	
	/**
	 * Se pasa de metros cubicos a litros
	 * @param metros metros cubicos que se quieren convertir
	 * @return los litros que equivalen a los metros cubicos pasados
	 */
	public double metrosALitros(double metros) {
		return metros/1000;
	}
	
	/**
	 * Se caclcula el precio de venta de un deposito dado un porcentaje extra
	 * @param deposito el ddeposito al que se quiere calcular el precio
	 * @param porcentaje porcentaje que se uiere ganar
	 * @return el precio final de venta del deposito
	 */
	public double calcularPrecioVenta(int deposito, double porcentaje) {
		if(depositos[deposito-1] != null)
			return depositos[deposito-1].getCoste()*(1+(porcentaje/100));
		else
			return 0;
	}
	
	/**
	 * 
	 * @return litros que contiene la plataforma entre todos los depositos
	 */
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
	
	/**
	 * Se calcula las ganancias de un depositos dado sabiendo el precio del petroleo
	 * @param deposito deposito que se quiere saber su ganancia
	 * @param precio precio del combustible
	 * @return las ganancias del deposito deseado
	 */
	public double gananciasDeposito(int deposito, double precio) {
		if(depositos[deposito-1] != null)
			return depositos[deposito-1].getLitros()*precio;
		else
			return 0;
	}
	
	/**
	 * Se calculan las ganancias de toda la plataforma sabiendo el precio del petroleo
	 * @param precio percio del petroleo
	 * @return las ganancias totales de la plataforma
	 */
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
	
	/**
	 * Ganancias hipoteticas de la plataforma llena
	 * @param precio precio del petroleo
	 * @return las ganancias si la plataforma estuviera llena
	 */
	public double gananciaPlataformaLlena(double precio) {
		return capacidadTotal*precio;
	}

	/**
	 * Se imprimen los datos del deposito deseado si existe
	 */
	public void imprimirDepositos() {
		for(int i = 0; i < depositos.length; i++) {
			if(depositos[i] != null)
				System.out.println((i+1) + ".\n" + depositos[i]);
		}
	}
	
}
