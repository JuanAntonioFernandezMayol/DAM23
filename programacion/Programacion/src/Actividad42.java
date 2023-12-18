import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Actividad42 {
    public static void main(String[] args) {
        List<String> semana = new ArrayList<>(
                Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));
        // System.out.println("Dia: " + semana.get(0));

        // SET para cambiar el valor del elemento.
        // semana.set(0, "Lunes1");

        // for (int i = 0; i < semana.size(); i++) {
        // System.out.println(semana.get(i));
        // }

        // Un for mas simple que le asigna a dia cada slot de la semana
        // for (String dia : semana) {
        // System.out.println(dia);
        // }

        // por cada elemento de semana se le imprime dia
        //semana.forEach(dia -> System.out.println(dia));
        
        //Asi se imprime directamente como si fuera un array
        System.out.println(semana.toString());
    }
}
