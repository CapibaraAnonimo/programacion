package ejercicio13;

public class Principal {

	public static void main(String[] args) 
	{
		String nombre = new String("Juan el Nieves"), bebidaMarron = new String("Coca Cola");
		String semillaGirasol = new String("Pipas"), espadaBastarda = new String("Garra");
		double precioCola = 0.75;
		int cantidadCola = 2;
		double precioPipa = 0.40;
		int cantidadPipa = 1;
		double precioGarra = 150;
		double porcentajeGarra = 20;
		double descuentoGarra = 0;
		int cantidadGarra = 1;
		double precioFinal;
		short cien = 100;
		
		descuentoGarra = precioGarra/cien*porcentajeGarra*cantidadGarra;
		precioFinal = precioCola*cantidadCola + precioPipa*cantidadPipa + precioGarra*cantidadGarra - descuentoGarra;
		
		System.out.println("┌───────────────────────────────────────┐");
		System.out.println("│\t\tLa Tienda\t\t│");
		System.out.println("│\t\t\t\t\t│");
		System.out.println("│\t\t\t\t\t│");
		System.out.printf("│Empleado: %s\t\t│\n", nombre);
		System.out.println("│\t\t\t\t\t│");
		System.out.println("│\t\t\t\t\t│");
		System.out.println("│Lista de productos:\t\t\t│");
		System.out.println("│\t\t\t\t\t│");
		System.out.println("│Productos \tPrecios \tCantidad│");
		System.out.println("│---------------------------------------│");
		System.out.printf("│%s \t%.2f \tx \t%d\t│\n", bebidaMarron, precioCola, cantidadCola);
		System.out.printf("│%s \t\t%.2f \tx \t%d\t│\n", semillaGirasol, precioPipa, cantidadPipa);
		System.out.printf("│%s \t\t%.2f \tx \t%d\t│\n", espadaBastarda, precioGarra, cantidadGarra);
		System.out.println("│---------------------------------------│");
		System.out.printf("│Descuentos: \t\t\t\t│\n");
		System.out.printf("│%s\t\t\t-%.2f \t\t│\n", espadaBastarda, descuentoGarra);
		System.out.println("│---------------------------------------│");
		System.out.printf("│Total: \t\t%.2f EUR\t│\n", precioFinal);
		System.out.println("├───────────────────────────────────────┤");
		System.out.println("│\t\t\t\t\t│");
		System.out.println("│\t║║║║║║║║║║║║║║║║║║║║║║║║║  \t│");
		System.out.println("│\t\t\t\t\t│");
		System.out.println("└───────────────────────────────────────┘");
		
		
	}

}
