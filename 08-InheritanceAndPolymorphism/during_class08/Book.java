package during_class08;

public class Book {
    private String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String display() {
        return "Title: " + title +"\nAuthor: " + author;
    }

    public static void main(String[] args) {
        Book b1 = new Book("To Whom The Bell Tolls", "Ernest Hemingway");
        b1.display();
    }
    
}