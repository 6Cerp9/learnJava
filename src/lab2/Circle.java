package lab2;

/*Создать класс, описывающий модель окружности (Circle). В классе
должны быть описаны нужные свойства окружности и методы для получения и
изменения этих свойств. Добавить методы для расчета площади круга и длины
окружности, а также метод позволяющий сравнивать две окружности. При
помощи класса CircleTest, содержащего статический метод main(String[] args),
протестировать работу класcа Circle.*/

import java.util.Objects;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircleLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}

