package Ejer17;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Gym gym = new Gym();
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba el tiempo por el que desea su mensualidad ");
        gym.asignarTiempo(lector.nextInt());

        System.out.println(gym.mensaje());
    }
}
