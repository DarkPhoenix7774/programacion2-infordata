package pojos;

public class Cliente {

    private String Dni;
    private String telefono;
    private String domicilio;

    public Cliente(String dni, String telefono, String domicilio) {
        Dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;

    }
    public String getDni() {
        return Dni;

    }
    public void setDni(String dni) {
        Dni = dni;

    }
    public String getTelefono() {
        return telefono;

    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;

    }
    public String getDomicilio() {
        return domicilio;

    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;

    }
}
