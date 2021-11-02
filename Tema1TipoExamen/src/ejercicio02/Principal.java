package ejercicio02;

public class Principal {

	public static void main(String[] args) 
	{
		double s0 = 5.5;            //Todo debe estar en m y s
		double s = 0;
		double v = 3.2;
		double t = 5.3;
		
		System.out.println("Esta calculadora calcula el espacio recorrido en un MRU\n");
		
		s = s0 + v*t;
		
		System.out.printf("El espacio recorrido por la zapatilla que iba a %.2f m/s, durante %.2f s, "
				+ "habiendo recorrido inicialmente %.2f m, es de %.2f m\n", v, t, s0, s);

	}

}
