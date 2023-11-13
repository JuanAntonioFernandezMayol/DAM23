

public class Coleccion {
    
    public Superheroe[] Superheroes;
    public String propietario;
    public String fecha;

    public Coleccion(){
    }
    
    //Metodos de nuestra coleccion

    //pinta la info de todos los heroes
    public void pintarInfColeccion(){
        int i = 0;
        while(i<Superheroes.length){
            Superheroes[i].pintarInfomacion();
            i++;
        }
    }
    public void pintarInfColeccion(int fuerza){
        int i = 0;
        while(i<Superheroes.length){
            if(Superheroes[i].fuerza < fuerza)
            Superheroes[i].pintarInfomacion();
        }
            i++;
    }
}
