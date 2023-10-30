package lab9;

import java.util.Arrays;

public class Comparablee implements Comparable<Comparablee> {
    private String name;
    private int age;

    public Comparablee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Comparablee otherPerson) {
        // Сравниваем вначале возраст, потом имя
        int ageComparison = Integer.compare(this.age, otherPerson.age);

        if (ageComparison != 0) {
            return ageComparison;
        } else {
            return this.name.compareTo(otherPerson.name);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Comparablee person1 = new Comparablee("Alice", 25);
        Comparablee person2 = new Comparablee("Bob", 30);
        Comparablee person3 = new Comparablee("Charlie", 25);

        // Сортировка массива объектов Person
        Comparablee[] people = {person1, person2, person3};
        Arrays.sort(people);

        // Вывод отсортированного массива
        for (Comparablee person : people) {
            System.out.println(person);
        }
    }
}
