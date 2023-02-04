package Ejer13;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        ParOInpar parOInpar = new ParOInpar();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber si es par o inpar ");
        parOInpar.asignarNumero(lector.nextInt());

        System.out.println(parOInpar.calculo());
    }
}
