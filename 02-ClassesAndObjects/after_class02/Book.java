public class Book {
    
    //attributes
    String title,genre,author;
    int yearPublished, currentPage = 0, pages;
    
    //methods
    public void displayInfo() {
        System.out.println("Title: " + title + "\nGenre: " + genre 
                            + "\nAuthor: " + author 
                            + "\nYear published: " + yearPublished);
    }
    public void turnPage() {
        if (currentPage < pages) {
            currentPage++;
        } else {
            System.out.println("Reached the end of the book.");
        }
    }
    public void displayPageStat() {
        System.out.println("Total pages: "+ pages + "\nCurrent page: " + currentPage);
    }
}