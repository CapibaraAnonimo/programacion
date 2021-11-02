package ejercicio6;

public class Principal {

	public static void main(String[] args) 
	{
		double precioIni = 100;
		double descuento = 43.8;
		double precioFin = 0;
		int cien = 100;
		
		precioFin = precioIni -(precioIni * (descuento/cien));
		
		System.out.printf("El precio inicial es de %.2f EUR y con el descuento del %.2f%% es "
				+ "de %.2f EUR.", precioIni, descuento, precioFin);

	}

}
