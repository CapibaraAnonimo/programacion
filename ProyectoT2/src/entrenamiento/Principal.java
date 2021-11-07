package entrenamiento;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int dias = 7, seccion = 0, ranMaxP = 100, ranMinP = 0, numDoble = 0, aux1 = 0, aux2 = 0, edad = 0, sexo = 0;
		int premioCal = 500, premioTiem = 30;
		double tablaCal[] = new double[dias];
		double tablaTiem[] = new double[dias];
		int tablaDoble[] = new int[dias];
		boolean repetir = true;
		Random random = new Random(System.nanoTime());
		double peso = 0, estatura = 0;
		//Apartado 2
		int num= 0;
		double cal=0;
		//Apartado 3
		double calMujer=0.95, calHombre=1;
		double min=1, ocho=8;
		//Apartado 4
		int tam=1, tam2=7, numero=0;
		//Apartado 6
		double resultado=0;
		double factorActividad=1.5;
		double sedentaria=1.2;
		double pocaActividad=1.375;
		double moderada=1.55;
		double intensa=1.725;
		int desde=0;
		int hasta=0;
		double porc=10;
		int cien=100;
		double factor1H = 66, factor1M = 655, factor2H = 13.7, factor2M = 9.6, factor3H = 5, factor3M = 1.8, factor4H = 6.8, factor4M = 4.7;
		//Comprobación
		boolean case1 = false;
		boolean case3 = false;
		boolean case1OArray = false;
		
		
		System.out.println("Introduce los siguientes datos para calcular su ingesta de calorias semanales\n");
		System.out.println("Introduzca su peso en kg: ");
		do
		{
			peso=Leer.datoDouble();
		}while(peso <= 0);
		System.out.println("Introduzca su estatura en cm: ");
		do
		{
			estatura=Leer.datoDouble();
		}while(estatura <= 0);
		System.out.println("Introduzca su edad: ");
		do
		{
			edad=Leer.datoInt();
		}while(edad <= 0);
		
		do 
		{
			System.out.println("Introduzca su sexo, 1.Para hombre 2.Para mujer");
			sexo=Leer.datoInt();

			if(sexo>2 || sexo<1) {
				System.out.println("Escoga una de las 2 opciones");
			}
			
		}while(sexo>2 || sexo<1);
		
		do
		{
			
			if(case1OArray == false)
			{
				if (case1) 
				{
					case1OArray = true;
				}
				else 
				{
					for (int i = 0; i < tablaCal.length; i++)
					{
						if (tablaCal[i] > 0) 
						{
							case1OArray = true;
						}
						else
						{
							case1OArray = false;
							i = tablaCal.length;
						}
						
					}
				}	
			}
			
				
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
				do{
					System.out.println("\nElija su factor de actividad");
					System.out.println("1.Vida sedentaria");
					System.out.println("2.Poca Actividad fisica");
					System.out.println("3.Actividad fisica moderada");
					System.out.println("4.Actividad fisica intensa");
					seccion =Leer.datoInt();
					

					
					switch (seccion)
					{
						case 1:
							factorActividad=sedentaria;
							break;
						case 2:
							factorActividad=pocaActividad;
							break;
						case 3:
							factorActividad=moderada;
			
							break;
						case 4:
							factorActividad=intensa;
							break;
						default:
							System.out.println("\nEscoga una opcion posible");
							break;
						}
				}while(seccion  >4 || seccion < 1);
				
				
				if(sexo == 1) 
				{
					resultado = (factor1H + (factor2H*peso) + (factor3H*estatura) - (factor4H*edad))*factorActividad ;

				}
				else
				{
					resultado = (factor1M + (factor2M*peso) + (factor3M*estatura) - (factor4M*edad))*factorActividad ;

				}
				
				
				desde=(int) resultado;
				hasta=(int) (((resultado*porc)/cien)+resultado);
				System.out.printf("\nLunes\t Martes Miercoles Jueves Viernes Sabado\t Domingo\n");

				for (int i = 0; i < tablaCal.length; i++) {
					
					tablaCal[i]=random.nextInt(hasta-desde+1)+desde;
					System.out.printf("%.0f\t|",tablaCal[i]);
				}
				System.out.printf("\n\nEstas son tus calorias para cada dia de la semana");
				
				
				
				
				break;
			case 2:
				
				do 
				{
					System.out.println("Diga usted el día que quiere seleccionar o Pulse 0 para salir, siendo:");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.print("1 Lunes \t2 Martes \t3 Miercoles \t4 Jueves \t5 Viernes \t6 Sábado \t7 Domingo\n");
					num= Leer.datoInt();
					if(num < tablaCal.length && num > 0) 
					{
						System.out.println("Diga usted ¿Cuántas calorías quiere guardar?");
						cal=Leer.datoInt();
						if(cal > 0) 
						{
							tablaCal[num-1]= cal; 
							System.out.printf("Se ha almacenado correctamente en el día: %d :", num);
							System.out.printf("%.2f calorias\n", tablaCal[num-1]);
						}else 
						{
							System.out.println("Lo sentimos, no puede guardar 0 como cantidad de caloías.");
						}
					}else
					{
						System.out.println("Día no valido");
						System.out.println("---------------------------------------------------------------------------------------------------------");				
					}
				}while(num!=0);
				System.out.println("Ha decidido salir.");
				break;
			case 3:
				if(case1OArray)
				{
					case3 = true;
					for (int i=0; i < tablaCal.length; i++)
					{	
						if (sexo == 2) 
						{
							tablaTiem[i] = ((tablaCal[i] * calMujer) * min) / ocho;
						}else 
						{
							tablaTiem[i] = ((tablaCal[i] * calHombre)*min) / ocho;
						}
					}
					System.out.println("Se ha creado la tabla con el tiempo de entrenamiento satisfactóriamente");
				}
				else 
				{
					System.out.println("\nDebe entrar antes en la opción 1 o introducir los datos manualmente usando la opción 2");
				}
				break;
			case 4:
				if(case1OArray)
				{
					do 
					{
						System.out.println("\n\nDiga ¿Cuántos días quiere realizar entrenamientos dobles? O pulse 0 para salir.");
						System.out.println("---------------------------------------------------------------------------------------------------------");
						System.out.println("Los días son:\n1.Lunes \t2.Martes \t3.Miercoles \t4.Jueves \t5.Viernes \t6.Sábado \t7.Domingo");
						System.out.println("---------------------------------------------------------------------------------------------------------");
						aux1 = Leer.datoInt();
						numDoble = numDoble + aux1;
						if(aux1 >= 1) 
						{
							System.out.println("Los días de entrenamientos dobles serán el día: ");
							for(int i = 0; i < aux1; i++) 
							{
								if(aux1 > i && aux1 <= tablaDoble.length) 
								{
									numero = random.nextInt(tam2-tam+1)+tam;
									tablaDoble[numero-1]= tablaDoble[numero-1] + 1;
									System.out.print(numero+" ");
								}
							}
							System.out.println("\n-----------------------------------------------------");
						}else if(aux1 != 0)
						{
							System.out.println("\nNo puede introducir esa cantidad");
						}
					}while(aux1 != 0);
				}
				else 
				{
					System.out.println("\nDebe entrar antes en la opción 1 o introducir los datos manualmente usando la opción 2");
				}
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
				
				if(case1OArray && case3 == true)
				{
					System.out.println("\n\nTabla de calorias semanales");
			        System.out.printf("Lunes\t Martes Miercoles Jueves Viernes Sabado\t Domingo\n");
			        for (int i = 0; i < tablaCal.length; i++) 
			        {
			            tablaCal[i]=random.nextInt(hasta-desde+1)+desde;
			            System.out.printf("%.0f\t|",tablaCal[i]);
			        }
			        System.out.println("\nTabla de entrenamientos semanales");
			        System.out.printf("Lunes\t Martes Miercoles Jueves Viernes Sabado\t Domingo\n");
			        for (int i = 0; i < tablaCal.length; i++) 
			        {
			            System.out.printf("%.0f\t|",tablaTiem[i]);
			        }
			        System.out.println("\nTabla de entrenamientos dobles");
			        System.out.printf("Lunes\t Martes Miercoles Jueves Viernes Sabado\t Domingo\n");
			        for (int i = 0; i < tablaDoble.length; i++) 
			        {
			            System.out.printf("%d\t|",tablaDoble[i]);
			        }
				}
				else 
				{
					System.out.println("\nDebe entrar antes en la opción 1 o introducir los datos manualmente usando la "
							+ "opción 2 y haber entrado en la sección 3");
				}
				
				repetir = false;
				break;
			default: 
				System.out.println("La sección que ha introducido no existe");
				break;
			}
		}while(repetir);

	}

}
