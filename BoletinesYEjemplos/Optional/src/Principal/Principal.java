package Principal;

import java.util.Optional;

import crud.CrudJuego;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int opcion = 0;
		String nombre;
		int nivelMundoMax = 57, jefesMatadosMax = 9;
		Integer nivelMundo = null, jefesMatados = null;
		CrudJuego juegos = new CrudJuego();

		do {
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Añadir juego");
				nombre = Leer.dato();
				switch (opcion) {
				case 1:
					break;
					
				case 2:
					nivelMundo = Leer.datoInt();
					jefesMatados = Leer.datoInt();
					break;
				}
				juegos.anyadirJuego(nombre, Optional.ofNullable(nivelMundo), nivelMundoMax, Optional.ofNullable(jefesMatados), jefesMatadosMax);
				break;
			}
		} while (opcion != 0);

	}

}
