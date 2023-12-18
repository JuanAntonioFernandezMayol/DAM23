import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Actividad46 {
    public static void actividad46() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeroList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numeros");
            numeroList.add(scanner.nextInt());
        }
        System.out.println(numeroList);
        Integer max = Collections.max(numeroList);
        Integer min = Collections.min(numeroList);
        int posmax = numeroList.indexOf(max);
        int posmin = numeroList.indexOf(min);
        System.out.println("El numero max: " + max + "La posicion es: " + (posmax + 1));
        System.out.println("El numero min: " + min + "La posicion es " + (posmin + 1));
        scanner.close();
    }
}
