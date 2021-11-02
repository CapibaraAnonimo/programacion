package ejercicio05;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int lista[];
		Random ranNum = new Random(System.nanoTime());
		int ranMax = 0, ranMin = 0, suma = 0, mayor = 0, menor = 0;
		boolean repetir = true;
		int tam = 0;
		
		do
		{
			suma = 0;
			System.out.println("Este programa te da la suma y el número mayor y "
					+ "menor de los números aleatorios \ngenerados (para salir introduce en la longitud 0)\n");
			System.out.println("Introduzca la longitud del array");
			tam = Leer.datoInt();
			if(tam != 0)
			{
				lista = new int[tam];
				System.out.println("\nIntroduzca el mínimo posible");
				ranMin = Leer.datoInt();
				System.out.println("\nIntroduzca el máximo posible");
				ranMax = Leer.datoInt();
				menor = ranMin;
				mayor = 0;
				
				for(int i = 0; i < lista.length; i++)
				{
					
					lista[i] = ranNum.nextInt(ranMax-ranMin+1)+ranMin;
					if (i==0) {
						menor=lista[i];
					}
					suma = suma + lista[i];
					if(lista[i] < menor)
					{
						menor = lista[i];
					}
					if(lista[i] > mayor)
					{
						mayor = lista[i];
					}
				}
				System.out.printf("\n\nLa suma de todos los numeros aleatorios es %d, el máximo "
						+ "es %d y el mínimo es %d\n\n\n", suma, mayor, menor);
			}
			else {
				repetir = false;
			}

		}while(repetir);

	}

}
