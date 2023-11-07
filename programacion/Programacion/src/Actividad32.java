public class Actividad32 {
    public static void actividad32 () {
        String frase = "Hola Mu ndo";
        char [] array = frase.toCharArray();

        int espacios = 0;
        int inicio = 0;

        while(inicio < array.length){
            if (array[inicio] == ' '){
                espacios++;
            }
            inicio++;
        }
        System.out.println("Hay " + espacios + "espacios");
    }
}
