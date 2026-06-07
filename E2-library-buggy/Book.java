// Book.java
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }
    
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return available; }

    
	public void borrow() throws disponibilidadException{
        if(available){
            available = false;
        } else throw new disponibilidadException(
    "No se puede prestar ya que no está disponible"
        );
    }
    
    public void returnBook() throws disponibilidadException{
         if(!available){
            available = true;
        } else throw new disponibilidadException(
    "No se puede devolver ya que está disponible"
        );
    }
}

class disponibilidadException extends Exception{
    String mensaje;
    public disponibilidadException(String mensaje) {
        super(mensaje);
    }
}
