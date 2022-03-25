package Principal;

import java.util.Optional;

import crud.CrudJuego;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int seccion = 0;
		String nombre;
		int nivelMundoMax = 57, jefesMatadosMax = 9;
		Integer nivelMundo = null, jefesMatados = null;
		CrudJuego juegos = new CrudJuego();

		do {
			System.out.println("1. Añadir juego"
					+ "\n2. Mirar estado de un juego"
					+ "\nIntroduzca una sección");
			seccion = Leer.datoInt();
			switch (seccion) {
			case 1:
				System.out.println("Introduzca el nombre del juego");
				nombre = Leer.dato();
				switch (seccion) {
				case 1:
					break;

				case 2:
					System.out.println("Introduzca el nivel del juego en el que te encuentras");
					nivelMundo = Leer.datoInt();
					System.out.println("Introduzca tu cantidad de jefes derrotados");
					jefesMatados = Leer.datoInt();
					break;
				}
				juegos.anyadirJuego(nombre, Optional.ofNullable(nivelMundo), nivelMundoMax,
						Optional.ofNullable(jefesMatados), jefesMatadosMax);
				break;
				
			case 2:
				System.out.println("Introduzca el nombre del juego que quiere ver su estado");
				nombre = Leer.dato();
				juegos.comprobarEstadoJuego(nombre);
				break;
				
			case 9:
				
				break;
			}
		} while (seccion != 0);

	}

}
