package ejercicio4;

public class CEcuacion2Grado {
	private double a;
	private double b;
	private double c;

	public CEcuacion2Grado(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
	}

	public double[] calcularRaices() {
		double raices[] = new double[2];
		double discriminante = discriminante();
		try {
			if (discriminante < 0)
				throw new DiscriminanteNegativoException(discriminante);
		} catch (DiscriminanteNegativoException e) {
			System.out.println(e);
		}
		raices[0] = (Math.sqrt(discriminante) - b) / 2 * a;
		raices[1] = (-Math.sqrt(discriminante) - b) / 2 * a;
		return raices;
	}

	public double discriminante() {
		return Math.pow(b, 2) + (-4 * a * c);
	}

}
