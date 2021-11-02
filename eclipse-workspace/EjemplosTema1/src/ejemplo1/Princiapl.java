package ejemplo1;

public class Princiapl 
{

	public static void main(String[] args)
	{
		char car = 'C';
		boolean sino = true;
		byte chiquito = 1;
		short corto = 2;
		int edad = 130;
		long largo = 300000;
		float flotante = 15.8901234f;
		double doble = 19.9;
		String cadena = new String("Hello world!");
		
		short cuenta = 9;
		
		
		System.out.println("Hola, bienvenido a mi primer ejemplo");
		
		System.out.println("Mi edad es " + edad);
		
		System.out.println("El valor de dato caracter: " + car);
		System.out.println("El valor de dato bolean: " + sino);
		System.out.println("El valor de dato byte: " + chiquito);
		System.out.println("El valor de dato short: " + corto);
		System.out.println("El valor de dato int: " + edad);
		System.out.println("El valor de dato long: " + largo);
		System.out.println("El valor de dato float: " + flotante);
		System.out.println("El valor de dato doble: " + doble);
		System.out.println("El valor de dato String: " + cadena);

		while(cuenta >= 0)
		{
			System.out.print(cuenta);
			cuenta --;
		}
	}

}
