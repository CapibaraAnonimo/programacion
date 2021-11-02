package ejercicio02;

public class Principal {
	public static void main(String[] args) 
	{
		int max = 10;
		int listaInt [] = new int [max];
		
		for(int i = 0; i < max; i++)
		{
			listaInt[i] = (i)*2;
		}
		for(int i = 0; i < max; i++)
		{
			System.out.println(listaInt[i]);
		}
		
		
	}
}
