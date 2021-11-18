package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		double radiocm = 0;
		double radiom = 0;
		Circulo circulo = new Circulo();
		
		System.out.println("Introduce el radio en cm");
		radiocm = Leer.datoDouble();
		System.out.println("Introduce el radio en m");
		radiom = Leer.datoDouble();
		
		System.out.printf("El area en cm es %.2f cm\n", circulo.getAreacm(radiocm));
		System.out.printf("El area en m es %.2f m\n", circulo.getAream(radiom));

	}

}
