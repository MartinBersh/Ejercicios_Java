package Ejer20;

public class Main20 {

    public static void main(String[] args) {
        Reparacion reparacion = new Reparacion();

        reparacion.girarDisco = false;
        reparacion.numPitidos = 0;

        System.out.println(reparacion.validarReparacion());


    }

}
