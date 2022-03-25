package model;

import java.util.Optional;
import java.util.Set;

public class Plataformas extends Juego {
	private Optional<Integer> nivelMundo;
	private Integer nivelMundoMax;
	private Optional<Integer> jefesMatados;
	private Integer jefesMatadosMax;

	public Plataformas(String nombre, Optional<Integer> nivelMundo,
			Integer nivelMundoMax, Optional<Integer> jefesMatados, Integer jefesMatadosMax) {
		this.nivelMundo = nivelMundo;
		this.nivelMundoMax = nivelMundoMax;
		this.jefesMatados = jefesMatados;
		this.jefesMatadosMax = jefesMatadosMax;
	}

}
