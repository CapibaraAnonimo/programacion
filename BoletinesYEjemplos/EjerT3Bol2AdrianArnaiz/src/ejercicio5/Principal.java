package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Electrodomestico lista[] = new Electrodomestico[] {new Electrodomestico(), new Electrodomestico(), new Electrodomestico(), new Electrodomestico(), 
				new Electrodomestico(500, "morado", 'Z', 75)};
		Tienda tienda = new Tienda(lista);
		int seccion = 0;
		
		
		do {
			System.out.println("\n\n1. Imprimir lista de productos"
					+ "\n2. Precio final de un electrodoméstico"
					+ "\n3. Suma de precios"
					+ "\n4. Media de precios");
			
			do {
				System.out.println("\nSeleccione una seccion");
				seccion = Leer.datoInt();
				if(seccion < 0 || seccion > 4)
					System.out.println("Seccion incorrecta, seleccione otra");
			}while(seccion < 0 || seccion > 4);
				
			switch(seccion)
			{
			case 0:
				break;
			case 1:
				tienda.mostrarLista();
				break;
			case 2:
				System.out.println("Diga el producto del que desea saber el precio final");
				System.out.println(tienda.precioElectrodomestico(Leer.datoInt()));
				break;
			case 3:
				System.out.println(tienda.sumaPrecios());
				break;
			case 4:
				System.out.println(tienda.mediaPrecios());
				break;
			}
		}while(seccion != 0);

	}

}
