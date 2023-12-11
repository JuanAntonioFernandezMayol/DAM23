package Ejercicio3;

import java.util.Scanner;

public class MainUsuarios {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Escribe el nombre de usuario: ");
        String nombre = scaner.nextLine();
        System.out.println("Escribe el correo el usuario: ");
        String email = scaner.nextLine();
        System.out.println("Escribe la contraseña del usuario: ");
        String contraseña = scaner.nextLine();

        Usuarios usuario1 = new Usuarios(nombre, email, contraseña);
        usuario1.encriptarContraseña();
        usuario1.imprimir();
        scaner.close();
    }
}