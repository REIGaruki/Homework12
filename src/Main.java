public class Main {
    public static void main(String[] args) {

    }
    public class Book {
        private String bookName;
        int publishYear;
        private Author author;
        public Book(String bookName, Author author, int publishYear) {
            this. bookName = bookName;
            this.author = author;
            this. publishYear = publishYear;
        }
    }
    public class Author{
        String authorName;
        public Author(String authorName) {
            this.authorName = authorName;
        }
    }
}