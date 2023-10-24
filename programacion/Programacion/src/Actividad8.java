import java.util.Scanner;

public class Actividad8 {

    public static void actividad5 () throws Exception {
        final Scanner scaner = new Scanner(System.in);
        
        int base = LlegeixConsola.llegeixNumero(scaner, "Escribe la base de un triangulo:");
        
        int altura = LlegeixConsola.llegeixNumero(scaner, "Escribe la altura de un triangulo:");
        System.out.println("La area es: " + (base*altura/2));
}
}

