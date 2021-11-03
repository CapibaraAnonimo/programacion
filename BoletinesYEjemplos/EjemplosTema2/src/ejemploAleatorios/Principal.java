package ejemploAleatorios;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		Random num = new Random(System.nanoTime());
		int aleatorio = 0;
		int desde = 1, hasta = 200;
		
		System.out.println("Introduce el numero mínimo que quieres que salga");
		desde = Leer.datoInt();
		System.out.println("Introduce el número máximo que quieres que salga");
		hasta = Leer.datoInt();
		
		aleatorio = num.nextInt(hasta-desde+1)+desde;
		System.out.println(aleatorio);

	}

}
