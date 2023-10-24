import java.util.Scanner;

public class Actividad26 {
    public static void actividad26 () throws Exception {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduce 10 numeros");
        
        
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 10; i++) {
            int number = scaner.nextInt();
            if (number >= 0) {
                positive++;
            } else {
                negative++;
            }
        }
    System.out.println(positive);
    System.out.println(negative);
}
}