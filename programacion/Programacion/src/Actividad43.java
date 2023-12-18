import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Actividad43 {
    public static void actividad43() {
        List<Integer> numeros = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            numeros.set(i, numeros.get(i) * 2);
            suma += numeros.get(i);
        }
        System.out.println(numeros);
        System.out.println(suma);
    }
}
