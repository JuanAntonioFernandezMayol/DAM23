package Ejercicio4;

public class CuentaBancaria {
    public static void main(String[] args) {

        Cuenta usuario1 = new Cuenta("pepe", "ES547547", 5.0, 1.898);
        usuario1.imprimir();
        usuario1.Ingreso();
        usuario1.imprimir();
    }
}