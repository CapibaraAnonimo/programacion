package model;

import java.util.Optional;

public class Plataformas extends Juego {
	private Optional<Integer> nivelMundo;
	private Integer nivelMundoMax;
	private Optional<Integer> jefesMatados;
	private Integer jefesMatadosMax;

	public Plataformas(String nombre, Optional<Integer> nivelMundo, Integer nivelMundoMax,
			Optional<Integer> jefesMatados, Integer jefesMatadosMax) {
		this.nivelMundo = nivelMundo;
		this.nivelMundoMax = nivelMundoMax;
		this.jefesMatados = jefesMatados;
		this.jefesMatadosMax = jefesMatadosMax;
	}

	public String calcularAvance() {
		double nivelMundoA = (double) nivelMundo.get() / nivelMundoMax * 100;
		double jefes = (double) jefesMatados.get() / jefesMatadosMax * 100;
		return "Avance nivel de mundo: " + nivelMundo.get() + "/" + nivelMundoMax + " = " + Math.floor(nivelMundoA)
				+ "%\nAvance jefes matados: " + jefesMatados.get() + "/" + jefesMatadosMax + " = " + Math.floor(jefes)
				+ "%";
	}

	@Override
	public String toString() {
		return "Nivel de mundo: " + nivelMundo.get() + " de " + nivelMundoMax + " niveles.\nJefes Matados: "
				+ jefesMatados.get() + " de " + jefesMatadosMax;
	}

}
