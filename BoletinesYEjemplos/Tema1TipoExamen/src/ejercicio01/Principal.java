package ejercicio01;

public class Principal {

	public static void main(String[] args) 
	{
		double costeFab = 5000;
		double porBeneficio = 15;
		double porImpuestos = 12.5;
		byte cien = 100;
		double precioF = 0;
		
		System.out.println("Hola, esta es una calculadora de coste de coches\n");
		System.out.printf("Los datos introducidos son:\n");
		System.out.printf("Coste de fabricación = %.2f EUR\n", costeFab);
		System.out.printf("Beneficios de la empresa = %.2f%%\n", porBeneficio);
		System.out.printf("Beneficios politicos = %.2f%%\n\n", porImpuestos);
		
		precioF = costeFab + costeFab*porBeneficio/cien + costeFab*porImpuestos/cien;
		System.out.printf("El precio final de venta del coche es de %.2f EUR\n", precioF);

	}

}
