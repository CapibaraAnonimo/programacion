package ejercicio4;

public class DiscriminanteNegativoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DiscriminanteNegativoException(double discriminante) {
		System.out.println("La ecuación con discrimante " + discriminante + " genera raices imaginarias");
	}

}
