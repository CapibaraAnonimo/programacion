package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int num = 0;
		Operaciones op = new Operaciones();
		
		System.out.println("Diga un número y le diremos si es positivo o negativo y si es par o impar");
		num = Leer.datoInt();
		
		if(op.positivo(num))
		{
			System.out.printf("\nEl Número es Positivo ");
		}else {
			System.out.printf("\nEl Número es Negativo ");
		}
		
		if(op.par(num))
		{
			System.out.println("y es Par");
		}else {
			System.out.println("y es Impar");
		}

	}

}
