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
        public Book(String bookName, Author author) {
            this. bookName = bookName;
            this.author = author;
        }
        public String getBookName() {
            return this.bookName;
        }

        public Author getAuthor() {
            return author;
        }

        public int getPublishYear() {
            return publishYear;
        }

        public void setPublishYear(int publishYear) {
            this.publishYear = publishYear;
        }
    }
    public class Author{
        String authorName;
        public Author(String authorName) {
            this.authorName = authorName;
        }
        public String getAuthorName() {
            return this.authorName;
        }
    }
}