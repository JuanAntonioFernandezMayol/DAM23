import java.util.Scanner;

public class Ejercicios2 {
    public static void ejercicio2 () throws Exception {
    //Inicialitzam el scanner que llegeix la consola:
    final Scanner scaner = new Scanner(System.in);
    
    //Exemple del seu ús
    String nom = LlegeixConsola.llegeixLinia(scaner, "Nom: "); 
    String llinatges = LlegeixConsola.llegeixLinia(scaner, "Llinatges: "); 
    
    System.out.println(nom + " " + llinatges);
    }
}

