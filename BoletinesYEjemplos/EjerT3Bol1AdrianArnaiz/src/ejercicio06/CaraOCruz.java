package ejercicio06;

import java.util.Random;

public class CaraOCruz 
{
	private Random ran = new Random(System.nanoTime());
	private int ranMin = 1, ranMax = 2;
	
	public CaraOCruz()
	{
	}
	
	public int lanzar()
	{
		return ran.nextInt(ranMax-ranMin+1)+ranMin;
		
	}
	
	public void comprobar(int eleccion)
	{
		if(eleccion == lanzar())
		{
			mostrar(true);
		}
		else {
			mostrar(false);
		}
	}
	
	public void mostrar(boolean ganador)
	{
		if(ganador)
		{
			System.out.println("-----------\n"
							 + "|Ha Ganado|\n"
							 + "-----------");
		}
		else
		{
			System.out.println(" ____________\n"
							 + "/Siga Jugando\\\n"
							 + "--------------");
		}
	}

}
