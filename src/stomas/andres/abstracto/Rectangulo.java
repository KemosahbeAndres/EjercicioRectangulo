package stomas.andres.abstracto;

public class Rectangulo extends Figura{
    public Rectangulo(int ancho, int alto) {
        super(ancho, alto);
    }

    public int area(){
        return ancho * alto;
    }
}
