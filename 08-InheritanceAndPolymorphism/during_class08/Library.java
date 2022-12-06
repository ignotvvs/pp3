package during_class08;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> shelf = new ArrayList<Book>();

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public void addBook(Book book) {
        shelf.add(book);
    }
/* 
    public String toString() {
        return 
    }*/

    public static void main(String[] args) {
        Library l1 = new Library();
        Ebook e1 = new Ebook("To Whom The Bell Tolls", "Ernest Hemingway", "ebook1.png");
        l1.addBook(e1);
        System.out.println(l1.getShelf());
    }
}
