package ejercicio2;

public class Principal {
	
	public static void main(String[] args) 
	{
		String nombre = new String("El juego del calamar en Java");
		int campistas = 2;
		int dias = 10;
		String caravana = new String("Caravana");
		double precioDCaravana = 12.0;
		String electricidad = new String("Electricidad");
		double precioDElec = 3.0;
		String coche = new String("Coche");
		double precioDCoche = 5.5;
		String persona = new String("Persona");
		double precioDPersona = 4.5;
		String bar = new String("Bar");
		double gastosBar = 180.5;
		double descuento = 6.0;
		short cien = 100;
		double totalNDesc = 0.0;
		String nombreDesc = new String("Campisa Informático Paradise");
		double dineroDesc = 0.0;
		double totalSDesc = 0.0;
		double dineroBanc = 600.0;
		
		totalNDesc = precioDCaravana*dias + precioDElec*dias + precioDCoche*dias + precioDPersona*dias*campistas + gastosBar;
		dineroDesc = totalNDesc/cien*descuento;
		totalSDesc = totalNDesc - (totalNDesc/cien*descuento);
		
		System.out.printf("\t%s\n\n\n", nombre);
		System.out.println("Concepto \tPrecio \t\tSubT");
		System.out.println("----------------------------------------");
		System.out.printf("%s: \t%.2f x %d \t%.2f\n", caravana, precioDCaravana, dias, (precioDCaravana*dias));
		System.out.printf("%s: \t%.2f x %d \t%.2f\n", electricidad, precioDElec, dias, (precioDElec*dias));
		System.out.printf("%s: \t\t%.2f x %d \t%.2f\n", coche, precioDCoche, dias, (precioDCoche*dias));
		System.out.printf("%s: \t%.2f x %d x %d \t%.2f\n", persona, precioDPersona, dias, campistas, (precioDPersona*dias*campistas));
		System.out.printf("%s \t\t%.2f \t\t%.2f\n", bar, gastosBar, gastosBar);
		System.out.println("----------------------------------------");
		System.out.printf("SubTotal: \t%.2f EUR\n", totalNDesc);
		System.out.println("----------------------------------------");
		System.out.println("Descuentos:");
		System.out.printf("%s: -%.2f EUR\n", nombreDesc, dineroDesc);
		System.out.println("----------------------------------------");
		System.out.printf("Total: \t\t%.2f EUR\n\n", totalSDesc);
		System.out.println("\t\t-----------------");
		System.out.println("\t\t|¡Vuelva Pronto!|");
		System.out.println("\t\t-----------------");
		
		System.out.printf("\n\n\nAntes de la última transacción tenía: %.2f EUR\n", dineroBanc);
		dineroBanc = dineroBanc - totalSDesc;
		System.out.printf("Despues de la última transacción tiene: %.2f EUR\n", dineroBanc);
		
	}

}
