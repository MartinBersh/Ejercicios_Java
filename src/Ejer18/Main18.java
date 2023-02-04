package Ejer18;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Traingulo traingulo = new Traingulo();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite 3 numeros");
        traingulo.asignarNum1(lector.nextInt());
        traingulo.asignarNum2(lector.nextInt());
        traingulo.asignarNum3(lector.nextInt());

        traingulo.sumar();

        System.out.println(traingulo.resultado());
    }
}
