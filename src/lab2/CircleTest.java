package lab2;

public class CircleTest {
    public static void main(String[] args) {
        // Создаем два объекта Circle
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);
        System.out.println("Площадь круга 1: " + circle1.calculateArea());
        System.out.println("Длина окружности круга 1: " + circle1.calculateCircleLength());
        System.out.println("Площадь круга 2: " + circle2.calculateArea());
        System.out.println("Длина окружности круга 2: " + circle2.calculateCircleLength());
        if (circle1.equals(circle2)) {
            System.out.println("Круги имеют одинаковый радиус.");
        } else {
            System.out.println("Круги имеют разные радиусы.");
        }
    }
}
