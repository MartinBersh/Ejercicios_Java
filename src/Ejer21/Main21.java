package Ejer21;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite el numero de serie de su carro");
        empresa.asignarNum(lector.nextInt());

        System.out.println(empresa.mensaje());

    }
}
