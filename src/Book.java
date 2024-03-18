import java.time.LocalDate;

public class Book {
    private String bookName;
    private int publishYear;
    private Author author;
    public Book(String bookName, Author author, int publishYear) {
        this. bookName = bookName;
        this.author = author;
        if (publishYear <= LocalDate.now().getYear()) {
            this.publishYear = publishYear;
        }
    }
    public Book(String bookName, Author author) {
        this. bookName = bookName;
        this.author = author;
    }
    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return author.getAuthorName();
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        if (publishYear <= LocalDate.now().getYear()) {
            this.publishYear = publishYear;
        }
    }
    public void printInfo(char punctuation) {
        System.out.println(getAuthor() + punctuation + " " + getBookName() + punctuation + " " + getPublishYear());
    }
}
