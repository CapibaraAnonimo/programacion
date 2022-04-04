package ejercicio3;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CrudCancion {
	private List<Cancion> canciones;

	public CrudCancion(List<Cancion> canciones) {
		super();
		this.canciones = canciones;
	}

	public Optional<Cancion> buscarNombre(String nombre) {
		return canciones
				.stream()
				.filter(c -> c.getNombre().equalsIgnoreCase(nombre))
				.findAny();
	}
	
	public List<Cancion> buscarAutor(String autor){
		return canciones
				.stream()
				.filter(c -> c.getAutor().equalsIgnoreCase(autor))
				.collect(Collectors.toList());
	}
	
	public List<Cancion> buscarMinimo(Duration duracion) {
		return canciones
				.stream()
				.filter(c -> c.getDuracion().compareTo(duracion) == 1 || c.getDuracion().compareTo(duracion) == 0)
				.collect(Collectors.toList());
	}

}
