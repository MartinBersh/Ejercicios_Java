package Ejer16;

public class Alcaldia {

    public String genero;
    public int edad;

    public void asignarGenero(String next){
        this.genero = next;
    }
    public void asignarEdad(int next){
        this.edad = next;
    }

    public String todo(){
        if (genero.equals("mujer") && edad > 50){
            return "Recibirá 120000";
        } else if (genero.equals("mujer") && edad>30 && edad<50) {
            return "Recibirá 100000";
        } else if (genero.equals("hombre")) {
            return "Recibirá 40000";
        }else {
            return null;
        }
    }

}
