public class libro {

    public String titol;
    public String autor;
    public Integer qualificacion;
    public Integer ID;

    public libro(String titol, String autor, Integer qualificacion) {
        this.titol = titol;
        this.autor = autor;
        this.qualificacion = qualificacion;
    }

    public Integer getId() {
        return ID;
    }
}
