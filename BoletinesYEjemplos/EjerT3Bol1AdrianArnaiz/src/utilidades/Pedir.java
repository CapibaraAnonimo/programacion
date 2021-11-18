package utilidades;

public class Pedir {
	
	public static String nombre()
	{
		System.out.println("Diga su nombre");
		return Leer.dato();
	}
	
	public static double saldo()
	{
		double aux = 0;
		System.out.println("Diga su saldo actual");
		do
		{
			aux = Leer.datoDouble();
			if(aux <= 0)
			{
				System.out.println("Introduzca un saldo válido");
			}
		}while(aux <= 0);
		return aux;
	}
	
	public static double dinero()
	{
		double aux = 0;
		System.out.println("Diga una cantidad de dinero");
		do
		{
			aux = Leer.datoDouble();
			if(aux <= 0)
			{
				System.out.println("\nIntroduzca una cantidad de dinero valida");
			}
		}while(aux <= 0);
		return aux;
	}
	
	public static int seccion(int numSec)
	{
		int aux = 0;
		System.out.println("\nIntroduzca la sección deseada");
		do
		{
			aux = Leer.datoInt();
			if(aux < 0 || aux > numSec)
			{
				System.out.println("Introduzca una sección válida");
			}
		}while(aux < 0 || aux > numSec);
		return aux;
	}
	
}
