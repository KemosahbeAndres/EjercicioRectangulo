package stomas.andres.agenda;

import java.util.List;

public class Contacto {
    private String nombre;
    private List<Direccion> direcciones;
    private List<String> telefonos;
    private Fecha cumpleaños;
    
    private Contacto(){}
    public Contacto(String nombre){
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(Fecha cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
}
