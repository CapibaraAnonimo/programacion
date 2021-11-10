package ejercicio01;

public class Circulo 
{
	private double radiom = 0;
	private double aream = 0;
	private double radiocm = 0;
	private double areacm = 0;
	
	public Circulo()
	{
		radiocm = 0;
		radiom = 0;
		areacm = 0;
		aream = 0;
	}
	
	public Circulo(double radiocm, double radiom)
	{
		areacm = Math.PI*Math.pow(radiocm, 2);
		aream = Math.PI*Math.pow(radiom, 2);
	}
	
	public void setRadiocm(double radiocm)
	{
		this.radiocm = radiocm;
		areacm = getAreacm(radiocm);
	}
	
	public void setRadiom(double radiom)
	{
		this.radiom = radiom;
		areacm = getAream(radiom);
	}
	
	public double getAreacm(double radiocm)
	{
		areacm = Math.PI*Math.pow(radiocm, 2);
		return this.areacm;
	}
	
	public double getAreacm()
	{
		return getAreacm(radiocm);
	}
	
	public double getAream(double radiom)
	{
		aream = Math.PI*Math.pow(radiom, 2);
		return this.aream;
	}
	
	public double getAream()
	{
		return getAream(radiom);
	}

}
