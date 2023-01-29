package Ejer2;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class CitaMedica {

    public int codCita;
    public String fecha;
    public int hora;
    public String consultorio;
    public String nombreMedico;
    public String nombrePaciente;
    private String centroMedico;


    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }

    public String crearCita() {

        return " Paciente " + nombrePaciente + " con el numero: " + codCita + " Será atendido por el medico " + nombreMedico + " en el consultorio " + consultorio + " el dia " + fecha + " a las " + hora;
    }

    public String consultarDatosCita(){
        return " Nombre: " + nombrePaciente + " Codigo: " + codCita + " Medico: " + nombreMedico + " En el consultorio: " + consultorio + " Día: " + fecha + " Hora: "+ hora + " Centro medico: " + centroMedico;
    }

    public int cambiarCita(){
        return hora = 12;
    }
}
