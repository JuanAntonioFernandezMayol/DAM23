package Ejercicio2;

public class Circulo {
    // VARIABLES
    private double radio;
    private String color;

    // CONTRUCTOR
    public Circulo() {
        radio = 1.0;
        color = "rojo";
    }

    public Circulo(double radio) {
        this.radio = radio;
        color = "rojo";
    }

    // METODOS
    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String nuevoColor) {
        color = nuevoColor;
    }
}
