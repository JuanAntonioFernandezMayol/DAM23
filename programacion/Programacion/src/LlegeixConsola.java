    import java.util.Scanner;

/**
 * Source: https://www.baeldung.com/java-console-input-output 
 */
public class LlegeixConsola {
    /**
     * Metode per llegir una linia per consola
     * @param scaner
     * @param missatge
     * @return 
     */

    public static String llegeixLinia(Scanner scaner, String missatge){
        System.out.print(missatge);
        String linia = scaner.nextLine();
        return linia;
    }
    
    /**
     * Metode per llegir un numero per consola
     * @param scaner
     * @param missatge
     * @return 
     */

    public static int llegeixNumero(Scanner scaner, String missatge){
        System.out.print(missatge);
        int numero = scaner.nextInt();
        return numero;
    }
    
}

