package lab6;

// Интерфейс Printable с одним методом print()
interface Printablee {
    void print();
}

// Класс Book, реализующий интерфейс Printable
class Book implements Printablee {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Реализация метода print() из интерфейса Printable
    @Override
    public void print() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Boook {
    public static void main(String[] args) {
        Printablee printablee = new Book("Java", "Pasha");
        printablee.print();
    }
}
