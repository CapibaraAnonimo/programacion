package ejercicio;

import utilidades.Leer;

public class Principal {
	
	public static void main(String[] args) {
		Inmobiliaria inmo = new Inmobiliaria(1);
		int seccion = 0, mes = 0, porcentaje = 0;
		int precios[] = new int[6];
		double libra = 0.88;
		
		inmo.anyadirPiso("Rue del percebe, 13", 50, true, 1000);
		
		do
		{
			do
			{
				System.out.println("\n\nIntroduzca la secci�n deseada\n\n"
						+ "1. Generar precios para el piso\n"
						+ "2. Calcular el precio de venta al p�blico el mes deseado\n"
						+ "3. Precio del metro cuadrado del mes deseado\n"
						+ "4. Precio en libras esterlinas del mes deseado\n"
						+ "5. Datos del piso\n");
				seccion = Leer.datoInt();
				if(seccion < 0 || seccion > 5)
					System.out.println("Secci�n incorrecta, introduzca otra");
			}while(seccion < 0 || seccion > 5);
			
			switch(seccion)
			{
			case 0:
				break;
				
			case 1:
				precios = inmo.rellenarPrecio();
				for(int i = 0; i < precios.length; i++)
				{
					System.out.printf("Precios mes %d: %dEUR\n", i+1, precios[i]);
				}
				break;
				
			case 2:
				do
				{
					System.out.println("Diga el mes deseado");
					mes = Leer.datoInt();
					if(mes < 0 || mes > 7)
						System.out.println("Mes incorrecto, introduzca otro");
				}while(mes < 0 || mes > 7);
				
				do
				{
					System.out.println("Diga el porcentaje deseado");
					porcentaje = Leer.datoInt();
					if(porcentaje < 0 || porcentaje > 100)
						System.out.println("Porcentaje incorrecto, introduzca otro");
				}while(porcentaje < 0 || porcentaje > 100);
				System.out.printf("\n\nEl precio es %.2fEUR", inmo.PrecioMes(mes, porcentaje));
				break;
				
			case 3:
				do
				{
					System.out.println("Diga el mes deseado");
					mes = Leer.datoInt();
					if(mes < 0 || mes > 7)
						System.out.println("Mes incorrecto, introduzca otro");
				}while(mes < 0 || mes > 7);
				System.out.printf("\n\nEl metro cuadrado cuesta: %.2fEUR\n", inmo.precioMetro(mes));
				break;
				
			case 4:
				do
				{
					System.out.println("Diga el mes deseado");
					mes = Leer.datoInt();
					if(mes < 0 || mes > 7)
						System.out.println("Mes incorrecto, introduzca otro");
				}while(mes < 0 || mes > 7);
				System.out.printf("\n\nEl precio en libras es: %.2f\n", inmo.precioLibras(mes, libra));
				break;
				
			case 5:
				System.out.println(inmo.getPiso());
				break;
			}
		}while(seccion != 0);

	}

}
