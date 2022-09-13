package stomas.andres.agenda;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(){}
    public Fecha(int dia, int mes, int año){
        this.setDia(dia);
        this.setMes(mes);
        this.setAño(año);
    }

    public void setDia(int dia){
        this.dia = (dia>0 && dia<32) ? dia : 1;
    }

    public void setMes(int mes){
        this.mes = (mes>0 && mes<13) ? mes : 1;
    }

    public int getDia(){ return dia; }

    public int  getMes(){ return mes; }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String toString(){
        return String.format("%02d", dia) + "/" + String.format("%02d", mes) + "/" + String.format("%02d", año);
    }
}
