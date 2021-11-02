package ejercicio12;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		double notaLeida = 0.0;
		double media = 0.0;
		int suspensos = 0;
		int numeroAsignaturas = 6;
		int notaMinima = 5;
		
		System.out.println("Esta calculadora te dice tu media y el número de asignaturas suspensas");
		
		for(int i = 0; i < numeroAsignaturas; i++)
		{
			System.out.printf("Introduce la asignatura %d\n", (i+1));
			notaLeida = Leer.datoDouble();
			media = media + notaLeida;
			if(notaLeida<notaMinima)
			{
				suspensos = suspensos + 1;
			}
		}
		media = media/numeroAsignaturas;
		
		System.out.printf("Tu media es %.2f y has suspendido %d asignatura",  media, suspensos);

	}

}
