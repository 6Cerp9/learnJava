package lab41;

public class Person {
    private String fullName;
    private int age;

    // Конструктор без параметров
    public Person() {
        fullName = "Неизвестно";
        age = 0;
    }

    // Конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод для перемещения (move)
    public void move() {
        System.out.println(fullName + " перемещается");
    }

    // Метод для разговора (talk)
    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args) {
        // Создание объекта с использованием конструктора без параметров
        Person person1 = new Person();
        person1.move();
        person1.talk();

        // Создание объекта с использованием конструктора с параметрами
        Person person2 = new Person("Иван Иванов", 30);
        person2.move();
        person2.talk();
    }
}
