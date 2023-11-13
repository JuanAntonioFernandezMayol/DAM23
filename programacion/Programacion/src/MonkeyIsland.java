import java.util.Random;
import java.util.Scanner;

public class MonkeyIsland {
    public static void monkeyisland () {
    Scanner scaner = new Scanner (System.in);
    Random aleatorio = new Random();
    int num = aleatorio.nextInt(5);  //genera un numero de 0 a 4
    System.out.println("El numero aleatorio es " + num);
    String[] insultos = {"insulto1","insulto2","insulto3","insulto4"};
    String[] contestacion ={"c1","c2","c3","c4"};
    
    scaner.close();
}
}