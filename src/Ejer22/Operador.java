package Ejer22;

public class Operador {

    public String operador;
    public int cargoFijo;
    public int valorPaquete;
    public int cantidadMinutos;
    public int valorMinuto;

    public int precioMinutos;
    public void definirMinutos(int next){

        this.cantidadMinutos = next;
    }
    public void determinarOperador(String next){

        this.operador = next;
    }

    public void cargarValores(){
        switch (operador){
            case "tigo":
                cargoFijo = 45000;
                valorPaquete = 12000;
                valorMinuto = 200;
            break;
            case "claro":
                cargoFijo = 30000;
                valorPaquete = 18000;
                valorMinuto = 100;
            break;
            case "movistar":
                cargoFijo = 40000;
                valorPaquete = 8000;
                valorMinuto = 250;
            break;
        }
    }


    public void calcularValorPaquete(){
        precioMinutos = valorMinuto * cantidadMinutos;
    }
    public int calcularValorTotal(){
        return cargoFijo + valorPaquete + precioMinutos;
    }

}
