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
}
