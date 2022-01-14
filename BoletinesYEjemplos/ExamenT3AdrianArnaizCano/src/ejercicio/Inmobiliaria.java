package ejercicio;

import java.util.Random;

public class Inmobiliaria {
	private int idInmo = 0;
	private Piso piso;
	private int precio[] = new int[6];
	
	
	public Inmobiliaria(int idInmo) {
		this.idInmo = idInmo;
	}
	
	public Inmobiliaria(int idInmo, Piso piso) {
		this.idInmo = idInmo;
		this.piso = piso;
	}
	
	
	
	public int getIdInmo() {
		return idInmo;
	}

	public void setIdInmo(int idInmo) {
		this.idInmo = idInmo;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	public int[] getPrecio() {
		return precio;
	}

	public void setPrecio(int[] precio) {
		this.precio = precio;
	}

	
	
	public void añadirPiso(String direccion, int metros2, boolean reformar, int precioVenta) {
		this.piso = new Piso(direccion, metros2, reformar, precioVenta);
	}
	
	public int[] rellenarPrecio() {
		int dif = 100;
		Random ran = new Random(System.nanoTime());
		for(int i = 0; i <precio.length; i++)
		{
			precio[i] = ran.nextInt((piso.getPrecioVenta()+dif)-(piso.getPrecioVenta()-dif)+1)+(piso.getPrecioVenta()-dif);
		}
		
		return precio;
	}
	
	public double PrecioMes(int mes, int porcentaje) {
		double precioFinal = precio[mes-1];
		precioFinal = precioFinal + (precioFinal/100*porcentaje);
		
		return precioFinal;
	}
	
	public double precioMetro(int mes) {
		double precioMetro = (1.0*precio[mes-1]/piso.getMetros2());
		
		return precioMetro;
	}
	
	public double precioLibras(int mes, double Libra) {
		double precioLibras = precio[mes-1]*Libra;
		
		return precioLibras;
	}
	
	
}
