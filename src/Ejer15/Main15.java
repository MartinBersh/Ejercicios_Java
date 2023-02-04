package Ejer15;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        NumMayot numMayot = new NumMayot();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite 3 numeros");
        numMayot.asignarNum1(lector.nextInt());
        numMayot.asignarNum2(lector.nextInt());
        numMayot.asignarNum3(lector.nextInt());

        System.out.println(numMayot.comprobar());


    }
}
