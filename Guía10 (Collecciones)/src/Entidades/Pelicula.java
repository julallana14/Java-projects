package Entidades;

public class Pelicula {

    private String title;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String title, String director, Double duracion) {
        this.title = title;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{");
        sb.append("title=").append(title);
        sb.append(", director=").append(director);
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }
    
    
}
