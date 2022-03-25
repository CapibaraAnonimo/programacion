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
		if (nombre == null)
			juegos.put(nombre, Optional.ofNullable(null));
		juegos.put(nombre,
				Optional.ofNullable(new Plataformas(nombre, nivelMundo, nivelMundoMax, jefesMatados, jefesMatadosMax)));
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
		
		while(it.hasNext()) {
			nombre = it.next();
			juego = Optional.ofNullable(juegos.get(nombre).orElse(null));
			System.out.println(juego.orElseGet(() -> 5));
		}
	}

}
