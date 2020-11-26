package pojos;

public class Empresa {
    private String nombre;
    private String direccion;
    private int numerEmpleados;

    public Empresa(String nombre, String direccion, int numerEmpleados) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setNumerEmpleados(numerEmpleados);

    }
    public String getNombre() {
        return nombre;

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    public String getDireccion() {
        return direccion;

    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;

    }
    public int getNumerEmpleados() {
        return numerEmpleados;

    }
    public void setNumerEmpleados(int numerEmpleados) {
        this.numerEmpleados = numerEmpleados;

    }

    @Override
    public String toString() {

        return "Empresa: " +

                "\nnombre='" + nombre + '\'' +

                ", \ndireccion='" + direccion + '\'' +

                ", \nNumeroDeEmpleados=" + numerEmpleados +

                '.';
    }
}
