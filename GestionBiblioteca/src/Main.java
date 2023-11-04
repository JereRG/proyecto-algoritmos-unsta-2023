import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Libros 
        Libro libro1 = new Libro("Piensa y Hazte rico", "Napoleon Hill", "Motivacion");
        Libro libro2 = new Libro("El poder de ahora", "Eckhart Tolle", "Motivacion");
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "Realismo magico");
        Libro libro4 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Fantasia");


        // Usuarios
        Usuario usuario1 = new Usuario("Jeremias R. Guzman", 12345, "jererg@ejemplo1.com");
        Usuario usuario2 = new Usuario("Facundo Zottoli", 67890, "zottolif@ejemplo2.com");
        Usuario usuario3 = new Usuario("Emiliano Valentin Medina", 54321, "laura@ejemplo3.com");
        Usuario usuario4 = new Usuario("Jose Miguel Campos Fernandez", 98765, "carlos@ejemplo4.com");

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
        usuario2.prestarLibro(libro2);
        usuario3.prestarLibro(libro3);
        usuario4.prestarLibro(libro4);

        usuario2.devolverLibro(libro3);
        usuario3.devolverLibro(libro1);

        List<Libro> librosDisponibles = biblioteca.listarLibrosDisponibles();
        System.out.println("Libros disponibles en la biblioteca: " + librosDisponibles.size());

        List<Usuario> listaUsuarios = biblioteca.listarUsuarios();
        System.out.println("Usuarios registrados: " + listaUsuarios.size());

        List<Libro> librosPrestadosUsuario1 = usuario1.consultarLibrosPrestados();
        System.out.println("Libros prestados a Jeremias R. Guzman: " + librosPrestadosUsuario1.size());

        List<Libro> librosPrestadosUsuario2 = usuario1.consultarLibrosPrestados();
        System.out.println("Libros prestados a Facundo Zottoli: " + librosPrestadosUsuario2.size());

        List<Libro> librosPrestadosUsuario3 = usuario1.consultarLibrosPrestados();
        System.out.println("Libros prestados a Emiliano Valentin Medina: " + librosPrestadosUsuario3.size());

        List<Libro> librosPrestadosUsuario4 = usuario1.consultarLibrosPrestados();
        System.out.println("Libros prestados a Jose Miguel Campos Fernandez: " + librosPrestadosUsuario4.size());

        Usuario usuarioBuscadoPorNombre = biblioteca.buscarUsuarioPorNombre("Jeremias R. Guzman");
        Usuario usuarioBuscadoPorNumero = biblioteca.buscarUsuarioPorNumeroEstudiante(98765);

        if (usuarioBuscadoPorNombre != null) {
            System.out.println("Usuario fue encontrado por su nombre: " + usuarioBuscadoPorNombre.getNombre());
        } else {
            System.out.println("Usuario no fue encontrado por su nombre.");
        }

        if (usuarioBuscadoPorNumero != null) {
            System.out.println("Usuario fue encontrado por el numero de estudiante: " + usuarioBuscadoPorNumero.getNombre());
        } else {
            System.out.println("Usuario no fue encontrado por el numero de estudiante.");
        }
    }
}

