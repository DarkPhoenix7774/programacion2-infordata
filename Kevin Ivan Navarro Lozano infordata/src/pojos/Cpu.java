package pojos;

import java.util.Date;

public class Cpu extends Tecnologico {
    private int memoriaPrincipal;
    private Void reset;
    public Cpu(String codigo, String modelo , String paisOrigen , Date fechaFabricacion , Empresa fabricante , int memoriaPrincipal, Void reset){
        super(codigo, modelo , paisOrigen , fechaFabricacion , fabricante );
        this.setMemoriaPrincipal(memoriaPrincipal);


    }
    public int getMemoriaPrincipal() {
        return memoriaPrincipal;

    }
    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;

    }
    public Void getReset() {
        return reset;
    }
    public void setReset(Void reset) {
        this.reset = reset;
    }

    @Override
    public String toString() {
        return "Cpu: " +
                "\nmemoriaPrincipal=" + memoriaPrincipal +

                ", \npaisOrigen='" + paisOrigen + '\'' +

                ", \nfechaFabricacion=" + fechaFabricacion +

                ", \nfabricante=" + fabricante +

                ",= \ncodigo '" + getCodigo() + '\'' +

                ",= \nmodelo '" + getModelo() + '\'' +

                ", \nreset=" + reset +

                '}';
    }
}
