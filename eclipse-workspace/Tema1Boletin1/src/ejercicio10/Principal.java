package ejercicio10;

public class Principal {

	public static void main(String[] args) 
	{
		double precio = 25;
		int unidades = 3;
		int unidadesMin = 4;
		double descuento = 25;
		double precioFin = 0;
		int cien = 100;
		
/*		if(unidades >= unidadesMin)   //Si hay 4 o más productos se entra en el if y se calcula
		{							  //el descuento de los productos que corresponda
			precioFin = ((unidades/unidadesMin)*unidadesMin*precio)-(((unidades/unidadesMin)*unidadesMin*precio)*(descuento/cien)) + ((unidades%unidadesMin)*precio);
		}
		else						  //Si no hay productos suficientes no se le aplica el descuento
		{
			precioFin = unidades * precio;
		}*/
		
		precioFin = ((unidades/unidadesMin)*unidadesMin*precio)-(((unidades/unidadesMin)*unidadesMin*precio)*(descuento/cien)) + ((unidades%unidadesMin)*precio);
		
		System.out.printf("El precio de todos los productos es de %.2f EUR\n", precioFin);
		

	}

}
