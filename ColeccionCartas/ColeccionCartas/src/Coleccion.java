public class Coleccion {

    public Superheroe[] superheroes;
    public String propietario;
    public String fecha;

    /* Constructor vacio */
    public Coleccion() {
    }

    // Metodos de nuestra coleccion:

    /**
     * Pinta la info de todos los heroes.
     */
    public void pintarInfColeccion() {
        int i = 0;
        while (i < superheroes.length) {
            superheroes[i].pintarInformacion();
            i++;
        }
    }

    /**
     * Pinta la info de todos los heroes con mas
     * fuerza que el valor de @fuerza.
     * 
     * @param fuerza
     */
    public void pintarInfColeccion(int fuerza) {
        int i = 0;
        while (i < superheroes.length) {
            if (superheroes[i].fuerza > fuerza) {
                superheroes[i].pintarInformacion();
            }

            i++;
        }
    }

    public void pintarMayorFuerza() {
        int maxF = 0;
        int x = 0;
        int y = 1;
        int superH = x;
        while (x < superheroes.length - 1) {
            if (superheroes[x].fuerza > superheroes[y].fuerza) {
                maxF = superheroes[x].fuerza;
                superH = x;
            } else {
                maxF = superheroes[y].fuerza;
                superH = y;
            }
            x++;
            y++;
        }
        System.out.println(superheroes[superH].nombre);
        System.out.println("La fuerza maxima es: " + maxF);
    }
}