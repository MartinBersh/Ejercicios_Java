package Ejer20;

public class Reparacion {
    public int numPitidos;
    public boolean girarDisco;

    public String validarReparacion(){
        if (numPitidos == 1 && girarDisco == true){
            return "Pongase en contacto con servicio tecnico";
        } else if (numPitidos == 1 && girarDisco == false) {
            return "Verificar contactos de la unidad";
        }else if(numPitidos == 0 && girarDisco == false){
            return "Traiga la computadora para repararla en la central.";
        }else {
            return "Compruebe las conexiones de altavoces ";
        }
    }

}
