package Ejer11;

public class PositivoONegativo {


    public byte numero;

    public void asignarNumero(byte next){
        this.numero = next;
    }

    public String resultado(){
        if (numero < 0){
            return "El numero " + numero + " es negativo";
        }else {
            return "El numero " + numero + " es positivo";
        }
    }


}
