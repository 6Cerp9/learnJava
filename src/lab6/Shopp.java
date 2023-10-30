package lab6;

// Интерфейс Printable с одним методом print()
interface Printable {
    void print();
}

// Класс Shop, реализующий интерфейс Printable
class Shop implements Printablee {
    private String name;
    private String location;

    public Shop(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Реализация метода print() из интерфейса Printable
    @Override
    public void print() {
        System.out.println("Shop Name: " + name);
        System.out.println("Location: " + location);
    }
}

public class Shopp {
    public static void main(String[] args) {
        Printablee printablee = new Shop("Magnit", "Ulitca Gagarina");
        printablee.print();
    }
}
