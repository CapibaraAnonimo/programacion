package ejercicio3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int seccion = 0, minutos, segundos, minutos2, segundos2;
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
			System.out.println("\n\n1. Buscar canción por nombre" + "\n2. Buscar Canciones de un autor"
					+ "\n3. Buscar por duración máxima" + "\n4. Buscar por duración mínima"
					+ "\n5. Buscar por duración máxima y mínima");
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

			case 3:
				System.out.println("Introduce la cantidad de minutos máximas que pueda tener una canción");
				minutos = 0;
				minutos = Leer.datoInt();
				System.out.println(
						"Introduce la cantidad de segundos máximos que pueda tener una canción (se sumaran con lo minutos anteriores)");
				segundos = 0;
				segundos = Leer.datoInt();
				System.out.println(
						crud.buscarMaximo(Duration.between(LocalTime.of(0, 0), LocalTime.of(0, minutos, segundos))));
				break;

			case 4:
				System.out.println("Introduce la cantidad de minutos mínima que pueda tener una canción");
				minutos = 0;
				minutos = Leer.datoInt();
				System.out.println(
						"Introduce la cantidad de segundos mínima que pueda tener una canción (se sumaran con lo minutos anteriores)");
				segundos = 0;
				segundos = Leer.datoInt();
				System.out.println(
						crud.buscarMinimo(Duration.between(LocalTime.of(0, 0), LocalTime.of(0, minutos, segundos))));
				break;

			case 5:
				System.out.println("Introduce la cantidad de minutos máximas que pueda tener una canción");
				minutos = 0;
				minutos = Leer.datoInt();
				System.out.println(
						"Introduce la cantidad de segundos máximos que pueda tener una canción (se sumaran con lo minutos anteriores)");
				segundos = 0;
				segundos = Leer.datoInt();

				System.out.println("Introduce la cantidad de minutos mínima que pueda tener una canción");
				minutos2 = 0;
				minutos2 = Leer.datoInt();
				System.out.println(
						"Introduce la cantidad de segundos mínima que pueda tener una canción (se sumaran con lo minutos anteriores)");
				segundos2 = 0;
				segundos2 = Leer.datoInt();
				crud.buscarMaximoMinimo(Duration.between(LocalTime.of(0, 0), LocalTime.of(0, minutos, segundos)),
						Duration.between(LocalTime.of(0, 0), LocalTime.of(0, minutos2, segundos2)));
				break;

			case 0:
				break;

			default:
				break;
			}
		} while (seccion != 0);

	}

}
