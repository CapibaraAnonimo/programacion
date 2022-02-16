package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int seccion = 2;
		LineaTicket lineas[] = { new LineaTicket(new Alimentacion(4.23, "Filete Cerdo", 23, 20, 4), 4),
				new LineaTicket(new Producto(2.5, "Papel higienico", 21), 2) };
		Venta venta = new Venta(lineas);

		do {
			System.out.println("\n\n1. Imprimir lista de productos\n"
					+ "2. Imprimir ticket\n"
					+ "0. Salir");
			seccion = Leer.datoInt();
			
			switch (seccion) {
			case 1:
				System.out.println(venta.listarProductos());
				break;
			case 2:
				System.out.println(venta);
				break;
			}
		}while(seccion != 0);

	}

}
