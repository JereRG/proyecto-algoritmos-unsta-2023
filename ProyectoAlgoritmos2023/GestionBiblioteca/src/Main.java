import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Libros 
        Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", "Ficción");
        Libro libro2 = new Libro("1984", "George Orwell", "Ciencia Ficción");
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico");
        Libro libro4 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Fantasía");


        // Usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", 12345, "juan@example.com");
        Usuario usuario2 = new Usuario("María López", 67890, "maria@example.com");
        Usuario usuario3 = new Usuario("Laura Rodríguez", 54321, "laura@example.com");
        Usuario usuario4 = new Usuario("Carlos Martínez", 98765, "carlos@example.com");

        // Registrar Libros
        biblioteca.registrarLibro(libro1);
        biblioteca.registrarLibro(libro2);
        biblioteca.registrarLibro(libro3);
        biblioteca.registrarLibro(libro4);

        // Registrar Usuarios
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);
        biblioteca.registrarUsuario(usuario3);
        biblioteca.registrarUsuario(usuario4);

        usuario1.prestarLibro(libro1);
        usuario2.prestarLibro(libro3);
        usuario3.prestarLibro(libro1);
        usuario4.prestarLibro(libro2);

        usuario2.devolverLibro(libro3);
        usuario3.devolverLibro(libro1);

        List<Libro> librosDisponibles = biblioteca.listarLibrosDisponibles();
        System.out.println("Libros disponibles en la biblioteca: " + librosDisponibles.size());

        List<Usuario> listaUsuarios = biblioteca.listarUsuarios();
        System.out.println("Usuarios registrados: " + listaUsuarios.size());

        List<Libro> librosPrestadosUsuario1 = usuario1.consultarLibrosPrestados();
        System.out.println("Libros prestados a Juan Pérez: " + librosPrestadosUsuario1.size());

        Usuario usuarioBuscadoPorNombre = biblioteca.buscarUsuarioPorNombre("Juan Pérez");
        Usuario usuarioBuscadoPorNumero = biblioteca.buscarUsuarioPorNumeroEstudiante(12345);

        if (usuarioBuscadoPorNombre != null) {
            System.out.println("Usuario encontrado por nombre: " + usuarioBuscadoPorNombre.getNombre());
        } else {
            System.out.println("Usuario no encontrado por nombre.");
        }

        if (usuarioBuscadoPorNumero != null) {
            System.out.println("Usuario encontrado por número de estudiante: " + usuarioBuscadoPorNumero.getNombre());
        } else {
            System.out.println("Usuario no encontrado por número de estudiante.");
        }
    }
}

