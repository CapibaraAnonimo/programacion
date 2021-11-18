package ordenar;

import java.util.Arrays;

public class ParaDepurar {
	
	public static void main(String[] args)
	{
		int[] numeros1 = new int[] {6, 54, 3, 45, 7, 9, 5, 3, 34, 6, 7};
		int[] ordenado = sort(numeros1);
		System.out.println(Arrays.toString(ordenado));
	}
	
	private static int[] sort(int[] numbers)
	{
		for(int i = 0; i < numbers.length - 1; i++)
		{
			for(int j = i + 1; j < numbers.length; j++)
			{
				if(numbers[i] > numbers[j])
				{
					int auxiliar = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = auxiliar;
				}
			}
		}
		return numbers;
	}
}
