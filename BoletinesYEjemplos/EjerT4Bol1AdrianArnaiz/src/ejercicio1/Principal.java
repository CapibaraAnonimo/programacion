package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Ordenador o = new Ordenador(1020, 10000000, 2000);
		Tablet t = new Tablet(350, 10000000, 800, 270);
		Portatil p = new Portatil(1020, 1000000000, 1570, 23);
		
		System.out.println(o);
		System.out.println(t);
		System.out.println(p);

	}

}
