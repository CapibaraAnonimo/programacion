package ejercicio6;

import utilidades.Leer;

public class Sala {
	private int id;
	private int localidades;
	private String pelicula;
	private Entrada lista[];
	private static double ingresosTotales;
	
	public Sala() {
		this.id = 1;
		this.localidades = 15;
		this.pelicula = "El Señor de los anillos versión extendida";
		this.lista = new Entrada[]{
				new Entrada(1, 5, 1, 1),
				new Entrada(2, 5, 1, 2),
				new Entrada(3, 5, 1, 3),
				new Entrada(4, 5, 1, 4),
				new Entrada(5, 5, 1, 5),
				new Entrada(6, 5, 2, 1),
				new Entrada(7, 5, 2, 2),
				new Entrada(8, 5, 2, 3),
				new Entrada(9, 5, 2, 4),
				new Entrada(10, 5, 2, 5),
				new Entrada(11, 5, 3, 1),
				new Entrada(12, 5, 3, 2),
				new Entrada(13, 5, 3, 3),
				new Entrada(14, 5, 3, 4),
				new Entrada(15, 5, 3, 5)};
		ingresosTotales = 0;
	}
	
	public String verCartelera() {
		return pelicula;
	}
	
	public void comprarEntrada() {
		int aux = 0;
		for(int i = 0; i < lista.length; i++)
		{
			if(lista[i].isLibre())
				System.out.println(lista[i] + "\n");
		}
		do {
			System.out.println("Elija asiento");
			aux = Leer.datoInt();
			if(lista[aux-1].isLibre())
				System.out.println("El asiento está libre");
			else
				System.out.println("El asiento no está libre");
		}while(!lista[aux-1].isLibre());
		lista[aux-1].setLibre(false);
		ingresosTotales = ingresosTotales+lista[aux-1].getPrecio();
	}
	
	public double dineroTotal() {
		return ingresosTotales;
	}
	
	public void cambiarPrecio(double precio) {
		int aux = 0;
		for(int i = 0; i < lista.length; i++)
		{
			System.out.println(lista[i]);
		}
		do {
			System.out.println("Elija asiento");
			aux = Leer.datoInt();
			if(aux < 1 || aux > lista.length)
				System.out.println("El asiento no existe");
			else
				lista[aux-1].setPrecio(precio);
			System.out.println("El precio ha sido cambiado con exito");
		}while(aux < 1 || aux > lista.length);
	}

}
