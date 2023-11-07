import java.util.Scanner;

public class Actividad30 {
    public static void actividad30 () throws Exception {
        Scanner scaner = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Introduce el precio de un plato y para acabar el programa introduce un 0");
        double precio = scaner.nextDouble();        
        while (precio != 0) {
            total += precio;
            System.out.println("Introduce el precio del plato");
            precio = scaner.nextDouble();
            
        }
        System.out.println("El precio total de los platos es: " + total);
        scaner.close();
    }
    }