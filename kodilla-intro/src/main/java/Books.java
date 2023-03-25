import java.awt.print.Book;

public class Books {
    private String author;
    private String title;
    public Books(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Books of(String author, String title) {
        Books book = new Books(title, author);
        System.out.println("The book's author is " + author + ".");
        System.out.println("The book's title is " + title + ".");
        return book;
    }
}
