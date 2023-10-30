package lab7;

// Интерфейс Printable с одним методом print()
interface Printable {
    void print();
}

// Класс Magazine, реализующий интерфейс Printable
class Book implements Printable {
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

class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Magazine Title: " + title);
    }

    // Статический метод для вывода названий только журналов
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                item.print();
            }
        }
    }
}

public class sevenone {
    public static void main(String[] args) {
        Printable[] items = new Printable[4];
        items[0] = new Magazine("немодный журнал");
        items[1] = new Magazine("модный журнал");
        items[2] = new Magazine("Эво кто");
        items[3] = new Book("Book 1", "Author 1");

        Magazine.printMagazines(items);
    }
}
