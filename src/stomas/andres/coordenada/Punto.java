package stomas.andres.coordenada;

import java.util.Random;

public class Punto {
	
	private static final Random random = new Random();
	private static final int max = 10;

	private double x;
	private double y;
	private String nombre;

	public Punto(){
		this(random.nextDouble()*max, random.nextDouble()*max);
	}
	public Punto(double x, double y){
		this("Punto", x, y);
	}
	public Punto(String nombre){
		this(nombre, random.nextDouble()*max, random.nextDouble()*max);
	}
	public Punto(String nombre, double x, double y){
		this.setNombre(nombre);
		this.setX(random.nextBoolean() ? -x : x);
		this.setY(random.nextBoolean() ? -y : y);
	}

	public void setNombre(String nombre){
		if(nombre.trim().length() > 0){
			this.nombre = nombre.trim();
		}
	}

	public String getNombre(){
		return nombre;
	}

	public void setX(double x){
		this.x = x;
	}

	public void setY(double y){
		this.y = y;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public double distancia(Punto punto){
		double A = Math.pow(punto.getX()-this.x, 2);
		double B = Math.pow(punto.getY()-this.y, 2);
		return Math.sqrt(A+B);
	}

	public String toString(){
		return nombre + "(X: "+ String.format("%.2f",x) + ", Y: " + String.format("%.2f", y) + ")";
	}
}