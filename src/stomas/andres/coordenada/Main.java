package stomas.andres.coordenada;

public class Main {
	public static void main(String[] args){
		Punto A = new Punto("A");
		Punto B = new Punto("B");

		System.out.println(A);
		System.out.println(B);
		double distancia = A.distancia(B);
		System.out.println("Distancia entre A y B: "+ String.format("%.2f", distancia));
	
	}
}