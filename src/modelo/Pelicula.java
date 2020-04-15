package modelo;

/**
 *
 * @author jhanc
 */
public class Pelicula {

    private String nombre;
    private String director;
    private int año;
    private String reseña;
    private int unidadesVendidas;

    //constructor vacio
    public Pelicula() {

    }
    //constructor sobrecargado

    public Pelicula(String nombre, String director, int año, String reseña) {
        this.nombre = nombre;
        this.director = director;
        this.año = año;
        this.reseña = reseña;
        this.unidadesVendidas = unidadesVendidas;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", director=" + director + ", resena=" + reseña + ", anio=" + año + ", unidadesVendidas=" + unidadesVendidas + '}';
    }

}
