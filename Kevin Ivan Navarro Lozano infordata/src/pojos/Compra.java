package pojos;

import java.util.Date;

public class Compra {
    private Provedor provedor;
    private Producto producto;
    private Date fecha;
    private int cantidad;
    public Compra(Provedor provedor, Producto producto, Date fecha, int cantidad) {
        this.setProvedor(provedor);
        this.setProducto(producto);
        this.setFecha(fecha);
        this.setCantidad(cantidad);

    }
    public Provedor getProvedor() {
        return provedor;

    }
    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;

    }
    public Producto getProducto() {
        return producto;

    }
    public void setProducto(Producto producto) {
        this.producto = producto;

    }
    public Date getFecha() {
        return fecha;

    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;

    }
    public int getCantidad() {
        return cantidad;

    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;

    }

}
