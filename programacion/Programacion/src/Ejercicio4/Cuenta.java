package Ejercicio4;

import java.util.Scanner;

public class Cuenta {
    private String nombre;
    private String numerodecuenta;
    private Double tipodeinteres;
    private Double saldo;

    public String getNombre() {
        return nombre;
    }
    

    public String getnumerodecuenta() {
        return numerodecuenta;
    }

    public void setnumerodecuenta(String numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public Double gettipodeinteres() {
        return tipodeinteres;
    }

    public void settipodeinteres(Double tipodeinteres) {
        this.tipodeinteres = tipodeinteres;
    }

    public Double getsaldo() {
        return saldo;
    }

    public void setsaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cuenta(String nombre, String numerodecuenta, Double tipodeinteres, Double saldo) {
        this.nombre = nombre;
        this.numerodecuenta = numerodecuenta;
        this.tipodeinteres = tipodeinteres;
        this.saldo = saldo;
    }

    public double Ingreso() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Escribe la cantidad que quieres ingresar: ");
        Double ingreso = scaner.nextDouble();
        this.saldo = saldo + ingreso;
        return this.saldo;
    }

    public double Reintrego() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Escribe la cantidad que quieres sacar: ");
        Double reintrego = scaner.nextDouble();
        this.saldo = saldo - reintrego;
        return this.saldo;
    }
    // public CuentaCopia(String nombre, String numerodecuenta, Double
    // tipodeinteres, Double saldo) {
    // this.nombre = nombre;
    // this.numerodecuenta = numerodecuenta;
    // this.tipodeinteres = tipodeinteres;
    // this.saldo = saldo;
    // }

    public void imprimir() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El numero de cuenta es: " + numerodecuenta);
        System.out.println("El tipo de interes es: " + tipodeinteres);
        System.out.println("El saldo es: " + saldo);
    }
}
