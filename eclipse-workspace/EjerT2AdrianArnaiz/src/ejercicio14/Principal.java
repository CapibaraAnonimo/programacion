package ejercicio14;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		double sueldoMin = 1000;
		double ventas = 0.0;
		double sueldo20 = 0.0;
		byte cien = 100;
		byte porcentaje = 20;
		double sueldoTotal = 0.0;
		
		System.out.println("Este programa calcula tu sueldo, introduce el dinero generado por ventas para continuar");
		ventas = Leer.datoDouble();
		
		sueldo20 = ventas/cien*porcentaje;
		
		sueldoTotal = sueldoMin + sueldo20;
		
		System.out.printf("\nTu sueldo habiendo generado %.2f EUR en ventas es de %.2f EUR", ventas, sueldoTotal);

	}

}
