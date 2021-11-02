package ejemploArrays;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int longCad = 1;
		int longTab = 5;
		int numeros [] = new int[longCad];
		int tabla [][] = new int[longTab][longTab];
		
		for(int i = 0; i < numeros.length; i ++)
		{
			System.out.printf("Introduzca un el númer %d\n", i+1);
			numeros [i] = Leer.datoInt();
		}
		for(int i = 0; i < numeros.length; i ++)
		{
			System.out.printf("El numero %d es %d\n", i+1, numeros[i]);
		}
		System.out.println("\n\n");
		
		for(int i = 0; i < longTab; i++)
		{
			for(int j = 0; j < longTab; j++)
			{
				tabla[i][j] = j+i;
			}
		}
		for(int i = 0; i < longTab; i++)
		{
			for(int j = 0; j < longTab; j++)
			{
				System.out.printf("%d ", tabla[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n\n");
		
		
	}
}
