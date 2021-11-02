package ejercicio11;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int a = 0;
		int b = 0;
		int exponencial = 1;
		
		System.out.println("Este programa calcula a^b");
		System.out.println("Introduzca a");
		a = Leer.datoInt();
		System.out.println("Introduzca b");
		b = Leer.datoInt();
		
		for(int i = 1; i <= b; i++)
		{
			exponencial = exponencial * a;
		}
		
		System.out.printf("\na^b es %d", exponencial);
		
	}

}
