package ejercicio06;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		double equiMercurio = 0.38, equiVenus = 0.91, equiTierra = 1.0, equiMarte = 0.38, equiJupiter = 2.53;
		double equiSaturno = 1.06, equiUrano = 0.92, equiNeptuno = 1.2;
		double peso = 0.0;
		double pesoEqui = 0.0;
		int menu = 0;
		boolean datoValido = true;
		boolean volverMenu = true;
		
		System.out.println("Hola usuario, introduzca su peso para continuar");
		peso = Leer.datoDouble();
		
		System.out.println("1. Tu peso en Mercurio\n"
				+ "2. Tu peso en Venus\n"
				+ "3. Tu peso\n"
				+ "4. Tu peso en Marte\n"
				+ "5. Tu peso en Jupiter\n"
				+ "6. Tu peso en Saturno\n"
				+ "7. Tu peso en Urano\n"
				+ "8. Tu peso en Neptuno\n");
		

		
		while(volverMenu == true)
		{
			System.out.println("Introduzca el numero de apartado que quieras visitar (para salir pulse 77)");
			menu = Leer.datoInt();
			
			datoValido = true;
			do 
			{
				datoValido = true;
				switch(menu)
				{
				case 1:
					pesoEqui = peso*equiMercurio;
					System.out.printf("Su peso en Mercurio es %.2f kg\n", pesoEqui);
					break;
					
				case 2:
					pesoEqui = peso*equiVenus;
					System.out.printf("Su peso en Venus es %.2f kg\n", pesoEqui);
					break;
					
				case 3:
					pesoEqui = peso*equiTierra;
					System.out.printf("Su peso en La Tierra es %.2f kg\n", pesoEqui);
					break;
					
				case 4:
					pesoEqui = peso*equiMarte;
					System.out.printf("Su peso en Marte es %.2f kg\n", pesoEqui);
					break;
					
				case 5:
					pesoEqui = peso*equiJupiter;
					System.out.printf("Su peso en Jupiter es %.2f kg\n", pesoEqui);
					break;
					
				case 6:
					pesoEqui = peso*equiSaturno;
					System.out.printf("Su peso en Saturno es %.2f kg\n", pesoEqui);
					break;
					
				case 7:
					pesoEqui = peso*equiUrano;
					System.out.printf("Su peso en Urano es %.2f kg\n", pesoEqui);
					break;
					
				case 8:
					pesoEqui = peso*equiNeptuno;
					System.out.printf("Su peso en Neptuno es %.2f kg\n", pesoEqui);
					break;
					
				case 77:
					System.out.println("Has salido del programa");
					volverMenu = false;
					break;
					
				default:
					System.out.println("Numero no valido, vuelve a introducir el partado que quieras visitar");
					datoValido = false;
					menu = Leer.datoInt();
					break;
				}
			}
			while(datoValido == false);
		}


	}

}
