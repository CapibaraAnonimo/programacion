package ejemploContadores;

public class Principal {

	public static void main(String[] args) 
	{
		double saldo = 100;
		double reintegro = 50;
		
		System.out.printf("Tienes %.2f unidades monetarias europeas y quieres sacar"
				+ " %.2f unidades monetarias europeas.\n", saldo, reintegro);
		saldo -= reintegro;
		System.out.printf("Su saldo ahora es %.2f unidades monetarias europeas.\n\n", saldo);
		
		reintegro = 20;
		
		System.out.printf("Tienes %.2f unidades monetarias europeas y quieres sacar"
				+ " %.2f unidades monetarias europeas.\n", saldo, reintegro);
		saldo -= reintegro;
		System.out.printf("Su saldo ahora es %.2f unidades monetarias europeas.\n", saldo);
		
		
	}

}
