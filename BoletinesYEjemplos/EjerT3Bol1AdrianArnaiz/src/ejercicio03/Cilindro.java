package ejercicio03;

public class Cilindro 
{
	private double radio = 0;
	private double altura = 0;
	private double volumen = 0;
	
	public Cilindro()
	{
	}
	
	public Cilindro(double radio, double altura) 
	{
		this.radio = radio;
		this.altura = altura;
	}
	
	public void setRadio(double radio)
	{
		this.radio = radio;
	}
	
	public double getRadio()
	{
		return radio;
	}
	
	public void setaltura(double altura)
	{
		this.altura = altura;
	}
	
	public double getAltura()
	{
		return altura;
	}
	
	public double volumen()
	{
		volumen = Math.pow(radio, 2)*Math.PI*altura;
		return volumen;
	}
	
	public double volumen(double radio, double altura)
	{
		this.radio = radio;
		this.altura = altura;
		volumen = volumen();
		
		return volumen;
	}

}
