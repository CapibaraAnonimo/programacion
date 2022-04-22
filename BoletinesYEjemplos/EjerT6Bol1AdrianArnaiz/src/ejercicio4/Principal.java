package ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		CEcuacion2Grado ecuacion = null;
		double a = 0, b = 0, c = 0;
		double raices[];
		Scanner escaner = new Scanner(System.in);
		boolean seguir = true;

		do {
			try {
				System.out.println("Introduzca a");
				a = Double.parseDouble(escaner.nextLine());
				System.out.println("Introduzca b");
				b = Double.parseDouble(escaner.nextLine());
				if( a == 0 && b == 0)
					throw new AB0Exception();
				System.out.println("Introduzca c");
				c = Double.parseDouble(escaner.nextLine());

				ecuacion = new CEcuacion2Grado(a, b, c);
				seguir = false;
			} catch (AB0Exception e) {
				System.out.println(e);
			}
		}while(seguir);
		seguir = true;

		do {
			raices = ecuacion.calcularRaices();
			if (raices[0] == raices[1])
				System.out.println("Hay un único resultado, x = " + raices[0]);
			else
				System.out.println("Hay dos resultados, x = " + raices[0] + " y x = " + raices[1]);
		}while(seguir);
		
		escaner.close();
	}

}
