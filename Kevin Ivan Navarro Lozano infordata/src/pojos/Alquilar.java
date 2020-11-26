package pojos;

public class Alquilar extends Producto{
    protected double precioHora;
    public Alquilar(String codigo , String modelo , double precioHora){
        super(codigo , modelo);
        this.setPrecioHora(precioHora);

    }
    public double getPrecioHora() {
        return precioHora;

    }
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;

    }
    @Override
    public String toString() {
        return "Alquilar : " +

                "\nprecioHora=" + precioHora +

                " , \ncodigo='" + getCodigo() + '\'' +

                ", \nModelo='" + getModelo() + '\'' +

                '.';
    }
}
