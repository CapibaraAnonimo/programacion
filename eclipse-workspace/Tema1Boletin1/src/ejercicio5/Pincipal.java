package ejercicio5;

public class Pincipal {

	public static void main(String[] args) 
	{
		double dinero = 50;
		double usdToEur = 1.17;
		double result = 0;
		
		result = dinero * usdToEur;
		System.out.printf("Tienes %.2f EUR, que son %.2f USD", dinero, result);
		

	}

}
