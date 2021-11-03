package ejercicio05;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int salaDeseada = 0;
		double precio1 = 20.0, precio2 = 7.5, precio3 = 5.0, precio4 = 6;
		int entradas = 0;
		double precioFin = 0.0;
		boolean datoValido = true;
		
		System.out.println("Bienvenido al menu del cine El Pollo Tuerto\n");
		
		System.out.printf("Sala 1: VIP, precio por entrada %.2f\n", precio1);
		System.out.printf("Sala 2: 3d, precio por entrada %.2f\n", precio2);
		System.out.printf("Sala 3: normal, precio por entrada %.2f\n", precio3);
		System.out.printf("Sala 4: niños, precio por entrada %.2f\n", precio4);
		
		System.out.println("Introduzca el número de la sala deseada");
		
		do
		{
			salaDeseada = Leer.datoInt();
			switch (salaDeseada) 
			{
			case 1:
				System.out.printf("El precio de las sala 1 es %.2f\n", precio1);
				System.out.println("¿Cuantas entradas quieres?");
				entradas = Leer.datoInt();
				precioFin = entradas*precio1;
				System.out.printf("El precio final de las %d entradas es de %.2f EUR", entradas, precioFin);
				break;
				
			case 2:
				System.out.printf("El precio de las sala 2 es %.2f\n", precio2);
				System.out.println("¿Cuantas entradas quieres?");
				entradas = Leer.datoInt();
				precioFin = entradas*precio2;
				System.out.printf("El precio final de las %d entradas es de %.2f EUR", entradas, precioFin);
				break;
				
			case 3:
				System.out.printf("El precio de las sala 3 es %.2f\n", precio3);
				System.out.println("¿Cuantas entradas quieres?");
				entradas = Leer.datoInt();
				precioFin = entradas*precio3;
				System.out.printf("El precio final de las %d entradas es de %.2f EUR", entradas, precioFin);
				break;
				
			case 4:
				System.out.printf("El precio de las sala 4 es %.2f\n", precio4);
				System.out.println("¿Cuantas entradas quieres?");
				entradas = Leer.datoInt();
				precioFin = entradas*precio4;
				System.out.printf("El precio final de las %d entradas es de %.2f EUR", entradas, precioFin);
				break;

			default:
				System.out.println("El número de sala introducida no es correcta");
				datoValido = false;
				System.out.println("Introduzca otra sala");
				break;
			}
		}
		while(datoValido == false);
		
	}

}
