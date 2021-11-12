package ejercicio05;

public class Principal {

	public static void main(String[] args) 
	{
		Sorteo sor = new Sorteo();
		
		System.out.println("Este programa genera número aleatorios para los distintos modos de juego");
		
		System.out.printf("Caracter aleatorio para la quiniela: %c\n", sor.quiniela());
		
		System.out.printf("Par o impar (1=impar 2=par): %d\n", sor.paresONones());
		
		System.out.printf("Número aleatorio para el juego de los chinos: %d\n", sor.chinos());
		
		System.out.printf("Número aleatorio para la primitiva: %d\n", sor.primitiva());

	}

}
