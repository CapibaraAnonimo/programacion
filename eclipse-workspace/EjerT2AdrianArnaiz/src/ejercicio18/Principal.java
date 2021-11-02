package ejercicio18;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int a = 0, b = 0, c = 0, dos = 2, menos4 = -4;
		double discriminante = 0, resultado1 = 0, resultado2 = 0;
		boolean valido = false;
		
		System.out.println("Este programa calcula las soluciones de una ecuación de "
				+ "segundo grado tal que así ax2+bx+c");
		
		do
		{
			System.out.println("Introduce a");
			a = Leer.datoInt();
			if(a == 0)
			{
				System.out.println("a no puede ser 0");
				valido = false;
			}
			else
			{
				valido = true;
			}
		}
		while(!valido);
		
		System.out.println("Introduce b");
		b = Leer.datoInt();
		
		System.out.println("Introduce c");
		c = Leer.datoInt();
		
		discriminante = b*b + (a*c*menos4) ;
		
		if(discriminante >= 0)
		{
			resultado1 = (-b + Math.sqrt(discriminante))/(dos*a);
			resultado2 = (-b - Math.sqrt(discriminante))/(dos*a);
			
			System.out.printf("El primer resultado = %.2f\n", resultado1);
			System.out.printf("El segundo resultado = %.2f\n", resultado2);
		}
		else
		{
			System.out.println("Raices imaginarias");
		}

	}

}
