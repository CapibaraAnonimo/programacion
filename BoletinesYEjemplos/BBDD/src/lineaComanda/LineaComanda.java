package lineaComanda;

import java.util.Random;

public class LineaComanda {

	public static void main(String[] args) {
		Random ran = new Random(System.nanoTime());
		int totalLineas = 38619;
		
		int minComanda = 1, maxComanda = 38619;
		int comanda = 0;
		
		int minProducto = 1, maxProducto = 64;
		int producto1 = 0, producto2 = 0, producto3 = 0;
		
		int minCantidad = 1, maxCantidad = 4;
		int cantidad1 = 0, cantidad2 = 0, cantidad3 = 0;
		
		
		for(int i = 0; i < totalLineas; i++) {
			comanda = ran.nextInt(maxComanda - minComanda + 1) + minComanda;
			producto1 = 0;
			producto2 = 0;
			producto3 = 0;
			cantidad1 = 0;
			cantidad2 = 0;
			cantidad3 = 0;
			
			producto1 = ran.nextInt(maxProducto - minProducto + 1) + minProducto;
			cantidad1 = ran.nextInt(maxCantidad - minCantidad + 1) + minCantidad;
			do{
				producto2 = ran.nextInt(maxProducto - minProducto + 1) + minProducto;
				cantidad2 = ran.nextInt(maxCantidad - minCantidad + 1) + minCantidad;				
			}while(0 == producto2 || producto1 == producto2);
			do{
			producto3 = ran.nextInt(maxProducto - minProducto + 1) + minProducto;
			cantidad3 = ran.nextInt(maxCantidad - minCantidad + 1) + minCantidad;
			}while(0 == producto3 || producto1 == producto3 || producto2 == producto3);
			
			System.out.printf("insert into lineaDeComanda (comanda, producto, cantidad) values (%d, %d, %d);\n", i+1, producto1, cantidad1);
			System.out.printf("insert into lineaDeComanda (comanda, producto, cantidad) values (%d, %d, %d);\n", i+1, producto2, cantidad2);
			System.out.printf("insert into lineaDeComanda (comanda, producto, cantidad) values (%d, %d, %d);\n", i+1, producto3, cantidad3);
		}

	}

}
