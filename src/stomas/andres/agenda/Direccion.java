package stomas.andres.agenda;

public class Direccion {
    private String calle;
    private String ciudad;
    private String estado;
    private String codigoPostal;

    public Direccion(){}

    public Direccion(String calle, String ciudad, String estado, String codigoPostal){
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }
}
