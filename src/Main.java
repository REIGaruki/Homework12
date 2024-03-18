import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Author tolstoyLN = new Author("Толстой Лев Николаевич");
        Author pushkinAS = new Author("Пушкин Александр Сергеевич");
        Book warAndPeace = new Book("Война и мир", tolstoyLN, 2020);
        Book evgeniyOnegin = new Book("Евгений Онегин", pushkinAS);
        evgeniyOnegin.setPublishYear(LocalDate.now().getYear());
        warAndPeace.setPublishYear(2300);
        warAndPeace.printInfo('\\');
        evgeniyOnegin.printInfo(',');
    }
}