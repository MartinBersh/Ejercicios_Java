package Ejer11;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        PositivoONegativo positivoONegativo = new PositivoONegativo();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite un numero para saber si es positivo o negativo ");
        positivoONegativo.asignarNumero(lector.nextByte());

        System.out.println(positivoONegativo.resultado());





    }
}
