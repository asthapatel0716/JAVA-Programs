class Book {
    private String title, author, bookCode;
    private boolean loaned;
    public Book(String title, String author, String bookCode) {
        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
        this.loaned = false;
    }
    public boolean borrowBook() {
        if (loaned) {
            return false;
        }
        loaned = true;
        return true;
    }
    public boolean returnBook() {
        if (!loaned) {
            return false;
        }
        loaned = false;
        return true;
    }
    public boolean isAvailable() {
        return !loaned;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getBookCode() {
        return bookCode;
    }
    @Override
    public String toString() {
        return "Book{title=" + title + ", author=" + author + ", bookCode=" + bookCode + ", loaned=" + loaned + "}";
    }
}
public class BookLoan {
    public static void main(String[] args) {
        Book b1 = new Book("ABC", "Something", "101");
        Book b2 = new Book("XYZ", "Hey", "102");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.borrowBook());
        System.out.println(b1.borrowBook());
        System.out.println(b1.isAvailable());
        System.out.println(b1.returnBook());
        System.out.println(b1);
        System.out.println(b2);
    }
}
