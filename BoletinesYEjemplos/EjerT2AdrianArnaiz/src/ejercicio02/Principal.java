package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		double dividendo = 0.0;
		double divisor = 0.0;
		double resultado = 0.0;
		
		System.out.println("Este programa divide");
		
		System.out.println("Introduzca el dividendo");
		dividendo = Leer.datoDouble();
		
		System.out.println("Introduzca el divisor");
		divisor = Leer.datoDouble();
		
		if(divisor != 0)
		{
			resultado = dividendo/divisor;
		}
		else
		{
			System.out.println("No se puede dividir");
		}
		
		System.out.printf("El resultado es %.2f", resultado);
		
	}

}
