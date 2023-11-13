public class App {
    public static void main(String[] args) throws Exception {
        //Creamos toda nuestra coleccion
        Superheroe spiderman = new Superheroe();
        spiderman.nombre = "Spiderman";
        spiderman.descripcion = "El humilde Piter Parker";
        spiderman.vida = 7;
        spiderman.fuerza= 6;
        String[] habspiderman = {"Sentido araña", "Telaraña"};
        spiderman.habilidades = habspiderman;
        
        Superheroe superman = new Superheroe("Superman",7,10);
        superman.descripcion = "El humilde superman!";
        superman.rareza = "Epico";        
        String[] habssuperman = {"Sentido araña", "Telaraña"};
        superman.habilidades = habssuperman;

        
        //spiderman.pintarInfomacion();
        //superman.pintarInfomacion();
        
        Coleccion marvel = new Coleccion();
        Superheroe[] listaHeroes = {spiderman, superman};
        marvel.Superheroes = listaHeroes;
        marvel.pintarInfColeccion(6);
    }
}
