package ejercicio05;

import java.util.Random;

public class Sorteo 
{
	private Random ran = new Random(System.nanoTime());
	private int aux = 0;
	private int maxQui = 3, minQui = 1;
	private int maxPoN = 2, minPoN = 1;
	private int maxChi = 3, minChi = 1;
	private int maxPri = 49, minPri = 1;
	
	public Sorteo()
	{
	}
	
	public char quiniela()
	{
		aux = ran.nextInt(maxQui-minQui+1)+minQui;
		if(aux == minQui)
		{
			return '1';
		}else if(aux == maxQui) 
		{
			return '2';
		}else
		{
			return 'x';
		}
	}
	
	public int paresONones()
	{
		aux = ran.nextInt(maxPoN-minPoN+1)+minPoN;
		
		return aux;
	}
	
	public int chinos()
	{
		aux = ran.nextInt(maxChi-minChi+1)+minChi;
		
		return aux;
	}
	
	public int primitiva()
	{
		aux = ran.nextInt(maxPri-minPri+1)+minPri;
		
		return aux;
	}

}
