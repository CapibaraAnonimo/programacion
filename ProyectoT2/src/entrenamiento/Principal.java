package entrenamiento;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int dias = 7, seccion = 0, ranMaxP = 100, ranMinP = 0, numDoble = 0, random = 0;
		double tablaCal[] = new double[dias];
		double tablaTiem[] = new double[dias];
		int tablaDoble[] = new int[dias];
		boolean repetir = true;
		Random ranPremio = new Random(System.nanoTime());

		
		
		do
		{
			System.out.println("1. Genera aleatoriamente las calorías de cada día de la semana\n"
					+ "2. Seleccione la cantidad de calorias que quieres un día\n"
					+ "3. Generar el tiempo de entrenamiento\n"
					+ "4. Días de entrenamientos doble\n"
					+ "5. Recompensas por entrenamiento doble\n"
					+ "6. Imprimir la tabla de entrenamientos personalizada y Salir\n");
			
			System.out.println("Introduzca la sección deseada");
			seccion = Leer.datoInt();
			
			switch(seccion)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				if(numDoble > 0)
				{
					System.out.println("1. Premio en calorias\n"
							+ "2. Premio en teimpo de entrenamiento\n"
							+ "3. Ver probabilidad de premios\n"
							+ "4. Salir\n");
					
					seccion = Leer.datoInt();
					
					switch(seccion)
					{
					case 1:
						
						break;
					case 2:
						break;
					case 3:
						System.out.println("Premio en calorias:\n"
								+ "Ganar 60%"
								+ "Nada 30%"
								+ "Un dia más de entrenamiento doble 10%");
						break;
					case 4:
						break;
					default:
						break;
					}
				}else 
				{
					System.out.println("No puede selecionar más premios");
				}
				break;
			case 6:
				repetir = false;
				break;
			}
		}while(repetir);

	}

}
