public class Actividad33 {
    public static void actividad33 () {
        int total = 0;
        int[] arrayNumeros = {10, 20, 30, 40, 50};
        
        for (int i=0;i<arrayNumeros.length;i++){
            if(arrayNumeros[i] != 0) {
                total = total + (arrayNumeros[i]*2);
            }
            System.out.println(total);
        }
}
}
