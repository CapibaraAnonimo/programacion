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
					+ "\n3. Imprimir todos tus juegos"
					+ "\n0. Salir"
					+ "\nIntroduzca una sección");
			seccion = Leer.datoInt();
			switch (seccion) {
			case 1:
				System.out.println("Introduzca el nombre del juego");
				nombre = Leer.dato();
				System.out.println("¿Has empezado el juego? 1 = Sí\t0 = No");
				seccion = Leer.datoInt();
				switch (seccion) {
				case 0:
					juegos.anyadirJuego(nombre, Optional.ofNullable(null), nivelMundoMax, Optional.ofNullable(null), jefesMatadosMax);
					break;

				case 1:
					System.out.println("Introduzca el nivel del juego en el que te encuentras");
					nivelMundo = Leer.datoInt();
					System.out.println("Introduzca tu cantidad de jefes derrotados");
					jefesMatados = Leer.datoInt();
					juegos.anyadirJuego(nombre, Optional.ofNullable(nivelMundo), nivelMundoMax, Optional.ofNullable(jefesMatados), jefesMatadosMax);
					break;
					
				default:
					break;
				}
				seccion = 1;
				break;
				
			case 2:
				System.out.println("Introduzca el nombre del juego que quiere ver su estado");
				nombre = Leer.dato();
				System.out.println(juegos.comprobarEstadoJuego(nombre));
				break;
				
			case 3:
				juegos.imprimirJuegos();
				break;
				
			case 9:
				
				break;
			}
		} while (seccion != 0);

	}

}
