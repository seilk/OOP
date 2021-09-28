// Do not change class 'Main' code.
public class HW4_03 {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Son of God", "Mark Lee", 387);
        Book book3 = new Book("Moon Flower", "Jenny Kim", 265);
        Book book4 = new Book("Son of God", "Mark Lee", 387);

        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        System.out.println("book3: " + book3);
        System.out.println("book4: " + book4);

        book1.setTitle("English Practice");
        book1.setAuthor("John Brown");
        book1.setNumPages(125);

        System.out.println("book1: " + book1);
        System.out.println("book1's author: " + book1.getAuthor());

        System.out.println("book2 equals book3? " + book2.equals(book3));
        System.out.println("book2 equals book4? " + book2.equals(book4));
    }

}

class Book {
    private String title;
    private String author;
    private int numPages;

    public Book() {
        this.title = "no title";
        this.author = "noname";
        this.numPages = 0;
    }

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public String toString() {
        String str = "[BOOK] " + "title" + "(" + title + ") " + "author" + "(" + author + ") " + "pages" + "("
                + numPages + ")";
        return str;
    }

    public String setTitle(String title) {
        this.title = title;
        return null;
    }

    public String setAuthor(String author) {
        this.author = author;
        return null;
    }

    public int setNumPages(int numPages) {
        this.numPages = numPages;
        return 0;
    }

    public String getAuthor() {
        return author;
    }

    public boolean equals(Book otherBook) {
        return title.equals(otherBook.title) && author.equals(otherBook.author) && numPages == otherBook.numPages;
    }
}
