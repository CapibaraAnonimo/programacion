package ejercicio01;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int primero = 0, segundo = 0;
		
		System.out.println("Este programa te dice que número es mayor\n");
		
		System.out.println("Introduzca el primer número");
		primero = Leer.datoInt();
		
		System.out.println("Introduzca el segundo número");
		segundo = Leer.datoInt();
		
		if(primero>segundo)
		{
			System.out.printf("\n%d es mayor que %d\n", primero, segundo);
		}
		else if(segundo>primero)
		{
		System.out.printf("\n%d es mayor que %d\n", segundo, primero);
		}
		else
		{
			System.out.println("\nLos dos terminos son iguales");
		}


	}

}
