package Ejer23;

public class SandwichOrder {

    public String tamaño;
    public String proteina;
    public String queso;
    public String jalapeño;
    public int precio;

    public void asignarTamaño(String next){
        this.tamaño = next;
    }
    public void asignarProtenia(String next){
        this.proteina = next;
    }
    public void asignarQueso(String next){
        this.queso= next;
    }
    public void asignarJalapeño(String next){
        this.jalapeño = next;
    }

    public void armado(){
        if (tamaño.equals("pequeño")) {
            precio += 6000;
        } else {
            precio += 12000;
        }
        if (proteina.equals("pavo")){
            precio += 3000;
        } else if (proteina.equals("tocineta")) {
            precio += 3000;
        }
        if(queso.equals("si")){
            precio += 2500;
        }
    }

    public String mensaje(){
        return "El precio final de su sanduche es de: " + precio;
    }

}
