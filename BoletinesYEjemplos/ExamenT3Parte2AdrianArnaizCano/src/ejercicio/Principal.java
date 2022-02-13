package ejercicio;

import utilidades.Leer;

/**
 * 
 * @version 
 *
 */
public class Principal {
	public static void main(String[] args) {
		Plataforma plataforma = new Plataforma();
		int seccion = 0, deposito, porcentaje, litros = 0;
		double altura = 0, radio = 0, coste = 0, precio = 0.75;
		
		do {
			System.out.println("\n\n1. Añadir deposito"
					+ "\n2. Calcular precio de venta"
					+ "\n3. Numero de litros en la plataforma"
					+ "\n4. Ganancias Repsol por un deposito"
					+ "\n5. Ganancias Repsol por la plataforma"
					+ "\n6. Ganancias Repsol por la plataforma llena");
			
			do {
				System.out.println("\nDiga la seccion deseada");
				seccion = Leer.datoInt();
				if(seccion < 0 || seccion > 6)
					System.out.println("Seccion Incorrecta");
			}while(seccion < 0 || seccion > 6);
			
			switch(seccion) {
			case 1:
				System.out.println("\nIntroduzca la altura del deposito");
				altura = Leer.datoDouble();
				System.out.println("\nIntroduzca el radio del deposito");
				radio = Leer.datoDouble();
				System.out.println("\nIntroduzca el coste del deposito");
				coste = Leer.datoDouble();
				System.out.println("\nIntroduzca el numero de litros que tendrá el deposito");
				litros = Leer.datoInt();
				plataforma.anyadirDeposito(altura, radio, litros, coste);
				System.out.println("\nSe ha creado el deposito");
				break;
				
			case 2:
				plataforma.imprimirDepositos();
				System.out.println("\nIntroduzca un deposito");
				deposito = Leer.datoInt();
				System.out.println("\nIntroduzca un porcentaje");
				porcentaje = Leer.datoInt();
				System.out.printf("\nEl precio de venta es de %.2fEUR", plataforma.calcularPrecioVenta(deposito, porcentaje));
				break;
				
			case 3:
				System.out.printf("\nHay %.2fL de %.2fL totales", plataforma.litrosPlataforma(), plataforma.getCapacidadTotal());
				break;
				
			case 4:
				plataforma.imprimirDepositos();
				System.out.println("\nIntroduzca un deposito");
				deposito = Leer.datoInt();
				System.out.printf("\nLas ganancias del deposito %d es de %.2fEUR", deposito, plataforma.gananciasDeposito(deposito, precio));
				break;
				
			case 5:
				System.out.printf("\nLas ganancias de la plataforma es de %.2fEUR", plataforma.gananciasPlataforma(precio));
				break;
				
			case 6:
				System.out.printf("\nLas ganancias de la platforma llena es de %.2fEUR", plataforma.gananciaPlataformaLlena(precio));
				break;
				
			case 0:
				break;
			}
		}while(seccion != 0);

	}

}
