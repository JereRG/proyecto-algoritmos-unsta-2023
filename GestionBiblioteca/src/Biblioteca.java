import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Libro> listarLibrosDisponibles() {
        List<Libro> disponibles = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                disponibles.add(libro);
            }
        }
        return disponibles;
    }

    public List<Libro> listarLibrosPrestadosPorUsuario(Usuario usuario) {
        List<Libro> librosPrestados = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u.equals(usuario)) {
                librosPrestados = u.getLibrosPrestados();
            }
        }
        return librosPrestados;
    }

    public List<Usuario> listarUsuariosQuePrestaronLibro(Libro libro) {
        List<Usuario> usuariosQuePrestaron = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u.getLibrosPrestados().contains(libro)) {
                usuariosQuePrestaron.add(u);
            }
        }
        return usuariosQuePrestaron;
    }
    

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Usuario buscarUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                return usuario;
            }
        }
        return null; 
    }

    public Usuario buscarUsuarioPorNumeroEstudiante(int numeroEstudiante) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroEstudiante() == numeroEstudiante) {
                return usuario;
            }
        }
        return null;
    }
}
