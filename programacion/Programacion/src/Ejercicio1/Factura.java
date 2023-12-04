package Ejercicio1;

public class Factura {
    private final double IVA = 0.21; // Constante privada (Opcional para el Ej.1)

    /* PROPIEDADES */
    private int codigo; // Código numérico de la factura
    private double coste; // Coste total de la factura (Sin IVA)

    /* CONSTRUCTORES */
    public Factura(int codigoFactura, double costeFactura) {
        codigo = codigoFactura;
        coste = costeFactura;
    }

    /* METODOS */
    /**
     * Pinta por pantalla el código de la factura y su coste, aplicando el IVA.
     */
    public void imprimir() {
        double costeIVA = coste + (coste * IVA);
        System.out.println("El código de la factura es: " + codigo);
        System.out.println("El coste (con IVA) de la factura es: " + costeIVA + "€");
    }
}
