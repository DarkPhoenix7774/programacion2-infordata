package pojos;

public class Reseteable extends  Impresora{
    private int velocidad;
    private Void reset;

    public Reseteable(String codigo , String modelo , int velocidad , Void reset){
        super( codigo, modelo,velocidad , reset);
        this.setVelocidad(velocidad);
    }
    public int getVelocidad() {
        return velocidad;

    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {

        return "Reseteable{" +

                "velocidad=" + velocidad +

                '}';
    }
    public Void getReset() {
        return reset;
    }
    public void setReset(Void reset) {
        this.reset = reset;
    }
}
