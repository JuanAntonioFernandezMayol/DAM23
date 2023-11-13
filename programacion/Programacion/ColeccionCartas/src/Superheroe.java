public class Superheroe {
    public String nombre;
    public String descripcion;
    public String[] habilidades;
    public String rareza; //comun, epico, legendario.
    public String tipo;
    public int fuerza; //De 0 a 10
    public int vida; //De 0 a 10

    //Metodos utiles para los superheroes
    public Superheroe(String nombre, int fuerza, int vida){
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida = vida;
        this.rareza = "Comun";
    }

    public Superheroe(){
    }

    //Metodos uiles para los superheroes
    public void pintarInfomacion(){
        System.out.println(nombre + " - " + descripcion);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("vida: " + vida);
    }
}
