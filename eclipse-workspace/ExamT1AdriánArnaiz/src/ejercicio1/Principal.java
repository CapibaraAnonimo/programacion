package ejercicio1;

public class Principal {

	public static void main(String[] args) 
	{
		double peso = 86.0;
		double altura = 1.83;
		int exponente = 2;
		double indice = 0.0;
		String nombre = new String("Ángel Naranjo González");
		char sexo = 'V', estadoCivil = 'C';
		
		indice = peso/Math.pow(altura, exponente);
		
		System.out.println("\tFarmacia la golondrina\n\n");
		System.out.println("Datos personales:\n");
		System.out.printf("\tNombre: %s\n", nombre);
		System.out.printf("\tSexo: %c\n", sexo);
		System.out.printf("\tEstado civil: %c\n", estadoCivil);
		System.out.printf("\tPeso: %.2f kg\n", peso);
		System.out.printf("\tAltura: %.2f m\n\n", altura);
		System.out.println("---------------------------------------\n");
		System.out.printf("Su indice de masa corporal dadas las \n"
				+ "mediciones tomadas es de %.2f\n\n", indice);
		System.out.println("---------------------------------------\n");
		System.out.println("Gracias por confiar en la golondrina");

	}

}
