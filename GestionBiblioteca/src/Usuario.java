import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nombre;
    private int numeroEstudiante;
    private String correoElectronico;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, int numeroEstudiante, String correoElectronico) {
        this.nombre = nombre;
        this.numeroEstudiante = numeroEstudiante;
        this.correoElectronico = correoElectronico;
        this.librosPrestados = new ArrayList<>();
    }

    public void prestarLibro(Libro libro) {
        if (libro.isDisponible() && librosPrestados.size() < 3) {
            librosPrestados.add(libro);
            libro.prestar();
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            libro.devolver();
        }
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public List<Libro> consultarLibrosPrestados() {
        return librosPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }
}
