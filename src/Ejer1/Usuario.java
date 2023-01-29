package Ejer1;

public class Usuario {

    public String usiarioBase;
    public String usuarioIngreado;
    public String claveBase;
    public String claveIngresada;
    public String estadoSistema;

    public String validarEstado(String claveIngresada) {

        return this.claveIngresada = claveIngresada;
    }


    public String permitirAcceso() {

        if (claveIngresada.equals("clave")) {
            return "Puede ingresar";
        } else {
            return "No puede ingresar";
        }
    }
}