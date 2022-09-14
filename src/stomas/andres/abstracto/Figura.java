package stomas.andres.abstracto;

public abstract class Figura {
    protected int ancho;
    protected int alto;

    public void setDatos(int ancho, int alto){
        this.ancho = ancho>0 ? ancho : 0;
        this.alto = alto>0 ? alto : 0;
    }
    public abstract int area();

    public String toString(){
        return "Ancho: "+ ancho + ", Alto: "+ alto;
    }
}
