package ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		CEcuacion2Grado ecuacion;
		double a = 0, b = 0, c = 0;
		double raices[];
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Introduzca a");
		a =  Double.parseDouble(escaner.nextLine());
		System.out.println("Introduzca b");
		b =  Double.parseDouble(escaner.nextLine());
		System.out.println("Introduzca c");
		c =  Double.parseDouble(escaner.nextLine());
		
		ecuacion = new CEcuacion2Grado(a, b, c);
		raices = ecuacion.calcularRaices();
		if(raices[0] == raices[1])
			System.out.println("Hay un único resultado, x = " + raices[0]);
		else
			System.out.println("Hay dos resultados, x = " + raices[0] + " y x = " + raices[1]);

	}

}
