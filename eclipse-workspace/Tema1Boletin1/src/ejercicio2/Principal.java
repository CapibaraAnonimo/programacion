package ejercicio2;

public class Principal {

	public static void main(String[] args) 
	{
		float largo = 50;
		float ancho = 21;
		float prof = 2.5f;
		float area = 0;
		float volumen = 0;
		float multiplicador = 1000;
		float litros = 0;
		float precio = 1.8f;
		float coste = 0;
		
		System.out.println("Hola usuario, este programa calcula el área,"
				+ " el volumen y el precio de llenar la piscina.\n");
		
		area = largo * ancho;
		System.out.printf("El área de la piscina es de %.2f m2.\n", area);
		
		volumen = area * prof;
		litros = volumen * multiplicador;
		System.out.printf("El volumen de la piscina es de %.2f m3 y tiene %.2f l\n", volumen, litros);
		
		coste = volumen * precio;
		System.out.printf("El precio de llenar la piscina es de %.2f €.\n", coste);
		
		
	}

}
