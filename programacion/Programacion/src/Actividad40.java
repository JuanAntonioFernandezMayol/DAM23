import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actividad40 {
    public static void actividad40() {
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Mar");
        listaNombres.add("Marta");
        listaNombres.add("Maria");
        listaNombres.add("Pepe");
        // final String[] nombres = { "Mar", "Marta", "Maria", "Pepe" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre a buscar ");
        final String nombre = sc.nextLine();
        boolean encontrado = listaNombres.contains(nombre);
        if (encontrado) {
            System.out.println("Has encontrado el nombre " + nombre);
        } else {
            System.out.println("No esta este nombre");
        }
        sc.close();
    }
}
