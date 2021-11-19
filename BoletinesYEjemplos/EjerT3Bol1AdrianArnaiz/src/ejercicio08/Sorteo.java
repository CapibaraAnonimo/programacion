package ejercicio08;

import java.util.Random;

public class Sorteo 
{
	private int ganador = 0;
	private int ranMax = 99999, ranMin = 0;
	private Random random = new Random(System.nanoTime());
	
	public Sorteo()
	{
		ganador = random.nextInt(ranMax-ranMin+1)+ranMin;
	}
	
	public int comprar()
	{
		return random.nextInt(ranMax-ranMin+1)+ranMin;
	}
	
	public void ganador(int numero)
	{
		if(ganador == numero)
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
			System.out.println("Ha Ganado");
		}else
		{
			System.out.println("Siga jugando");
		}
	}

}
