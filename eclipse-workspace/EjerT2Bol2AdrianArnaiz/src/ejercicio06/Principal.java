package ejercicio06;

public class Principal {

	public static void main(String[] args) 
	{
		int corredores = 5;
		String titulos[] = {"Corredores", "Carrera 1", "Carrera 2", "Carrera 3", "Media Corredor"};
		String nombres[] = {"Nombre1","Nombre2","Nombre3","Nombre4","Nombre5", "Suma tiempos", "Media tiempos"};
		double tiempo[][] = {{12.5, 14.2, 10.8}, {14.3, 15.6, 9.3}, {11.7, 13.5, 12.2}, {0 ,0 , 0}, {0, 0, 0}};
		double sumaCa[] = {0.0, 0.0, 0.0};
		double mediaCa[] = {0.0, 0.0, 0.0};
		double mediaCo[] = {0.0, 0.0, 0.0, 0.0, 0.0};
		
		for(String i : titulos)
		{
			System.out.printf("%s\t", i);
		}
		System.out.println("\n------------------------------------------------------------------------------");
		for(int i = 0; i < nombres.length; i++)
		{
			System.out.printf("%s\t", nombres[i]);
			if(i < nombres.length - (nombres.length-corredores))
			{
				for(int j = 0; j < tiempo[i].length +1; j++)
				{
					if(j < tiempo[i].length)
					{
						sumaCa[j] = sumaCa[j] + tiempo[i][j];
						mediaCo[i] = mediaCo[i] +tiempo[i][j];
						System.out.printf("\t%.2f\t",tiempo[i][j]);
					}else
					{
						System.out.printf("\t%.2f", mediaCo[i]);
					}
				}
			}else
			{
				if(i < nombres.length - (nombres.length-corredores-1))
				{
					for(double j :  sumaCa)
					{
						System.out.printf("%.2f\t\t", j);
					}
				}else
				{
					for(int j = 0; j < sumaCa.length; j++)
					{
						mediaCa[j] = mediaCa[j]/corredores;
						System.out.printf("%.2f\t\t", sumaCa[j]/corredores);
					}	
				}
			}
			System.out.println();
		}

	}

}
