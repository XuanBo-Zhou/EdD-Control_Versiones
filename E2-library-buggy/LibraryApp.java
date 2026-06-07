// LibraryApp.java - Aplicación principal
public class LibraryApp {
    public static void main(String[] args) {
        // Creamos una nueva librería
        Library library = new Library();
        
        // Agregar nuestros libros favoritos
        try {
            library.addBook(new Book("Clean Code", "Robert Martin", "978-0132350884"));
        } catch (libroInvalidoException e) {
            System.out.println("ERROR" + e.getMessage());
        }

        try {
            library.addBook(new Book("Clean Code", "Robert Martin", "978-0132350884")); // Duplicado
        } catch (libroInvalidoException e) {
            System.out.println("ERROR" + e.getMessage());
        }

        try {
            library.addBook(new Book("Design Patterns", "Gamma et al.", "978-0201633610"));            
        } catch (libroInvalidoException e) {
            System.out.println("ERROR" + e.getMessage());
        }


        try {
            Book found = library.findBookByTitle("clean code");
            System.out.println("Encontrado: " + (found != null ? found.getTitle() : "null"));
        } catch (libroInvalidoException e) {
            System.out.println("ERROR" + e.getMessage());
        }

        
        // Comprobamos el préstamo
        try {
            Book book = library.findBookByTitle("Clean Code");

            if (book != null) {
                try {
                    book.borrow();
                } catch (disponibilidadException e) {
                    System.out.println("ERROR" + e.getMessage());
                }

                try {
                    book.borrow();
                } catch (disponibilidadException e) {
                    System.out.println("ERROR" + e.getMessage());
                }
                
                try {
                    book.returnBook();
                } catch (disponibilidadException e) {
                    System.out.println("ERROR" + e.getMessage());
                }

                try {
                    book.returnBook();
                } catch (disponibilidadException e) {
                    System.out.println("ERROR" + e.getMessage());
                }
            }
        } catch (libroInvalidoException e) {
            System.out.println("ERROR" + e.getMessage());
        }
        
        // Listar disponibles
        System.out.println("Libros disponibles: " + library.findAvailableBooks().size());
    }
}
