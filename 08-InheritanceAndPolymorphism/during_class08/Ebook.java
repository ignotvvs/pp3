package during_class08;

public class Ebook extends Book{
    private String fileName;

    public Ebook(String title, String author, String fileName) {
        super(title, author);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String display() {
        return "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor()
                            + "\nFile name: " + fileName;
    }

    public static void main(String[] args) {
        Ebook e1 = new Ebook("To Whom The Bell Tolls", "Ernest Hemingway", "ebook.pdf");
        System.out.println(e1.display());
    }
}
