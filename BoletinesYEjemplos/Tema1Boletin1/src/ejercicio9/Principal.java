package ejercicio9;

public class Principal {

	public static void main(String[] args) 
	{
		double nava = 1500;
		int conci = 65000;
		int teat = 600;
		double res = 0;
		
		System.out.println("Bienvenido a la calculadora de navas\n");
		
		res = conci/nava;
		System.out.printf("El número de navas en el concierto fue de %.2f\n", res);
		
		res = teat/nava;
		System.out.printf("El número de navas del teatro es de %.2f\n", res);

	}

}
