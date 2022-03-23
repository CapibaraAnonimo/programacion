package ejecicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int seccion = 0;
		double ganancias = 0;
		String matriculaAux, marcaAux, colorAux;
		Boolean encontrado = false;
		List<Coche> listaCoches = new ArrayList<Coche>();
		Barco barco;

		listaCoches.add(new Coche("1111AAZ", "Opel", "Corsa", 300, "Blanco"));
		listaCoches.add(new Coche("1111AAB", "Opel", "Corsa", 400, "Azul"));
		listaCoches.add(new Coche("1111AAC", "Opel", "Corsa", 600, "Azul"));
		listaCoches.add(new Coche("1111AAD", "NoOpel", "Corsa", 400, "Azul"));
		
		barco = new Barco(1, "Nombre", 100, listaCoches);
		
		do {
			System.out.println("\n\n1. Buscar coche más caro"
					+ "\n2. Buscar coche por matricula"
					+ "\n3. Buscar todos los coches de una marca"
					+ "\n4. Modificar color de un coche"
					+ "\n5. Ordenar lista de coches por color"
					+ "\n6. Ordenar lista de cohes por matricula"
					+ "\n7. Calacular ganancias de una marca"
					+ "\n8. Imprimir lista de coches(Con un iterador:) )");
			System.out.println("Indique la sección deseada");
			seccion = Leer.datoInt();
			
			switch(seccion) {
			case 1:
				for(Coche c : barco.buscarMaxprecio()) {
					System.out.println(c);
				}
				break;
				
			case 2:
				System.out.println("\nIntroduzca la matricula a buscar");
				matriculaAux = Leer.dato();
				System.out.println(barco.buscarMatricula(matriculaAux));
				break;
				
			case 3:
				System.out.println("\nIntroduzca la marca a buscar");
				marcaAux = Leer.dato();
				for(Coche c : barco.buscarMarca(marcaAux)) {
					System.out.println(c);
				}
				break;
				
			case 4:
				System.out.println("\nIntroduzca la matricula del coche que quiere cambiarle el color");
				matriculaAux = Leer.dato();
				System.out.println("Introduzca el nuevo color");
				colorAux = Leer.dato();
				encontrado = barco.modificarColor(matriculaAux, colorAux);
				if(encontrado)
					System.out.println("Se ha cambiado el color");
				else
					System.out.println("El coche no se ha encontrado");
				break;
				
			case 5:
				Collections.sort(barco.getListaCosches(), new CompararColor());
				for(Coche c : barco.getListaCosches()) {
					System.out.println(c);
				}
				break;
				
			case 6:
				Collections.sort(barco.getListaCosches());
				for(Coche c : barco.getListaCosches()) {
					System.out.println(c);
				}
				break;
				
			case 7:
				System.out.println("Introduzca la marca de la que quiere calcular las ganancias");
				marcaAux = Leer.dato();
				ganancias = barco.gananciasMarca(marcaAux);
				System.out.printf("La marca %s generaría %.2f€", marcaAux, ganancias);
				break;
				
			case 8:
				barco.ImprimirLista();
				break;
				
			case 0:
				break;
				
			default :
				break;
			}
		}while(seccion != 0);
	}

}
