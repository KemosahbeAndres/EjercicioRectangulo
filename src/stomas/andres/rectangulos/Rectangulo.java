public class Rectangulo
{
	private double longitud;
	private double ancho;
	public Rectangulo()
	{
		this(0, 0);
	}

	public Rectangulo(double l, double a)
	{
		this.setDimension(l, a);
	}
	public void setDimension(double l, double a)
	{
		this.longitud = (l>=0) ? l : 0;
		this.ancho = (a>=0) ? a : 0;
	}

	public double getLongitud()
	{
		return longitud;
	}
	public double getAncho()
	{
		return ancho; 
	}
	public double area()
	{
		return longitud * ancho;
	}
	public double perimetro()
	{
		return (2*longitud) + (2*ancho);
	}
	public String toString()
	{
		return String.valueOf();
	}
}