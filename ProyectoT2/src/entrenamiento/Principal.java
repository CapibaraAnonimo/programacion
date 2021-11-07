package entrenamiento;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int dias = 7, seccion = 0, ranMaxP = 100, ranMinP = 0, numDoble = 100, aux1 = 0, aux2 = 0, edad = 0, sexo = 0;
		int premioCal = 500, premioTiem = 30;
		double tablaCal[] = new double[dias];
		double tablaTiem[] = new double[dias];
		int tablaDoble[] = new int[dias];
		boolean repetir = true;
		Random random = new Random(System.nanoTime());
		double peso = 0, estatura = 0;
		//Apartado 6
		double resultado=0;
		double factorActividad=1.5;
		double sedentaria=1.2;
		double pocaActividad=1.375;
		double moderada=1.55;
		double intensa=1.725;
		int opc=0;
		int desde=0;
		int hasta=0;
		double porc=10;
		int cien=100;

		
		System.out.println("Introduce los siguientes datos para calcular su ingesta de calorias semanales\n");
		System.out.println("Introduzca su peso: ");
		peso=Leer.datoDouble();
		System.out.println("Introduzca su estatura en cm: ");
		estatura=Leer.datoDouble();
		System.out.println("Introduzca su edad: ");
		edad=Leer.datoInt();
		
		do 
		{
			System.out.println("Introduzca su sexo, 1.Para hombre 2.Para mujer");
			sexo=Leer.datoInt();

			if(sexo>2 || sexo<1) {
				System.out.println("Escoga una opcion posible");
			}
			
		}while(sexo>2 || sexo<1);
		
		do
		{
			System.out.println("\n\n1. Genera aleatoriamente las calorías de cada día de la semana\n"
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
					do
					{
						System.out.println("\n1. Premio en calorias\n"
								+ "2. Premio en teimpo de entrenamiento\n"
								+ "3. Ver probabilidad de premios\n"
								+ "4. Salir\n");
						
						seccion = Leer.datoInt();
						
						switch(seccion)
						{
						case 1:
							System.out.println("Ha seleccionado Premio en calorias");
							
							aux1 = random.nextInt(ranMaxP-ranMinP+1)+ranMinP;
							if(aux1 <= 60)
							{
								aux2 = random.nextInt(dias-1-ranMinP+1)+ranMinP;
								tablaCal[aux2] = tablaCal[aux2] + premioCal;
								System.out.printf("Enhorabuena, ha ganado %d kcal el día %d de la semana\n", premioCal, aux2+1);
							}else if(aux1 <= 90)
							{
								System.out.println("No ha conseguido nada");
							}else
							{
								aux2 = random.nextInt(dias-1-ranMinP+1)+ranMinP;
								tablaDoble[aux2] = tablaDoble[aux2] + 1;
								numDoble = numDoble +1;
								System.out.printf("Ha ganado una sesión más de entrenamiento el día %d\n", aux2+1);
							}
							
							if(numDoble <= 0)
							{
								repetir = false;
							}
							break;
						case 2:
							System.out.println("Ha seleccionado Premio en Tiempo de Entrenamiento");
							
							aux1 = random.nextInt(ranMaxP-ranMinP+1)+ranMinP;
							if(aux1 <= 60)
							{
								aux2 = random.nextInt(dias-1-ranMinP+1)+ranMinP;
								tablaTiem[aux2] = tablaCal[aux2] - premioTiem;
								System.out.printf("Enhorabuena, ha ganado -%d minutos de entrenamiento el día %d de la semana\n", premioTiem, aux2+1);
							}else if(aux1 <= 90)
							{
								System.out.println("No ha conseguido nada");
							}else
							{
								aux2 = random.nextInt(dias-1-ranMinP+1)+ranMinP;
								tablaDoble[aux2] = tablaDoble[aux2] + 1;
								numDoble = numDoble +1;
								System.out.printf("Ha ganado una sesión más de entrenamiento el día %d\n", aux2+1);
							}
							
							if(numDoble <= 0)
							{
								repetir = false;
							}
							break;
						case 3:
							System.out.println("\nGanar 60%\n"
									+ "Nada 30%\n"
									+ "Un dia más de entrenamiento doble 10%");
							break;
						case 4:
							repetir = false;
							break;
						default:
							System.out.println("Sección invalida");
							break;
						}
					}while(repetir);
				}else 
				{
					System.out.println("No puede selecionar más premios");
				}
				repetir = true;
				break;
			case 6:
				repetir = false;
				break;
			default: 
				System.out.println("La sección que ha introducido no existe");
				break;
			}
		}while(repetir);

	}

}
