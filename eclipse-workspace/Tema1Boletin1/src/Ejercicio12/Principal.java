package Ejercicio12;

public class Principal {

	public static void main(String[] args) 
	{
		double resistencia = 20e3;
		double tension = 250;
		double intensidad = 0;
		
		System.out.println("Buenas usuario, este programa calcula la intensidad de corriente\n");
		
		intensidad = tension/resistencia;
		
		System.out.printf("La intensidad es de %.2e A", intensidad);

	}

}
