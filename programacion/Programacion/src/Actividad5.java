import java.util.Scanner;

public class Actividad5 {
    public static void actividad5 () throws Exception {
        final Scanner scaner = new Scanner(System.in);
        
        int radio = LlegeixConsola.llegeixNumero(scaner, "Escribe el radio de una de una circunferencia:");
        System.out.println("La longitud y area es: " + (radio/3.14));
}
}
