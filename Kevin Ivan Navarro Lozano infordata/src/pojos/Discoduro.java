package pojos;

public class Discoduro extends Alquilar {
    private int capacidad;
    private Void reseteable;

    public Discoduro (String codigo, String modelo , double precioHora , int capacidad , Void reseatble){
        super(codigo, modelo, precioHora );
        this.setCapacidad(capacidad);

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
