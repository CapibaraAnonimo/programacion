package ejercicio13;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		double horasTra = 0.0;
		int horasMin = 40;
		int sueldoMin = 16;
		int sueldoMax = 20;
		double sueldo = 0.0;
		
		System.out.println("Este programa calcula tu sueldo, introduce tus horas trabajadas para continuar");
		
		horasTra = Leer.datoDouble();
		
		if(horasTra<=horasMin)
		{
			sueldo = horasTra*sueldoMin;
		}
		else
		{
			sueldo =horasMin*sueldoMin;
			sueldo = sueldo + (horasTra-horasMin)*sueldoMax;
		}

		System.out.printf("\nTu sueldo es %.2f", sueldo);
		
	}

}
