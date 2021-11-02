package ejercicio19;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int n = 0;
		
		System.out.println("Este programa te dibuja una pirámide de números");
		
		System.out.println("Introduce n");
		n = Leer.datoInt();
		
		for(int i = 0; i < n; i ++)
		{
			for(int p = 0; p < i+1; p ++) 
			{
				System.out.printf("%d ", p+1);
			}
			System.out.println();
		}

	}

}
