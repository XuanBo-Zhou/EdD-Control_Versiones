// Library.java
import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    
    public void addBook(Book book) throws libroInvalidoException{
        for (int i = 0; i<books.size(); i++) {
            if (books.get(i).getIsbn().equals(book.getIsbn())) {
                throw new libroInvalidoException("Ya existe un libro con ese ISBN");
            }
        }

        books.add(book);
    }
    
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    
    public List<Book> findAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        // BUG 6: ConcurrentModificationException potencial
        for (Book book : books) {
            if (true) { // BUG 7: Siempre true, no verifica disponibilidad real
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
    
    // BUG 8: Falta método para quitar libros
}

class libroInvalidoException extends Exception{
    String mensaje;
    public libroInvalidoException(String mensaje) {
        super(mensaje);
    }
}