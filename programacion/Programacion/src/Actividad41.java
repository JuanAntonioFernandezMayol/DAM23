import java.util.Scanner;

public class Actividad41 {
    public static void actividad41() {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = {
                "Juan",
                "Pepe",
                "Antonio",
                "Paco"
        };
        System.out.println("Escribe un nombre");
        String nombre = scanner.nextLine();
        boolean encontrado = false;
        for (String n : nombres) {
            if (n.equals(nombre)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Has encontrado el nombre " + nombre);
        } else {
            System.out.println("No esta este nombre");
        }
        scanner.close();
    }
}
