package ejercicio17;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int numCiclos = 0;
		int anterior = 0, siguiente = 1, total = 0;
		
		System.out.println("Este programa te muestra los n primeros números de la serie de Fibonacci");
		
		System.out.println("Introduce el número de números que quieres que se muestren");
		numCiclos = Leer.datoInt();
		
		System.out.println("\n" +anterior + "\n" + siguiente);
		for(int i = 0; i < numCiclos-2; i++)
		{
			total = anterior + siguiente;
			anterior = siguiente;
			siguiente = total;
			System.out.println(total);
		}

	}

}
