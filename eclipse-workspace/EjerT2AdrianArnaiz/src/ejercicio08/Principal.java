package ejercicio08;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int numero = 0, suma = 0, producto = 1;
		boolean repetir = true;
		
		System.out.println("Este programa calcula la suma y el producto de 10 números, "
				+ "si quieres salir introduce 999");
		do
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.printf("Introduzca el número %d\n", i);
				numero = Leer.datoInt();
				if(numero != 999)
				{
					suma = suma + numero;
					producto = producto * numero;
				}
				else
				{
					i = 70;
					repetir = false;
				}

			}
			if(repetir)
			{
				System.out.printf("\nLa suma de todos los números introducidos es %d\n", suma);
				System.out.printf("El producto de todos los números introducidos es %d\n\n", producto);
				System.out.println("Si quieres salir introduce 999");
			}
		}
		while(repetir);
	
	}

}
