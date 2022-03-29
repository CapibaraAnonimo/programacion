package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		int min = 30, max = 120;
		String nombre = "Nombre";
		Luchador luchador1;
		List luchadores = new ArrayList();
		Random ran = new Random(System.nanoTime());
		
		Supplier<Double> crearRandom = () -> min + (max - min) * ran.nextDouble();
		Supplier<Luchador> generadorLuchadores = () -> new Luchador(nombre, crearRandom.get(), crearRandom.get(), crearRandom.get(), crearRandom.get(), crearRandom.get());

	}

}
