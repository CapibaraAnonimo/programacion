package model;

public abstract class Juego {
	protected String nombre;

	public Juego() {

	}

	public Juego(String nombre) {
		super();
		this.nombre = nombre;
	}

	public abstract String calcularAvance();

}
