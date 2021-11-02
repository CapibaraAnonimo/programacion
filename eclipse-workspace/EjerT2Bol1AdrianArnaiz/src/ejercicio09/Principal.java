package ejercicio09;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int numero = 0;
		int suma = 0;
		boolean datoNegativo = false;
		boolean repetir = true;
		
		
		
		while(repetir)
		{
			System.out.println("Este programa suma todos los números hasta que se introduzca uno "
					+ "negativo, para salir pulse -9");
			do
			{
				System.out.println("Introduzca un número positivo para sumar o negativo para terminar");
				numero = Leer.datoInt();
				if(numero != -9)
				{
					if(numero >= 0 && numero != -9)
					{
						suma = suma + numero;
					}
					else
					{
						datoNegativo = true;
					}
				}
				else
				{
					repetir = false;
					datoNegativo = true;	
				}
			
			}while(datoNegativo == false);
			if(repetir)
			{
				System.out.printf("La suma de los numeros introducidos es %d\n\n", suma);
			}
		}

	}

}
