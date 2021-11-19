package ejercicio08;

import utilidades.Pedir;

public class Principal {

	public static void main(String[] args) 
	{
		int numero = 0;
		int seccion = 0;
		int numSec = 2;
		Sorteo sorteo = new Sorteo();
		
		do
		{
			System.out.println("\n1. Comprar boleto\n"
					+ "2. Comprobar Último Boleto Comprado\n"
					+ "0. Salir");
			seccion = Pedir.seccion(numSec);
			
			switch(seccion)
			{
			case 1:
				numero = sorteo.comprar();
				System.out.printf("Su número es %d\n", numero);
				break;
			case 2:
				sorteo.ganador(numero);
				break;
			case 0:
				break;
			}
		}while(seccion != 0);

	}

}
