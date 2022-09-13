package stomas.andres.agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    
    public Agenda(){
        this.contactos = new ArrayList<Contacto>();
    }

    public void agregar(Contacto ct){
        this.contactos.add(ct);
    }

    public boolean quitar(String nombre){
        if(this.buscar(nombre) instanceof Contacto){

        }
        return false;
    }
    public boolean quitar(Contacto ct){
        if(this.contactos.size() > 0){
            this.contactos.remove(ct);
            return true;
        }
        return false;
    }

    public Contacto buscar(String nombre){
        for(Contacto ct: this.contactos){
            if(ct.getNombre() == nombre.trim()){
                return ct;
            }
        }
        return null;
    }
}
