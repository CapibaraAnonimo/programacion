package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		List<Socio> lista = new ArrayList();
		Socio s1 = new Socio(1, "00000000a", "Nombre1", "Apellido1");
		Socio s2 = new Socio(2, "00000001a", "Nombre2", "Apellido2");
		Socio comprobacion;
		int seccion = 0, id = 0, seguro = 0;
		String dni = new String(""), nombre = new String(""), apellidos = new String("");
		boolean exito = false;

		GestionClub club = new GestionClub(lista);

		club.anyadirSocio(s1);
		club.anyadirSocio(s2);

		do {
			System.out.println("\n\n1. Ingresar nuevo socio\n" + "2. Buscar socio\n" + "3. Mostrar datos de un socio\n"
					+ "4. Modificar un socio\n" + "5. Eliminar socio\n\n");
			do {
				System.out.println("Indique una sección");
				seccion = Leer.datoInt();
				if(seccion < 0 || seccion > 5)
					System.out.println("La sección es incorrecta");
			}while(seccion < 0 || seccion > 5);

			switch (seccion) {
			case 1:
				System.out.println("Indique un id");
				id = Leer.datoInt();
				if (!club.comprobarCoincidenciaId(id)) {
					System.out.println("Indique su DNI");
					dni = Leer.dato();
					System.out.println("Indique su nombre");
					nombre = Leer.dato();
					System.out.println("Indique sus apellidos");
					apellidos = Leer.dato();

					club.anyadirSocio(new Socio(id, dni, nombre, apellidos));

					System.out.println("\nSe a creado el socio");
				}
				else
					System.out.println("Ese id ya está en uso");

				break;

			case 2:
				System.out.println("Indique el id del socio del que quiere consultar los datos");
				id = Leer.datoInt();
				comprobacion = club.buscarSocio(id);
				if (comprobacion != null) {
					System.out.println(comprobacion);
				} else
					System.out.println("No existe un socio con ese id");
				break;

			case 3:
				System.out.println(club.mostarSocios());
				break;

			case 4:
				System.out.println("Indique el id del socio del que quiere editar los datos");
				id = Leer.datoInt();
				System.out.println("Indique el nuevo nombre para el socio");
				nombre = Leer.dato();

				exito = club.modificarNombre(id, nombre);
				if (exito)
					System.out.println("Se ha modificado con exito el nombre");
				else
					System.out.println("El id no existe");
				break;

			case 5:
				System.out.println("Indique el id del socio que quiere eliminar");
				id = Leer.datoInt();
				if(club.comprobarCoincidenciaId(id)) {
					System.out.println("¿Está seguro de querer eliminar el socio?\n Sí = 1\t\tNo = 0");
					seguro = Leer.datoInt();
					if(seguro == 1)
						club.eliminarSocio(id);
					else
						System.out.println("Se ha abortado la operación");
				}
				else
					System.out.println("No existe el socio que desea eliminar");
			}
		} while (seccion != 0);

	}

}
