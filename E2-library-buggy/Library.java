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
    
    public Book findBookByTitle(String title) throws libroInvalidoException{
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new libroInvalidoException("El libro " + title + " no existe dentro de la biblioteca");
    }
    
    public List<Book> findAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()){
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
    
    public void eraseBookByTitle(String title) throws libroInvalidoException{
        Book book = findBookByTitle(title);
        books.remove(book);
        System.out.println("Se ha borrado el libro " + book.getTitle());
    }
}

class libroInvalidoException extends Exception{
    String mensaje;
    public libroInvalidoException(String mensaje) {
        super(mensaje);
    }
}