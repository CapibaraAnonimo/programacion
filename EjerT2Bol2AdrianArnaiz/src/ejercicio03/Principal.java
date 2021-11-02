package ejercicio03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int max = 8;
		int array [] = new int [max];
		int cont0 = 0;
		boolean repetir = true;
		double media = 0.0;
		
		do 
		{
			media = 0;
			cont0 = 0;
			System.out.println("Este programa calcula la media y la cantidad de 0 de entre los 8"
					+ "números introducidos(Para salir introduzca -777)\n");
			for(int i = 0; i < max; i++)
			{
				System.out.printf("introduce el número %d\n", i+1);
				array [i] = Leer.datoInt();
				if(array[i] == -777)
				{
					i = 10;
					repetir = false;
				}else{
					media = media + array[i];
					if(array[i] == 0)
					{
						cont0++;
					}
				}
			}
			if(repetir)
			{
				media = media/max;
				System.out.printf("\nLa media es %.2f y el numero de ceros es %d\n\n", media, cont0);
			}
		}while(repetir);

	}

}
