package Ejer21;

public class Empresa {

    public int numCarro;

    public void asignarNum(int next){
        this.numCarro = next;
    }

    public String mensaje(){
        if (numCarro == 119 || numCarro == 179 || numCarro == 189 || numCarro == 195 || numCarro == 221 || numCarro == 780)
            return "el automóvil esta defectuoso, llevar a garantía";
        else {
            return "Su automóvil no está defectuoso";
        }
    }
}
