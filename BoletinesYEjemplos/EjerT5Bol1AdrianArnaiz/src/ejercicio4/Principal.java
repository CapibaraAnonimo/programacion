package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		int seccion = 0, numero = 0;
		Contacto contacto = null;
		boolean hecho = true;
		String nombre;

		do {
			System.out.println("\n\n1. Agregar contacto\n" + "2. Borrar contacto\n" + "3. Mostrar contactos\n"
					+ "4. Buscar contacto\n" + "5. Modificar contacto\n" + "Seleccione la sección deseada");
			seccion = Leer.datoInt();

			switch (seccion) {
			case 0:
				break;
				
			case 1:
				System.out.println("Introduzca el nombre del contacto");
				contacto = new Contacto(Leer.dato());
				System.out.println("Introduzca el número del contacto");
				numero = Leer.datoInt();
				agenda.agregarContacto(contacto, numero);
				break;

			case 2:
				System.out.println("Introduzca el nombre del contacto a eliminar");
				nombre = Leer.dato();
				agenda.imprimirEliminado(agenda.eliminarContacto(nombre));
				break;
				
			case 3:
				System.out.println(agenda.mostrarAgenda());
				break;
				
			case 4:
				System.out.println("Introduzca el nombre del contacto que quiere buscar");
				nombre = Leer.dato();
				numero = agenda.buscarNumero(nombre);
				if(numero != 0)
					System.out.printf("El número de %s es %d\n", nombre, numero);
				else
					System.out.println("El contacto no existe");
				
			case 5:
				System.out.println("Introduzca el nombre del contacto al que quiera cambairle el número");
				nombre = Leer.dato();
				System.out.println("Introduzca el nuevo número");
				numero = Leer.datoInt();
				hecho = agenda.editarContacto(nombre, numero);
				if(hecho)
					System.out.printf("El número de %s ahora es %d\n", nombre, numero);
				else
					System.out.println("El contacto no existe");
				break;
			}
		} while (seccion != 0);

	}

}
