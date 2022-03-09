package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		int seccion = 0;

		do {
			System.out.println("\n\n1. Agregar contacto\n"
					+ "2. Borrar contacto\n"
					+ "3. Mostrar contactos\n"
					+ "4. Buscar contacto\n"
					+ "5. Modificar contacto\n"
					+ "Seleccione la sección deseada");
			seccion = Leer.datoInt();

			switch(seccion) {
			
			}
		} while (seccion != 0);

	}

}
