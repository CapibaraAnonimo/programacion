package ejercicio03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		double saldo = 600.0;
		double dineroReti = 0.0;
		
		System.out.println("Este programa te retira dinero de la cuenta de manera totalmente legal");
		
		System.out.println("Introduzca cuanto quiere retirar");
		dineroReti = Leer.datoDouble();
		
		if(dineroReti<=saldo)
		{
			saldo = saldo - dineroReti;
			System.out.printf("Su saldo actual es de %.2f EUR", saldo);
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}

	}

}
