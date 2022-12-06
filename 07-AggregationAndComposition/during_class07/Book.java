

public class Book {
    private String title, genre;
    private int yearPublished, pages, currPage=0;
    private Writer writer;

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public Book(String title, String genre, int yearPublished, int pages) {
        this.title = title;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getPages() {
        return pages;
    }

    public String readBook() {
        return "Reading book...";
    }

    public void nextPage() {
        currPage+=1;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Nocturne", "cyberpunk", 2077,310);
        Writer w1 = new Writer("V"," ", 2049);
        b1.setWriter(w1);
        
    }
}