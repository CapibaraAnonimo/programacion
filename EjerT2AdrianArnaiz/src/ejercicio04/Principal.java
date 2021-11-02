package ejercicio04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int numero = 0;
		
		System.out.println("Este programa te dice si es par o impar el número introducido");
		System.out.println("Introduzca un numero");
		
		numero = Leer.datoInt();
		
		if(numero%2 == 0)
		{
			System.out.println("Es par");
		}
		else 
		{
			System.out.println("Es impar");
		}

	}

}
