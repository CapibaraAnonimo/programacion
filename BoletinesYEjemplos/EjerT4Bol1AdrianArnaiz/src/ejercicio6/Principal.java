package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		Cuenta c[] = new Cuenta[]{
				new CuentaCorriente(500, 10),
				new CuentaJoven(500, 10),
				new CuentaEmpresa(500, 10)
		};
		Oficina o = new Oficina(c, 5000.0);
		
		o.ingresarDinero(2, 25);
		o.sacarDinero(3, 20);
		System.out.println(o.devolverGanancias());
		System.out.println(o.devolverPerdidas());

	}

}
