package Ejercicio3;

public class Usuarios {
    private String nombre;
    private String email;
    private String contraseña;
    Boolean esEncriptada = false;

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Boolean getEsEncripada() {
        return esEncriptada;
    }

    public Usuarios(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public void imprimir() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El correo es: " + email);
        System.out.println("la contraseña es: " + contraseña);
    }

    public void encriptarContraseña() {
        char[] letras = contraseña.toCharArray();

        int letraAscii;
        for (int i = 0; i < contraseña.length(); i++) {
            letraAscii = (int) letras[i];
            letras[i] = (char) (letraAscii + 5);
        }
        contraseña = String.valueOf(letras);
        esEncriptada = true;
    }

    public void desencriptarContraseña() {
        char[] letras = contraseña.toCharArray();

        int letraAscii;
        for (int i = 0; i < contraseña.length(); i++) {
            letraAscii = (int) letras[i];
            letras[i] = (char) (letraAscii - 5);
        }
        contraseña = String.valueOf(letras);
        esEncriptada = false;
    }
}
