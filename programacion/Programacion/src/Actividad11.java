import java.util.Scanner;

public class Actividad11 {
    public static void actividad11 () throws Exception {
        final Scanner scaner = new Scanner(System.in);

        int numero = LlegeixConsola.llegeixNumero(scaner, 
        "Introduce un numero :");
        
        if (numero % 2 == 0) {
            System.out.println( numero + "Si es par");
        } else {
            System.out.println("No es par");
        }
            
    }
}
