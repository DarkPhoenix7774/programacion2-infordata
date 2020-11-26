import pojos.*;

import java.util.Calendar;

public class Main {

    private static Object Reseteable;

    public static void main(String[] args) {

        System.out.println("*********INFORDATA*********");

        //definir el producto
        Producto producto = new Producto( "5454BH" , "TECLADO GAMER ASUS");
        System.out.println(producto);
        System.out.println("\n");

        //definir alquiler
        Alquilar alquilar = new Alquilar("F4H5569" , "MONITOR 32 PULG" , 20.5);
        System.out.println(alquilar);
        System.out.println("\n");

        //definir empresa

        Empresa empresa = new Empresa("GOOGLE" , "AV MIAMI" , 30000  );
        System.out.println(empresa);
        System.out.println("\n");

        //definir productotecnologico

        Tecnologico tecnologico =  new Tecnologico("JH554569" , "SSD AORUS" ,
                "BOLIVIA-CHINA EXPORTACION", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);
        System.out.println("\n");

        //instanciando objet monitor

        Monitor monitor = new Monitor("JSE19203242" , "Asus 32 pulgadas" , 20.4 , "2350x1956 4k FULL UHD ", null);
        System.out.println(monitor);
        System.out.println("\n");

        //cpu

        Empresa PCPLANET = new Empresa("LOGITEC" , "AV AMERICA" , 5000 );
        Cpu cpu = new Cpu("JSE324524" , "AORUS" , " BOLIVIA EXPORTACION-JAPON" , Calendar.getInstance().getTime() , PCPLANET , 32, null);
        System.out.println(cpu);
        System.out.println("\n");

        //Reset valor/void no retorna ningun valor

        System.out.println("=====RESET=====");
        Reseteable reseteable = new Reseteable("01010" , "TODOS LOS ANTERIORES" , 30 , null);
        System.out.println(Reseteable);



    }


}
