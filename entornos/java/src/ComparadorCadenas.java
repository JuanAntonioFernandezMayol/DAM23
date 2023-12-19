public class ComparadorCadenas {
    public static void main(String[] args) {
        String cadena1 = "prueba";
        String cadena2 = "Prueba";

        if (sonIguales(cadena1, cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }

    public static boolean sonIguales(String cadena1, String cadena2) {
        return cadena1.equals(cadena2);
    }
}
