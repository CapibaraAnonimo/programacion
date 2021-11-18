package ejercicio07;

public class Cuenta 
{
	private double saldo = 0;
	private String nombre = new String();
	
	public Cuenta()
	{
	}
	
	public Cuenta(double saldo, String nombre)
	{
		this.saldo = saldo;
		this.nombre = nombre;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void ingresar(double saldo)
	{
		this.saldo = this.saldo+saldo;
	}
	
	public void retirar(double cantidad)
	{
		if(saldo>=cantidad)
		{
			saldo = saldo - cantidad;
		}else {
			System.out.println("No tiene suficiente dinero");
		}
	}
	
	public double cambioUSD(double cambio)
	{
		return saldo*cambio;
	}
	
	public void conSaldo()
	{
		System.out.printf("Su saldo es de %.2f EUR\n", saldo);
	}

}
