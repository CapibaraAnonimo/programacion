package ejercicio10;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int numero = 0;
		long factorial = 1;
		
		System.out.println("Introduzca un número para calcular su factorial");
		
		numero = Leer.datoInt();
		
		for(int i = 1; i <= numero; i ++)
		{
			factorial = factorial * i;
		}
		
		System.out.printf("El factorial de %d es %d", numero, factorial);

	}

}
