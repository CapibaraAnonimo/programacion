package ejercicio;

import utilidades.Leer;

public class Pricicpal {

	public static void main(String[] args) {
		int seccion = 0, id = 0;
		double precioBase = 5;
		Visitante lista[] = new Visitante[] {new Visitante("Nombre1", 1, precioBase, 15),
				new Empresario("Nombre2", 2, precioBase, 26, "Aperture Science", 100),
				new Familiar("Nombre3", 3, precioBase, 38, 3),
				new Familiar("Nombre4", 4, precioBase, 90, 1),
				new Empresario("Nombre5", 5, precioBase, 48, "IBM", 78),
				new Visitante("Nombre6", 6, precioBase, 23)};
		Feria feria = new Feria(2022, lista);
		
		System.out.println("Bienvenido al portal de la feria");
		
		do {
			System.out.println("\n\n1. Mostrar lista de visitantes\n"
					+ "2. Calcular precio de la entrada de un visitante\n"
					+ "3. Total recaudado entre todos los visitantes\n"
					+ "4. Total recaudado por familiares\n"
					+ "0. Salir");
			
			System.out.println("Seleccione una sección");
			
			do {
				seccion = Leer.datoInt();
				if(seccion < 0 || seccion > 4)
					System.out.println("Sección incorrecta, Seleccione otra");
			}while(seccion < 0 || seccion > 4);
			
			switch(seccion){
			case 1:
				System.out.println("\n\n" + feria.mostrarListado());
				break;
				
			case 2:
				do {
					System.out.println("\n\nIndique el id del visitante que desea calcular el precio de la entrada\n");
					System.out.println(feria.mostrarListado());
					id = Leer.datoInt();
					if(!feria.comprobarId(id))
						System.out.println("El id seleccionado no existe");
				}while(!feria.comprobarId(id));
				System.out.println("\nPrecio de la entrada = " + feria.calcularPrecioEntradaUnVisitante(id));
				break;
				
			case 3:
				System.out.println("\nTotal recaudado por todos los visitantes = " + feria.calcularTotalReacudado());
				break;
				
			case 4:
				System.out.println("\nTotal recaudado por todos los familiares = " + feria.calcularTotalRecaudadoFamiliares());
				break;
				
			case 0:
				System.out.println("\n\nGracias por visitar la feria");
				break;
			}
		}while(seccion != 0);
		
	}

}
