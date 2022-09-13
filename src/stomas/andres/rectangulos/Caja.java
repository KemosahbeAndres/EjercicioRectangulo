package stomas.andres.rectangulos;

public class Caja extends Rectangulo
{
	private double altura;
	public Caja()
	{
		this(0, 0, 0);
	}
	public Caja(double l, double a, double h)
	{
		super(l, a);
		setDimension(super.getLongitud(), super.getLongitud(), h);
	}

	public void setDimension(double l, double a, double h)
	{
		super.setDimension(l, a);
		this.altura = (h>=0) ? h : 0;
	}
	public double getAltura()
	{
		return altura;
	}
	public double area()
	{
		return 2*( super.getAncho()*super.getLongitud() + super.getAncho()*altura + super.getLongitud()*altura);
	}
	public double volumen()
	{
		return super.area() * this.altura;
	}
	public String toString()
	{
		return super.toString() + " | Altura: "+ altura;
	}
}