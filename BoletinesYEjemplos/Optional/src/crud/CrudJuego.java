package crud;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import model.Juego;
import model.Plataformas;

public class CrudJuego {
	private Map<String, Optional<Juego>> juegos; // Aquí almacenamos el la partida en si, está en un optional ya que la
													// partida podrá estar empezada o no, en caso de que no el optional
													// contendrá un null

	public CrudJuego() {
		juegos = new HashMap<String, Optional<Juego>>();
	}

	public void anyadirJuego(String nombre, Optional<Integer> nivelMundo, Integer nivelMundoMax,
			Optional<Integer> jefesMatados, Integer jefesMatadosMax) {
		if (nivelMundo.isPresent()) // Aquí compruebo que el Optional que contiene tu nivel de mundo no contenga un
									// nulo y lo añado, en caso contrario introduzco un nulo en el optional ya que
									// no se habrá empezado la partida
			juegos.put(nombre,
					Optional.of(new Plataformas(nombre, nivelMundo, nivelMundoMax, jefesMatados, jefesMatadosMax)));
		// Aquí se puede ver el uso del metodo of(), en este caso no podrá contener
		// nulos, pero está previsto para que no lso contenga a la hora de crearlo
		else
			juegos.put(nombre, Optional.ofNullable(null)); // Aquí se usa el ofNullable() ya que no se empezó el juego
	}

	public String comprobarEstadoJuego(String nombre) {
		Optional<Juego> juego = buscarJuegoNombre(nombre);
		if (juego != null) {
			if (juego.isPresent()) {
				return "Has empezado el juego";
			} else
				return "No has empezado el juego";
		} else
			return "No existe el juego";
	}

	public String calcularAvance(String nombre) {
		Optional<Juego> juego = buscarJuegoNombre(nombre);
		if (juego != null) {
			if (juego.isPresent())
				return "\n" + juego.get().calcularAvance(); // En este metodo podemos observar el uso del get(), nos
															// devuelveel contenido del juego, si nos interesara
															// devolver un juego genérico podriamos usar un orElse()
															// para devolverlo en caso de que estuviera vacío el
															// optional, pero no es el caso
			else
				return "No has empezado el juego";
		} else
			return "El juego no existe";
	}

	public Optional<Juego> buscarJuegoNombre(String nombre) {
		Optional<Juego> juego = null;
		for (String n : juegos.keySet()) {
			if (n.equals(nombre))
				juego = juegos.get(nombre);
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

	
	//Metodo para practicar probar los Optionals quien lo vea conveniente
	public void actualizarJuego() {

	}
}
