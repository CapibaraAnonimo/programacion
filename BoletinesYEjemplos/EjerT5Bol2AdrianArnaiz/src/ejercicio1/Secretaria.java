package ejercicio1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Secretaria {
	private List<Alumno> alumnos;

	public Secretaria(List<Alumno> alumnos) {
		super();
		this.alumnos = alumnos;
	}

	public List<Alumno> filtrarMedia(int media) {
		return alumnos
				.stream()
				.filter(a -> a.getNotaMedia() >= media)
				.collect(Collectors.toList());
	}
	
	public void imprimirAlumnos() {
		alumnos
		.stream()
		.forEach(System.out::println);
	}
	
	public void imprimirAlumnosLetra(char letra) {
		alumnos
		.stream()
		.filter(a -> a.getNombre().charAt(0) == letra)
		.forEach(System.out::println);
	}
	
	public int contarAlumnos() {
		return (int)alumnos
				.stream()
				.count();
	}
	
	public List<Alumno> filtrarSobresalientes1DAM() {
		int sobresaliente = 9;
		return alumnos
				.stream()
				.filter(a -> a.getNotaMedia() >= sobresaliente)
				.filter(a -> a.getNombreCurso().equals("1DAM"))
				.collect(Collectors.toList());
	}
	
	public void imprimir3primerosAlumnos() {
		int limite = 3;
		alumnos
		.stream()
		.limit(limite)
		.forEach(System.out::println);
	}
	
	public Optional<Alumno> buscarMasPequeño() {
		return alumnos
				.stream()
				.min((a1, a2) -> Integer.compare(a1.getEdad(), a2.getEdad()));
	}

	public Optional<Alumno> primerAlumno() {
		return alumnos
				.stream()
				.findFirst();
	}
	
	public List<Alumno> listarAlumnos11Caracteres() {
		int longitud = 10;
		return alumnos
				.stream()
				.filter(a -> a.getNombre().length() > longitud)
				.collect(Collectors.toList());
	}
	
	public List<Alumno> listarAlumnosA6Long() {
		int longitud = 6;
		return alumnos
				.stream()
				.filter(a -> a.getNombre().charAt(0) == 'A' && a.getNombre().length() <= longitud)
				.collect(Collectors.toList());
	}
	
}




























