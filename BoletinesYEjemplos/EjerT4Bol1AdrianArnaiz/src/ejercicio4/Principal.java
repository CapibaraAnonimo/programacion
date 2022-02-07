package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		LineaTicket lineas[] = {new LineaTicket(new Alimentacion(4.23, "Filete Cerdo", 23, 20, 1), 4), new LineaTicket(new Producto(2.5, "Papel higienico", 21), 2)};
		Venta venta = new Venta(lineas);
		
		System.out.println(venta);

	}

}
