import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        final Scanner escaner = new Scanner(System.in);
        List<libro> Estanteria;
        System.out.println("----------------------");
        System.out.println("Bienvenido a la Estanteria de libros!");
        System.out.println("----------------------");
        Estanteria = new ArrayList<>();
        Integer maxIdLibro = 1;

        System.out.println("----------------------");
        System.out.println("¿Que deseas hacer?");
        System.out.println("0- Cerrar Aplicación");
        System.out.println("1- Agregar libro");
        System.out.println("2- Eliminar Libro por titulo");
        System.out.println("3- Eliminar Libro por autor");
        System.out.println("4- Top10 de libros");
        System.out.println("5- Ver la Estanteria");
        System.out.println("----------------------");

        System.out.print("Selecciona una función: ");
        Integer funcion = leerNumero();

        // Nuestro menú con cada una de las funciones implementadas:
        while (funcion != 0) {

            switch (funcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    eliminarLibroTitulo();
                    break;
                case 3:
                    eliminarLibroAutor();
                    break;
                case 4:
                    top10();
                    break;
                case 5:
                    // mostrarEstanteria();
                    break;
            }

            System.out.print("Selecciona una función: ");
            funcion = leerNumero();
        }

        System.out.println("No hay mas libros.");
    }

    private static void agregarLibro(Integer maxIdLibro, Scanner escaner) {
        Integer ID = maxIdLibro;
        System.out.println("Nombre del llibro: ");
        String nombre = escaner.nextLine();
        System.out.println("Autor del llibro: ");
        String autor = escaner.nextLine();
        System.out.println("Qualificación del llibro: ");
        String qualificacion = escaner.nextLine();
        libro libro = new libro(nombre, autor, qualificacion);
        Estanteria.add(libro);
        ID++;
    }

    private static void eliminarLibroTitulo() {
        System.out.println("Que libro quieres eliminar");
        Integer borrar = leerNumero();
        if(borrar == id){
            Estanteria.remove(libro.titol)
        }
    }

    private static void eliminarLibroAutor() {
        System.out.println("Que libro quieres eliminar");
        Integer borrar = leerNumero();
        if(borrar == id){
            libro.remove(libro.autor)
        }
        
    }

    private static void top10() {
        int i = 0;
        while (i > 10) {
            Integer max = Collection.max(qualificacion);
            int posmax = qualificacion.indexOf(max);
            System.out.println("El top10 es: ");
            System.out.println(llibres + qualificacion);
            i++;
        }
    }

    private static int leerNumero() {
        return Integer.valueOf(escaner.nextLine());
    }
}
