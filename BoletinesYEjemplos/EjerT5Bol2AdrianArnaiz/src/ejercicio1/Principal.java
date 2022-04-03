package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Alumno> lista = new ArrayList<Alumno>();
		Secretaria secretaria;

		lista.add(new Alumno("Nombre1", "Apellido1", "1DAM", 8.3, 18));
		lista.add(new Alumno("Nombre2", "Apellido2", "1DAM", 6.7, 19));
		lista.add(new Alumno("Nombre3", "Apellido3", "1DAM", 7.9, 23));
		lista.add(new Alumno("Nombre4", "Apellido4", "1DAM", 5.0, 20));
		lista.add(new Alumno("Nombre5", "Apellido5", "1DAM", 9.4, 25));
		lista.add(new Alumno("Nombre6qqqqqqqqqqq", "Apellido6", "1DAM", 6.3, 30));
		lista.add(new Alumno("Nombre7", "Apellido7", "1DAM", 8.9, 29));
		lista.add(new Alumno("Nombre8", "Apellido8", "1DAM", 5.7, 22));
		lista.add(new Alumno("Nombre9", "Apellido9", "1DAM", 6.8, 17));

		secretaria = new Secretaria(lista);

		System.out.println(secretaria.filtrarMedia(7.5));
		secretaria.imprimirAlumnos();
		secretaria.imprimirAlumnosLetra('N');
		System.out.println(secretaria.contarAlumnos());
		System.out.println(secretaria.filtrarSobresalientes1DAM());
		secretaria.imprimir3primerosAlumnos();
		System.out.println(secretaria.buscarMasPequeño());
		System.out.println(secretaria.primerAlumno());
		System.out.println(secretaria.listarAlumnos11Caracteres());
		System.out.println(secretaria.listarAlumnosA6Long());

	}

}