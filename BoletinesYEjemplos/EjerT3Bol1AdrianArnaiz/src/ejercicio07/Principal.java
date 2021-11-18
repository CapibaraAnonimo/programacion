package ejercicio07;

import utilidades.*;

public class Principal {

	public static void main(String[] args) 
	{
		int seccion = 0;
		int numSec = 4;
		double camUSD = 1.13;
		Cuenta c1 = new Cuenta(Pedir.saldo(), Pedir.nombre());
		
		System.out.println("Bienvenido " + c1.getNombre());
		
		do
		{
			System.out.println("\n1. Ingresar dinero\n"
					+ "2. Retirar dinero\n"
					+ "3. Saldo en USD\n"
					+ "4. Consultar saldo\n"
					+ "0. Salir");
			seccion = Pedir.seccion(numSec);
			
			switch(seccion)
			{
			case 1:
				c1.ingresar(Pedir.dinero());
				break;
			case 2:
				c1.retirar(Pedir.dinero());
				break;
			case 3:
				System.out.printf("Su saldo en USD es de %.2f USD\n", c1.cambioUSD(camUSD));
				break;
			case 4:
				c1.conSaldo();
				break;
			case 0:
				break;
			}
		}while(seccion != 0);
		

	}

}
