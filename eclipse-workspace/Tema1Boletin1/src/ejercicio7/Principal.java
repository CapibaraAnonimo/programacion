package ejercicio7;

public class Principal {

	public static void main(String[] args) 
	{
		double km = 100;
		double consumo = 4;
		double precio = 1.342;
		byte cien = 100;
		double result = 0;
		
		result = (km * consumo / cien) * precio;
		
		System.out.printf("El precio del viaje es de %.2f EUR.", result);

	}

}
