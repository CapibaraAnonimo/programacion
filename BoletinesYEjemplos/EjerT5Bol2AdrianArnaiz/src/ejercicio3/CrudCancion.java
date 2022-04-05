package ejercicio3;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	
	public List<Cancion> buscarMaximo(Duration duracion) {
		return canciones
				.stream()
				.filter(c -> c.getDuracion().compareTo(duracion) == 0 || c.getDuracion().compareTo(duracion) == 0)
				.collect(Collectors.toList());
	}
	
	public List<Cancion> buscarMaximoMinimo(Duration maximo, Duration minimo) {
		return Stream
				.concat(buscarMaximo(maximo).stream(), buscarMinimo(minimo).stream())
				.collect(Collectors.toList());
	}

}
