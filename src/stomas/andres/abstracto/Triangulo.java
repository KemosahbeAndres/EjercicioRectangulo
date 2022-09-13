package stomas.andres.abstracto;

public class Triangulo extends Figura{
    public Triangulo(int ancho, int alto) {
        super(ancho, alto);
    }

    public int area() {
        return (ancho*alto)/2;
    }
}
