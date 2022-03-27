package principal;

import java.util.Optional;

import crud.CrudJuego;
import utilidades.Leer;

public class Principal {
	// Crea un programa capaz de almacenar los avances de tus partidas de los juegos
	// clasicos de Super Mario

	// Los ejemplos de los metodos están en el crud explicados

	// Como ejercicio para el que quiera practicar con el optional dejo propuesto la
	// creación de actualizar el nivel y la cantidad de bosses derrotados en un
	// juego o partida concreta
	public static void main(String[] args) {
		int seccion = 0;
		String nombre;
		int nivelMundoMax = 57, jefesMatadosMax = 9;
		Integer nivelMundo = null, jefesMatados = null;
		CrudJuego juegos = new CrudJuego();

		System.out.println("Vienvenido al gestor de Partidas de la saga de juegos clasicos de Super Mario Bros");

		do {
			System.out
					.println("\n\n1. Añadir juego" + "\n2. Mirar estado de un juego" + "\n3. Imprimir todos tus juegos"
							+ "\n4. Calcular avance del juego" + "\n0. Salir" + "\nIntroduzca una sección");
			seccion = Leer.datoInt();
			switch (seccion) {
			case 1:
				System.out.println("Introduzca el nombre del juego");
				nombre = Leer.dato();
				System.out.println("¿Has empezado el juego? 1 = Sí\t0 = No");
				seccion = Leer.datoInt();
				switch (seccion) {
				case 0:
					juegos.anyadirJuego(nombre, Optional.ofNullable(null), nivelMundoMax, Optional.ofNullable(null),
							jefesMatadosMax);
					break;

				case 1:
					System.out.println("Introduzca el nivel del juego en el que te encuentras");
					nivelMundo = Leer.datoInt();
					System.out.println("Introduzca tu cantidad de jefes derrotados");
					jefesMatados = Leer.datoInt();
					juegos.anyadirJuego(nombre, Optional.ofNullable(nivelMundo), nivelMundoMax,
							Optional.ofNullable(jefesMatados), jefesMatadosMax);
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

			case 4:
				System.out.println("Introduzca el nombre del juego que quiere calcular su avance");
				nombre = Leer.dato();
				System.out.println(juegos.calcularAvance(nombre));
			case 0:
				break;

			default:
				break;
			}
		} while (seccion != 0);
		System.out.println("Hasta la próxima partida");
	}

}
