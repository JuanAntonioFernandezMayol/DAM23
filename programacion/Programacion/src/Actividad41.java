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
        // System.out.println("Escribe un nombre");
        // String nombre = scanner.nextLine();
        // boolean encontrado = false;
        // for (String n : nombres) {
        // if (n.equals(nombre)) {
        // encontrado = true;
        // }
        // }
        // if (encontrado) {
        // System.out.println("Has encontrado el nombre " + nombre);
        // } else {
        // System.out.println("No esta este nombre");
        // }
        System.out.println("Escriba una frase");
        // Recomiendo usar nextLine en lugar de next por los espacios
        String frase = scanner.nextLine();
        // Creamos un array de caracteres usando el metodo de String
        char caracteres[] = frase.toCharArray();
        // Recorremos la frase y cogemos cada caracter y lo metemos en el array
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(caracteres[i]);
        }
        scanner.close();
    }
}
