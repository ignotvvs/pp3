public class Book {

    private String name, genre;
    int price, pages;

    public Book(String name, String genre, int price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return "Name: "+name+"\nGenre: "+genre+"\nPrice: "+price;
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "science fiction", 50);
        System.out.println(b1);
    }
}
