package Ejer22;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Operador operador = new Operador();
        Scanner lector = new Scanner(System.in);

        System.out.println("¿Qué operador es el cliente?");
        operador.determinarOperador(lector.next());

        System.out.println("¿Cuantos minutos internacionales consumió?");
        operador.definirMinutos(lector.nextInt());

        operador.cargarValores();
        operador.calcularValorPaquete();

        System.out.println("El valor total de su plan con los minutos internacionales es de: " + operador.calcularValorTotal());

    }

}
