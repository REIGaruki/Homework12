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
        } else {
            this.publishYear = LocalDate.now().getYear();
        }
    }
    public Book(String bookName, Author author) {
        this. bookName = bookName;
        this.author = author;
        this.publishYear = LocalDate.now().getYear();
    }
    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        if (publishYear <= LocalDate.now().getYear()) {
            this.publishYear = publishYear;
        }
    }
    public void printInfo(char punctuation) {
        System.out.println(getAuthor().getAuthorName() + " " + getAuthor().getAuthorSurname() + punctuation + " " +
                getBookName() + punctuation + " " + getPublishYear());
    }
}
