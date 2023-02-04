package Ejer23;

import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        SandwichOrder sandwichOrder = new SandwichOrder();
        Scanner lector = new Scanner(System.in);

        System.out.println("De que tamaño desea su sanduche?");
        sandwichOrder.asignarTamaño(lector.next());
        System.out.println("Qué proteina desea en su orden? Pavo o Tocineta");
        sandwichOrder.asignarProtenia(lector.next());
        System.out.println("Desea queso?");
        sandwichOrder.asignarQueso(lector.next());
        System.out.println("Desea jalapeños? ");
        sandwichOrder.asignarJalapeño(lector.next());

        sandwichOrder.armado();

        System.out.println(sandwichOrder.mensaje());


    }

}
