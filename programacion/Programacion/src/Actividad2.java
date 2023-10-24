import java.util.Scanner;

public class Actividad2 {
    public static void actividad2 () throws Exception {
        final Scanner scaner = new Scanner(System.in);
        
        int x = LlegeixConsola.llegeixNumero(scaner, "Escribe el numero X:");
        int z = LlegeixConsola.llegeixNumero(scaner, "Escribe el numero Z:");
            System.out.println ("Has introducido los numeros " + x + " y " + z);
    }
}
