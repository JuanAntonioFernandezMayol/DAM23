import java.util.Scanner;

public class Actividad25 {
    public static void actividad25 () throws Exception {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Introduce tu nota");

        int nota = scaner.nextInt();

        if (nota <= 4) {
            System.out.println("Has suspendido");
    }   else if (nota == 5) {
        System.out.println("Has sacado un suficiente");
    }   else if (nota == 6) {
        System.out.println("Has sacado un bien");
    }   else if (nota == 7) {
        System.out.println("Has sacado un notable bajo");
    }   else if (nota == 8) {
        System.out.println("Has sacado un notable");
    }   else if (nota == 9) {
        System.out.println("Has sacado un excelente");
    }   else if (nota == 10) {
        System.out.println("Has sacado una matricula de honor");
    }   else {
        System.out.println("La nota introducida no es valida");
    }

    scaner.close();
}
}