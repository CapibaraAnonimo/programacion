package ejercicio03;

public class Principal {

	public static void main(String[] args) 
	{
		String nombre = new String("Adrián Arnaiz Cano"), fecha = new String("05/10/2021");
		String papitasMNombre = new String("Patatas medianas");
		double papitasMPrecio = 3.5;
		short papitasMCantidad = 1;
		String bebidaMNombre = new String("Bebida mediana");
		double bebidaMPrecio = 1;
		short bebidaMCantidad = 1;
		String burguerMalaNombre = new String("Hamburguesa Mc Royal");
		double burguerMalaPrecio = 4.5;
		short burguerMalaCantidad = 1;
		double precioTotal = 0;
		double dineroEntregado = 50;
		double vuelta = 0;
		
		precioTotal = papitasMPrecio*papitasMCantidad + bebidaMPrecio*bebidaMCantidad + burguerMalaPrecio*burguerMalaCantidad;
		vuelta = dineroEntregado - precioTotal;
		
		System.out.println("┌───────────────────────────────────────────────┐");
		System.out.println("│\t\tHamburgueseria Paqui \t\t│");
		System.out.println("│\t\t\t\t\t\t│");
		System.out.println("│\t\t\t\t\t\t│");
		System.out.printf("│Le ha atendido: %s \t\t│\n", nombre);
		System.out.printf("│Fecha: %s \t\t\t\t│\n", fecha);
		System.out.println("│\t\t\t\t\t\t│");
		System.out.println("│\t\t\t\t\t\t│");
		System.out.println("│Productos \t\tPrecio \t\tSuma \t│");
		System.out.println("│-----------------------------------------------│");
		System.out.printf("│%s \t%.2f x %d \t%.2f \t│\n", papitasMNombre, papitasMPrecio, papitasMCantidad, (papitasMPrecio*papitasMCantidad));
		System.out.printf("│%s \t%.2f x %d \t%.2f \t│\n", bebidaMNombre, bebidaMPrecio, bebidaMCantidad, (bebidaMPrecio*bebidaMCantidad));
		System.out.printf("│%s \t%.2f x %d \t%.2f \t│\n", burguerMalaNombre, burguerMalaPrecio, burguerMalaCantidad, (burguerMalaPrecio*burguerMalaCantidad));
		System.out.println("│-----------------------------------------------│");
		System.out.println("│Descuentos: \t\t\t\t\t│");
		System.out.println("│-----------------------------------------------│");
		System.out.printf("│Total: \t\t%.2f \t\t\t│\n", precioTotal);
		System.out.printf("│Pago: \t\t\t%.2f \t\t\t│\n", dineroEntregado);
		System.out.printf("│Vuelta: \t\t%.2f \t\t\t│\n", vuelta);
		System.out.println("│\t\t\t\t\t\t│");
		System.out.println("└───────────────────────────────────────────────┘");
		

	}

}
