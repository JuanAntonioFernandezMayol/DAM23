import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Actividad45 {
    public static void actividad45() {
        List<String> listaDias = new ArrayList<>(
                Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));
        System.out.println(listaDias);
        listaDias.set(3, "juernes");
        System.out.println(listaDias);
        List<String> listaDos = List.copyOf(listaDias);
        System.out.println(listaDos);
        System.out.println(listaDias.get(3));
        System.out.println(listaDias.get(4));
        System.out.println(listaDias.iterator().next());
        System.out.println((listaDias.get(listaDias.size() - 1)));
        String elemento = listaDias.remove(4);
        System.out.println("Se a eliminado el: " + elemento);
        for (int i = 0; i < listaDias.size(); i++) {
            System.out.println(listaDias.get(i));
        }
        // dias.forEach(dia -> System.out.println(listaDias)); es lo mismo que el for de
        // arriba
        System.out.println(listaDias.contains("Lunes"));
        boolean encontrado = false;
        for (String dias : listaDias) {
            if (!encontrado) {
                encontrado = dias.toUpperCase().equals("lunes".toUpperCase());
            }
        }
        Collections.reverse(listaDias);
        System.out.println(listaDias);
        listaDias.sort(null);
        System.out.println(listaDias);
        listaDias.clear();
        System.out.println(listaDias);

    }
}
