package model;

import java.util.Optional;
import java.util.Set;

public class Juego {
//	Juegos:
//	New Super Mario Bros
//	Fifa
//	Sekiro
//	Call of Duty
//	Kingdom Come Deliveance
//	Hollow Knight
//	Pokemon Platino
	private int id;
	private String nombre;
	private Set<String> plataformas;
	private Optional<Integer> nivelMundo;
	private Integer nivelMundoMax;
	private Optional<Integer> nivelPersonaje;
	private Integer nivelPersoajeMax;
	private Optional<Integer> nivelCuenta;
	private Integer nivelCuentaMax;
	private Optional<Integer> jefesMatados;
	private Integer jefesMatadosMax;
	private Optional<Integer> ranking;
	private Optional<Integer> misionesCompletadas;
	private Integer minisonesCompletadasMax;
	private Optional<Integer> coleccionables;
	private Integer colleccionablesMax;

}
