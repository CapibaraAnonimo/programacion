package ejercicio20;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int n = 0, nEsp = 0;
		
		System.out.println("Este programa te pinta una pirámide");
		
		System.out.println("Introduce el número de filas de la irámide");
		n = Leer.datoInt();
		nEsp = n - 1;
		
		for(int i = 0; i < n; i ++)
		{
			for(int p = 0; p < nEsp; p ++)
			{
				System.out.printf(" ");
			}
			
			if(i != 0)
			{
				for(int u = 0; u < 2; u ++)
				{
					for(int p = 0; p < i; p ++)
					{
						System.out.printf("#");
					}
				}
			}
			
			System.out.println("#");
			nEsp--;
		}
		

	}

}