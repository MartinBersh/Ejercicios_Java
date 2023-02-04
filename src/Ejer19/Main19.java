package Ejer19;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Fotocopia fotocopia = new Fotocopia();
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de copias que desea imprimir");
        fotocopia.asignarCantidad(lector.nextInt());

        fotocopia.calculo();
        fotocopia.precioTotal();

        System.out.println(fotocopia.texto());


    }
}
