package ejercicio04;

import java.util.Random;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		Random num = new Random(System.nanoTime());
		int ranMax = 99, ranMin = 1, arrayMax = 10, seccion = 0;
		int [] lista = new int [arrayMax];
		boolean repetir = true, consultar = true;
		
		
		System.out.println("Este programa te muestra un número aleatorio almacenado en una lista de 10 posiciones");
		do
		{
			System.out.println("\n\nIntroduce el número mínimo posible");
			ranMin = Leer.datoInt();
			System.out.println("\nIntroduce el número máximo posible (mayor que el anterior)");
			ranMax = Leer.datoInt();
			
			for(int i = 0; i < lista.length; i++)
			{
				lista[i] = num.nextInt(ranMax-ranMin)+ranMin;
			}
			do
			{
				seccion = 0;
				consultar = true;
				System.out.println("\n\n1. Introducir el número de la lista que quieres ver\n"
						+ "2. Crear nuevos números\n"
						+ "3.Salir del programa\n");
				seccion = Leer.datoInt();
				switch(seccion)
				{
				case 1:
					System.out.println("Inroduce la posición que quieres ver");
					seccion = Leer.datoInt();
					System.out.println("\n" + lista[seccion-1]);
					break;
				case 2:
					System.out.println("Generando nuevos números aleatorios");
					consultar = false;
					break;
				case 3:
					System.out.println("\nGracias por usar los servicios de Cachopo Interactive");
					consultar = false;
					repetir = false;
					break;
				}
			}while(consultar);
		}while(repetir);

	}

}
