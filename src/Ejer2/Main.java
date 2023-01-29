package Ejer2;

public class Main {

    public static void main(String[] args) {

        CitaMedica citaMedica = new CitaMedica();

        citaMedica.nombrePaciente = "Jaime";
        citaMedica.codCita = 1254634;
        citaMedica.nombreMedico = "Mario";
        citaMedica.consultorio = "302A";
        citaMedica.hora = 9;
        citaMedica.fecha = "2023/01/21";
        citaMedica.setCentroMedico("Sonrrisalud");

        System.out.println("Su cita ha sido asignada: " + citaMedica.crearCita());

        System.out.println("Los datos de la cita son: " + citaMedica.consultarDatosCita());

        citaMedica.cambiarCita();

        System.out.println("Hora de cita actualizada: " + citaMedica.consultarDatosCita());


    }
}
