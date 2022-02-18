package ejercicio;

public class Empresario extends Visitante {
	private String empresa;
	private double aportePatrocinio;

	public Empresario(String nombre, int id, double precioBase, int edad, String empresa, double aportePatrocinio) {
		super(nombre, id, precioBase, edad);
		this.empresa = empresa;
		this.aportePatrocinio = aportePatrocinio;
	}

	@Override
	public double calcularPrecioEntrada() {
		double descuentoPatro = 10;
		if (aportePatrocinio >= 100)
			return super.calcularPrecioEntrada() * (1 - (descuentoPatro / 100));
		return super.calcularPrecioEntrada();
	}

	public String invitarCafe() {
		return "¡Consumición gratis!";
	}

	@Override
	public String toString() {
		return super.toString() + "\tEmpresa: " + empresa + "\t" + invitarCafe();
	}

}
