package ejercicio8;

public class Principal {

	public static void main(String[] args) 
	{
		double rad1 = 3;
		double rad2 = 5.2;
		double per = 0;
		double area = 0;
		byte dos = 2;
		
		per = dos * Math.PI * rad1;
		
		System.out.printf("La longitud de la primera circunferencia es de %.2f m\n", per);
		
		area = Math.PI * Math.pow(rad2, dos);
		
		System.out.printf("El area de la segunda circunferencia es de %.2f m2\n", area);
	}

}
