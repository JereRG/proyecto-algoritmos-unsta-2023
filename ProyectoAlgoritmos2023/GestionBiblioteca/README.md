# Defensa del Proyecto de Programación Orientada a Objetos

![Diagrama de Clases](/JAVAPOO.png)

## Resumen del Proyecto

El proyecto consiste en un Sistema de Gestión de Biblioteca desarrollado utilizando programación orientada a objetos (POO). El sistema permite a los usuarios, en su mayoría estudiantes, llevar a cabo una variedad de tareas relacionadas con la gestión de libros y usuarios en una biblioteca. A continuación, se detallan los aspectos clave del proyecto.

## Descripción del Sistema

El sistema se compone de las siguientes clases principales:

- `Libro`: Representa la información de un libro en la biblioteca. Contiene atributos como título, autor, categoría y disponibilidad. Los métodos incluyen la capacidad de prestar y devolver libros.

- `Usuario`: Representa a los usuarios de la biblioteca, con atributos como nombre, número de estudiante, correo electrónico y una lista de libros prestados. Los usuarios pueden prestar y devolver libros.

- `Biblioteca`: Representa la biblioteca en sí, manteniendo listas de libros y usuarios registrados. Permite registrar libros y usuarios, listar libros disponibles, y buscar usuarios por nombre y número de estudiante.

## Diseño de Clases y Relaciones

![Diagrama de Clases](/UML.png)

El diagrama de clases UML ilustra las relaciones clave entre las clases del sistema:

- **Biblioteca y Libro**: La biblioteca contiene varios libros, y un libro pertenece a una biblioteca.

- **Usuario y Libro**: Un usuario puede tener varios libros prestados, y un libro es prestado por un usuario.

- **Biblioteca y Usuario**: La biblioteca registra varios usuarios, y un usuario es registrado por una biblioteca.

## Operaciones y Flujo de Trabajo

Las operaciones clave incluyen préstamo y devolución de libros, que se han implementado en el código. El flujo de trabajo se puede visualizar en diagramas de actividad en el código fuente.

## Ampliación y Flexibilidad

El diseño del sistema es escalable y flexible, lo que permite futuras expansiones y adiciones de características. Por ejemplo, podrían agregarse funciones de gestión de multas o búsqueda avanzada de libros.

## Calidad del Código

Se ha enfocado en la legibilidad, mantenimiento y eficiencia del código, siguiendo las mejores prácticas de POO. El código está organizado en clases para facilitar la comprensión y colaboración en el desarrollo.

## Ejemplos de Uso y Pruebas

Se han proporcionado ejemplos concretos de cómo se utiliza el sistema en la práctica. Los casos de prueba se han ejecutado para demostrar la funcionalidad correcta.

## Beneficios y Aplicabilidad

El sistema es beneficioso para la gestión de libros y usuarios en bibliotecas educativas. Puede aplicarse en bibliotecas universitarias, instituciones educativas y otros contextos similares.

## Información Adicional

### Alumnos
- **Jeremias R. Guzman**
- **Facundo Zottoli**

### Detalles del Proyecto
- **Lenguaje de Programación:** Java
- **Materia:** Algoritmos y Paradigmas 2023
- **Universidad:** UNSTA (Universidad del Norte Santo Tomás de Aquino)

### Herramientas Utilizadas
- **Editor de Código:** Visual Studio Code
- **Editor del Diagrama de Clases:** draw.io

