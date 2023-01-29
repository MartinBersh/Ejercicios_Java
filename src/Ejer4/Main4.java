package Ejer4;

public class Main4 {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        semaforo.colorBolmbilla = "VERDE";
        semaforo.estadoBombilla = "ok";

        System.out.println(semaforo.mostrarMensajeAlConductor());

    }
}
