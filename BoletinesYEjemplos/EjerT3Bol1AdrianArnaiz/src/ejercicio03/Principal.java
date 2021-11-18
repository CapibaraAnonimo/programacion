package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		double radio = 0;
		double altura = 0;
		Cilindro cil = new Cilindro();
		
		System.out.println("Este programa clacula el volumen de un cilindro");
		
		System.out.println("Introduce el radio del cilindro");
		radio = Leer.datoDouble();
		System.out.println("introduce la altura del cilindro");
		altura = Leer.datoDouble();
		
		System.out.printf("El volumen del cilindro es %.2f u³", cil.volumen(radio, altura));

	}

}
