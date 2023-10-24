import java.util.Scanner;

public class Actividad12 {
    public static void actividad12 () throws Exception {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Introduce un caracter");

        char letra = scaner.nextLine().charAt(0);
        if(Character.isUpperCase(letra)){
            System.out.println("Es mayuscula");
        } else {
            System.out.println("Es minuscula");
        }
        scaner.close();
        //Hay que cerrar el scaner y importante alfinal porque sino habria que volverlo a abrir.
}
}
