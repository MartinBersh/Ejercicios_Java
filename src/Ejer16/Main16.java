package Ejer16;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Alcaldia alcaldia = new Alcaldia();
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba su genero: ");
        alcaldia.asignarGenero(lector.next());
        System.out.println("Escriba su edad ");
        alcaldia.asignarEdad(lector.nextInt());

        System.out.println(alcaldia.todo());


    }
}
