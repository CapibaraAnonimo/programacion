package ejercicio07;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int numero = 0; int eleccion = 0;
		boolean repetir = true;
		
		do
		{
			System.out.println("Este programa te muestra la tabla de multiplicar de un número dado, introduzca uno");
			
			numero = Leer.datoInt();
			
			System.out.println("\n-Tabla-");
			
			for(int i = 0; i <= 10; i++)
			{
				System.out.printf("%d x %d = %d\n", i, numero, (i*numero));
			}
			System.out.println("\n Si quiere repetir el programa inroduzca 1");
			eleccion = Leer.datoInt();
			if(eleccion == 1)
			{
				repetir = true;
			}
			else
			{
				repetir = false;
			}
			
		}while(repetir);

	}

}
