package Ejer17;

public class Gym {

    public int tiempo;

    public void asignarTiempo(int next){
        this.tiempo = next;
    }

    public String mensaje(){
        switch (tiempo){
            case 15:
                return "El costo de 15 días es de 18000";
            case 30:
                return "El costo de 30 días es de 35000";
            case 3:
                return "el costo de 3 meses es de 86000";
            default:
                return "el tiempo digitado no es valido";
        }
    }

}
