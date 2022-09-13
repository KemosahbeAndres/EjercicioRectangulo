package stomas.andres.agenda;

public class Direccion {
    private String calle;
    private String ciudad;
    private String estado;
    private String codigoPostal;

    public Direccion(){}

    public Direccion(String calle, String ciudad, String estado, String codigoPostal){
        this.setCalle(calle);
        this.setCiudad(ciudad);
        this.setEstado(estado);
        this.setCodigoPostal(codigoPostal);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle.trim().length()>0 ? calle.trim() : "";
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.trim().length()>0 ? ciudad.trim() : "";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado.trim().length()>0 ? estado.trim() : "";
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal.trim().length()>0 ? codigoPostal.trim() : "";
    }

    public String toString(){
        return calle + ", " + ciudad + ", " + estado + ", "+ codigoPostal;
    }
}
