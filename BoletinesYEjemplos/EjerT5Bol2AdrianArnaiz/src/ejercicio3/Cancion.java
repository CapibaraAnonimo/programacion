package ejercicio3;

import java.time.Duration;

public class Cancion {
	private String nombre;
	private String autor;
	private String genero;
	private Duration duracion;

	public Cancion(String nombre, String autor, String genero, Duration duracion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

	public String getGenero() {
		return genero;
	}

	public Duration getDuracion() {
		return duracion;
	}

	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", autor=" + autor + ", genero=" + genero + ", duracion=" + duracion + "]\n";
	}

}
