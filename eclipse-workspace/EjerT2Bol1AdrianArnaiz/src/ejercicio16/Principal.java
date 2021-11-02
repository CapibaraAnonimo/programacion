package ejercicio16;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) throws InterruptedException 
	{
		double a = 0.0, b = 0.0;
		double total = 0.0;
		int parImpar = 0;
		int seccion = 0;
		boolean repetir = true;
		boolean datoVal = true;
		int numSecciones = 7;
		String logo = new String("             .,-:;//;:=,\r\n"
				+ "         . :H@@@MM@M#H/.,+%;,\r\n"
				+ "      ,/X+ +M@@M@MM%=,-%HMMM@X/,\r\n"
				+ "     -+@MM; $M@@MH+-,;XMMMM@MMMM@+-\r\n"
				+ "    ;@M@@M- XM@X;. -+XXXXXHHH@M@M#@/.\r\n"
				+ "  ,%MM@@MH ,@%=            .---=-=:=,.\r\n"
				+ "  -@#@@@MX .,              -%HX$$%%%+;\r\n"
				+ " =-./@M@M$                  .;@MMMM@MM:\r\n"
				+ " X@/ -$MM/                    .+MM@@@M$\r\n"
				+ ",@M@H: :@:                    . -X#@@@@-\r\n"
				+ ",@@@MMX, .                    /H- ;@M@M=\r\n"
				+ ".H@@@@M@+,                    %MM+..%#$.\r\n"
				+ " /MMMM@MMH/.                  XM@MH; -;\r\n"
				+ "  /%+%$XHH@$=              , .H@@@@MX,\r\n"
				+ "   .=--------.           -%H.,@@@@@MX,\r\n"
				+ "   .%MM@@@HHHXX$$$%+- .:$MMX -M@@MM%.\r\n"
				+ "     =XMMM@MM@MM#H;,-+HMM@M+ /MMMX=\r\n"
				+ "       =%@M@M#@$-.=$@MM@@@M; %M%=\r\n"
				+ "         ,:+$+-,/H#MMMMMMM@- -,\r\n"
				+ "               =++%%%%+/:-.");
		
		System.out.println("Bienvenido a la calculadora de Aperture Science\n");
		System.out.println("\tA Trusted Friend in Science\n");
		
		do
		{
			datoVal = true;
			System.out.println("1. Suma\n"
					+ "2. Resta\n"
					+ "3. Multiplicación\n"
					+ "4. División\n"
					+ "5. Par/Impar (Solo la primera vez que se introduce un número)\n"			//quitar decimales?
					+ "6. Terminar la operación\n"
					+ "7. Salir\n");
			
			while(datoVal)																		//While para determinar que el dato es valido
			{
				System.out.println("Introduce el número de la operación deseada");
				seccion = Leer.datoInt();
				if(seccion <= numSecciones)
				{
					datoVal = false;	
				}
				else
				{
					System.out.println("El número introducido no es valido");
				}
			}
			
			if(seccion < 6)
			{
				System.out.println("Introduce el primer número de la operación");
				a = Leer.datoDouble();
			}
			
			do																					//While para hacer operaciones hasta que se introduzca un 6
			{
				if(seccion < 5)
				{
					System.out.println("Introduce un número para operar con el anterior");
					b = Leer.datoDouble();
				}
				
				switch(seccion)  																//Switch para elegir operación
				{
				case 1:																			//Suma
					total = a + b;
					System.out.printf("%.2f + %.2f = %.2f\n\n", a, b, total);
					a = total;
					break;
				case 2:																			//Resta
					total = a - b;
					System.out.printf("%.2f - %.2f = %.2f\n\n", a, b, total);
					a = total;
					break;
				case 3:																			//Multiplicación
					total = a*b;
					System.out.printf("%.2f*%.2f = %.2f\n\n", a, b, total);
					a = total;
					break;																		//División
				case 4:
					if(b != 0)
					{
						total = a/b;
						System.out.printf("%.2f/%.2f = %.2f\n\n", a, b, total);
						a = total;
					}
					else
					{
						System.out.println("No se puede dividir entre 0\n");
					}
					break;
				case 5:																			//Par Impar
					if((parImpar%2) == 0)
					{
						System.out.printf("%.0f es par\n\n", a);
					}
					else
					{
						System.out.printf("%.0f es impar\n\n", a);
					}
					break;
				case 6:																			//Salir
					repetir = false;
					System.out.printf("\nEl total es %.2f\n\n", total);
					break;
				case 7:
					repetir = false;
					break;
				default:
					repetir = false;
					break;
				}
				if(repetir)																//Se pide una nueva operación
				{
					datoVal = true;
					while(datoVal)
					{
						System.out.println("1. Suma\n"
								+ "2. Resta\n"
								+ "3. Multiplicación\n"
								+ "4. División\n"
								+ "5. Par/Impar (Solo la primera vez que se introduce un número)\n"			//quitar decimales?
								+ "6. Terminar la operación\n"
								+ "7. Salir\n");
						System.out.println("Introduce una nueva sección para continuar con las operaciones");
						seccion = Leer.datoInt();
						if(seccion <= numSecciones)
						{
							datoVal = false;	
						}
						else
						{
							System.out.println("El número introducido no es valido");
						}
					}
				}
				
			}
			while(repetir);
			repetir = true;
		}while(seccion != 7);
		
		
		System.out.println("\n\tWe do what we must because we can\n");		//A partir de aquí es algo extra
		
		for(int i = 0; i < logo.length(); i++)
		{
			if(logo.charAt(i) == '\n' || logo.charAt(i) == '\r' || logo.charAt(i) == ' ')
			{
				Thread.sleep(15);
				System.out.printf("%s",logo.charAt(i));
			}
			else
			{
				Thread.sleep(60);
				System.out.printf("%s",logo.charAt(i));
			}
		}
		
	}

}
