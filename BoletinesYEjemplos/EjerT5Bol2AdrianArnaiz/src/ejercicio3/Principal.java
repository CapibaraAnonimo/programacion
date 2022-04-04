package ejercicio3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int seccion = 0;
		String aux;
		Optional<Cancion> optCancion;
		
		List<Cancion> canciones = new ArrayList<Cancion>();
		CrudCancion crud;

		canciones.add(new Cancion("Down of Victory", "Rhapsody", "Powemetal",
				Duration.between(LocalTime.of(0, 0), LocalTime.of(0, 4, 47))));
		canciones.add(new Cancion("Down of Victory", "Rhapsody", "Powemetal",
				Duration.between(LocalTime.of(0, 0), LocalTime.of(0, 4, 47))));
		canciones.add(new Cancion("Down of Victory", "Rhapsody", "Powemetal",
				Duration.between(LocalTime.of(0, 0), LocalTime.of(0, 4, 47))));
		canciones.add(new Cancion("Down of Victory", "Rhapsody", "Powemetal",
				Duration.between(LocalTime.of(0, 0), LocalTime.of(0, 4, 47))));

		crud = new CrudCancion(canciones);

		do {
			System.out.println("\n\n1. Buscar canción por nombre"
					+ "\n2. Buscar Canciones de un autor");
			seccion = Leer.datoInt();

			switch (seccion) {
			case 1:
				System.out.println("Introduce el nombre de la canción que quieres buscar");
				aux = Leer.dato();
				optCancion = crud.buscarNombre(aux);
				if (optCancion.isPresent()) {
					System.out.println(optCancion.get());
				} else
					System.out.println("No hay ninguna canción con el nombre introducido");
				break;
				
			case 2:
				aux = Leer.dato();
				System.out.println(crud.buscarAutor(aux));
				break;

			case 0:
				break;
				
			default:
				break;
			}
		} while (seccion != 0);

	}

}
