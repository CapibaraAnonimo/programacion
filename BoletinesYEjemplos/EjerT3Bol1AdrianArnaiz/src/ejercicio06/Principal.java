package ejercicio06;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int eleccion = 0;
		CaraOCruz game = new CaraOCruz();
		
		System.out.println("Este programa simula el lanzamiento de una moneda");
		
		do
		{
			System.out.println("\nIntroduzca 1 para cara o 2 para cruz");
			eleccion = Leer.datoInt();
			while(eleccion != 1 || eleccion != 2)
			{
				System.out.println("Número incorrecto, introduzca otro");
				eleccion = Leer.datoInt();
			}
			
			if(eleccion != 0)
			{
				game.comprobar(eleccion);
			}
		}while(eleccion != 0);
		
		System.out.println("Gracias por jugar");

	}

}
