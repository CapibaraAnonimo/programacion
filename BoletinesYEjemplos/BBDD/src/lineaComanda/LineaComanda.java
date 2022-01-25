package lineaComanda;

import java.util.Random;

public class LineaComanda {

	public static void main(String[] args) {
		Random ran = new Random(System.nanoTime());
		int totalLineas = 115857;
		
		int minComanda = 1, maxComanda = 38619;
		int comanda = 0;
		
		int minProducto = 1, maxProducto = 64;
		int producto = 0;
		
		int minCantidad = 1, maxCantidad = 4;
		int cantidad;
		
		
		for(int i = 0; i < totalLineas; i++) {
			comanda = ran.nextInt(maxComanda - minComanda + 1) + minComanda;
			producto = ran.nextInt(maxProducto - minProducto + 1) + minProducto;
			cantidad = ran.nextInt(maxCantidad - minCantidad + 1) + minCantidad;
			
			System.out.printf("insert into lineaDeComanda (comanda, producto, cantidad) values (%d, %d, %d);\n", comanda, producto, cantidad);
		}

	}

}
