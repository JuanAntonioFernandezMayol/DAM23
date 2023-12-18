import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Actividad44 {
    public static void actividad44() {
        List<Integer> numeros = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        int suma = 0;
        // Integer n = 0;
        // for (int i = 0; i < numeros.size(); i++) {
        // n = numeros.get(i);
        // if (n % 2 == 0) {
        // suma += n * 2;
        // } else {
        // suma = suma + n;
        // }
        // }
        // Con este forEach estamos haciendo que se sumen y se multipliquen por 2
        // numeros.forEach(n -> suma += n * 2);
        // Con este stream estamos añadiendo el filtro para hacer directamente los pares
        // numeros.stream().filter(n -> n % 2 == 0).forEach(n -> suma += n * 2);
        System.out.println(suma);
    }
}
