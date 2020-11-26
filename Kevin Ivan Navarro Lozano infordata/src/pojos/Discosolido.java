package pojos;

import java.util.Date;

public class Discosolido extends Tecnologico{
    private int capacidad;
    private Void reseteable;

    public Discosolido(String codigo , String modelo, String paisOrigen , Date fechaFabricacion , Empresa fabricante , int capacidad){
        super(codigo, modelo, paisOrigen, fechaFabricacion, fabricante);
        this.capacidad = capacidad;


    }
    public int getCapacidad() {
        return capacidad;

    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Void getReseteable() {
        return reseteable;

    }
    public void setReseteable(Void reseteable) {
        this.reseteable = reseteable;

    }
}
