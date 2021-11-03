package ejercicio1;

import java.util.Random;
import lectura.Leer;


public class Principal {

	public static void main(String[] args) 
	{
		int dias[] = null;
		Random ranNum = new Random(System.nanoTime());
		int ranMax = 0, ranMin = 0, seccion = 0, diasLong = 0, diaSel = 0, diasLlu = 0;
		int cien = 100;
		double mediaLlu = 0.0, diaPorc = 0, mediaEpoca = 15;
		boolean repetir = true, datoVal = true;
		
		
		System.out.println("Bienvenido a Meteorología el Nubarron\n\n");
		System.out.println("Introduzca el número de días (n > 0) que quiere que se almacenen en el programa");
		System.out.println("(Esto tendra consecuencias irreversibles durante la ejecución del programa)");
		
		do
		{
			diasLong = Leer.datoInt();
			if(diasLong > 0)
			{
				dias = new int[diasLong];
				System.out.println("\nSe ha creado la tabla de días satisfactorianmete");
				datoVal = false;
			} else {
				System.out.println("El número introducido no es valido, introduzca un nuevo");
			}
		}while(datoVal);
		datoVal = true;
		
		do
		{
			System.out.println("\n1. Se llenará la tabla de números aleatorios\n"
					+ "2. Mostrar la lista de Días/Lluvia\n"
					+ "3. Mostrar la lluvia de un día\n"
					+ "4. Numero de días que ha llovido\n"
					+ "5. Media de lluvia\n"
					+ "6. Porcentaje de lluvia de un día\n"
					+ "7. Salir\n");
			System.out.println("\nIntroduzca la sección a la que quiere ir");
			seccion = Leer.datoInt();
			switch(seccion)
			{
			case 1:
				System.out.println("Inroduce el máximo posible del aleatorio");
				ranMax = Leer.datoInt();
				System.out.println("Inroduce el mínimo posible del aleatorio");
				ranMin = Leer.datoInt();
				for(int i = 0; i < dias.length; i++)
				{
					dias[i] = ranNum.nextInt(ranMax-ranMin+1)+ranMin;
				}
				System.out.println("Se han introducido los números satisfactoriamente");
				break;
			case 2:
				System.out.println("Día\tCantidad");
				for(int i = 0; i < dias.length; i++)
				{
					System.out.printf("\n%d\t%d\n", i+1, dias[i]);
				}
				break;
			case 3:
				System.out.println("Introduzca el día que quiere ver");
				while(datoVal) 
				{
					diaSel = Leer.datoInt();
					if(diaSel > 0 && diaSel <= dias.length)
					{
						System.out.printf("El día %d llovió %d\n", diaSel, dias[diaSel-1]);
						datoVal = false;
					}else {
						System.out.println("Día introducido incorrecto, introduzca otro");
					}
				}
				datoVal = true;
				break;
			case 4:
				for(int i = 0; i < dias.length; i++)
				{
					if(dias[i] > 0)
					{
						diasLlu++;
					}
				}
				System.out.printf("Ha llovido %d días\n", diasLlu);
				diasLlu = 0;
				break;
			case 5:
				for(int i = 0; i < dias.length; i++)
				{
					mediaLlu = mediaLlu + dias[i];
				}
				mediaLlu = mediaLlu / dias.length;
				System.out.printf("La media de lluevia diaria es %.2f\n", mediaLlu);
				mediaLlu = 0;
				break;
			case 6:
				System.out.println("Introduzca el día del que quiere saber el porcentaje");
				while(datoVal) 
				{
					diaSel = Leer.datoInt();
					if(diaSel > 0 && diaSel <= dias.length)
					{
						diaPorc = (dias[diaSel-1]/mediaEpoca) * cien;
						System.out.printf("El porcentaje de lluvia es de %.2f\n", diaPorc);
						datoVal = false;
					}else {
						System.out.println("Día introducido incorrecto, introduzca otro");
					}
				}
				datoVal = true;
				break;
			case 7:
				repetir = false;
				break;
			}
		}while(repetir);
		
		System.out.println("\nHa salido del programa");
		System.out.println("\n\n\n\tGracias por usar productos El Nubarron");
		
	}

}