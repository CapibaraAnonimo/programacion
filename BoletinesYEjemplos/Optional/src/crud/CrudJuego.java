package crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import model.Juego;
import model.Plataformas;

public class CrudJuego {
	private Map<String, Optional<Juego>> juegos;

	public CrudJuego() {
		juegos = new HashMap<String, Optional<Juego>>();
	}

	public void anyadirJuego(String nombre, Optional<Integer> nivelMundo, Integer nivelMundoMax,
			Optional<Integer> jefesMatados, Integer jefesMatadosMax) {
		if (nivelMundo.isPresent())
			juegos.put(nombre,
					Optional.of(new Plataformas(nombre, nivelMundo, nivelMundoMax, jefesMatados, jefesMatadosMax)));
		else
			juegos.put(nombre, Optional.ofNullable(null));
	}

	public String comprobarEstadoJuego(String nombre) {
		Optional<Juego> juego;
		juego = buscarJuegoNombre(nombre);
		if (juego.isPresent()) {
			return "Has empezado el juego";
		} else
			return "No has empezado el juego";
	}

	public Optional<Juego> buscarJuegoNombre(String nombre) {
		Iterator<Optional<Juego>> it;
		Optional<Juego> juego = null;
		boolean encontrado = false;
		while (it.hasNext() && !encontrado) {
			juego = it.next();
		}
		return juego;
	}

	public void imprimirJuegos() {
		Iterator<String> it = juegos.keySet().iterator();
		String nombre;
		Optional<Juego> juego;

		while (it.hasNext()) {
			nombre = it.next();
			juego = juegos.get(nombre); // Guardo en juego el Optioanl juego que tenga la clave del nombre o null
			System.out.printf(nombre + ":\n");
			if (juego.isPresent()) {
				System.out.println(juego.get());
			} else
				System.out.println("No has empezado el juego");
			System.out.println("-----------------------------------------------------\n\n");

		}
	}

}
