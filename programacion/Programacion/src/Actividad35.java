import java.util.Scanner;

public class Actividad35 {
    public static void actividad35 () {
        int barcosHundidos = 0;
        Scanner scaner = new Scanner(System.in);
        boolean[][] tablero = {
            {true, false, false, false, false},
            {false, false, true, false, true},
            {false, true, false, false, false},
            {true, false, false, false, false},
            {false, false, true, true, false},
        };
        for (int i=5;i>=1;i--){
            System.out.println("Introduce la X");
            int x = scaner.nextInt();
            System.out.println("Introduce la Y");
            int y = scaner.nextInt();
            if (tablero[x][y] == true) {
                System.out.println("Has hundido el barco!");
                barcosHundidos++;
                tablero[x][y] = false;
            }else {
                System.out.println("Has fallado!");
            }
        }
        System.out.println("Fin del juego");
        System.out.println("Has hundido en total " + barcosHundidos);
        scaner.close();
    }
}
