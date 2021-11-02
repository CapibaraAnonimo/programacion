package ejercicio15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		String numTar = new String("1234567890"), numCod = new String("1221");
		String numTarIntro = new String(""), numCodIntro = new String("");
		double saldo = 1000.0;
		double dineroIntro = 0.0;
		double precioEntrada = 20.0;
		int entradas = 0;
		int seccion = 0;
		boolean secVal = false;
		boolean repetir = true;
		
		System.out.println("Bienvenido a bancos El Tio Gilito\n");
		
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Introduzca el número de tarjeta");
			numTarIntro = Leer.dato();
			System.out.println("Introduzca clave de acceso");
			numCodIntro = Leer.dato();
			
			if(numTar.equals(numTarIntro)&&numCod.equals(numCodIntro))
			{
				i = 100;
				while(repetir)
				{
					secVal = false;
					
					while(secVal == false)
					{
						System.out.println("\n1. Ver saldo\n"
								+ "2. Retirar dinero\n"
								+ "3. Ingresar dinero\n"
								+ "4. Comprar entradas\n"
								+ "5. Salir");
						System.out.println("\nIntroduzca el numero de sección a la que quiere acceder");
						seccion = Leer.datoInt();
						secVal = true;
						
						switch(seccion)
						{
						case 1:
							System.out.printf("\nSu saldo es %.2f EUR\n\n", saldo);
							break;
							
						case 2:
							System.out.println("\nIntroduzca cuanto dinero quiere retirar\n");
							dineroIntro = Leer.datoDouble();
							if(dineroIntro>saldo)
							{
								System.out.println("\nNo tiene tanto dinero, trabaja bago\n");
								secVal = false;
							}
							else
							{
								saldo = saldo-dineroIntro;
								System.out.printf("\nSu saldo ahora es de %.2f EUR\n\n", saldo);
							}
							break;
						
						case 3:
							System.out.println("\nIntroduzca el dinero que quiere ingresar\n");
							dineroIntro = Leer.datoDouble();
							saldo = saldo+dineroIntro;
							System.out.printf("Su saldo ahora es de %.2f EUR\n\n", saldo);
							break;
							
						case 4:
							System.out.println("\nIntroduzca el número de entradas deseadas\n");
							entradas = Leer.datoInt();
							if((entradas*precioEntrada)>saldo)
							{
								System.out.println("No tiene tanto dinero, trabaja bago\n");
								secVal = false;
							}
							else
							{
								saldo = saldo-(entradas*precioEntrada);
								System.out.printf("Su saldo ahora es de %.2f EUR\n\n", saldo);
							}
							break;
							
						case 5:
							repetir = false;
							break;
						
						default:
							secVal = false;
							System.out.println("Sección invalida");
							break;
						}
					}
				}
			}
			else
			{
				System.out.printf("Número de tarjeta o codigo de acceso incorrectos, le quedan %d intentos\n", (5-i-1));
			}
		}
		
		
		System.out.println("\n\n\n\nTenga buen día");

	}

}
