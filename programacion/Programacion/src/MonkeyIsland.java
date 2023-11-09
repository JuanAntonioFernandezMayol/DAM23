import java.util.Random;
import java.util.Scanner;

public class MonkeyIsland {
    public static void monkeyisland () {
    Scanner scaner = new Scanner (System.in);
    Random aleatorio = new Random();
    int num = aleatorio.nextInt(5);  //genera un numero de 0 a 4
    System.out.println("El numero aleatorio es " + num);
    
    
    
    scaner.close();
}
}