package Ejer19;

public class Fotocopia {

    public int cantidadCopias;
    public int precio;
    public int precioFinal;

    public void asignarCantidad(int next){
        this.cantidadCopias = next;
    }

    public void calculo(){
        if(cantidadCopias <= 499){
            precio = 120;
        } else if ((cantidadCopias >= 500) && (cantidadCopias <= 749)) {
            precio = 100;
        } else if ((cantidadCopias >= 750)&&(cantidadCopias <= 999)){
            precio = 80;
        }else{
            precio = 50;
        }
    }

    public void precioTotal(){
        precioFinal = precio * cantidadCopias;
    }
    public String texto(){
        return "El precio por copia fue de: " + precio + " y el precio total por las impresiones es de: " + precioFinal;
    }
}
