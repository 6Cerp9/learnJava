package lists1;

import java.util.LinkedList;
import java.util.List;

class ListContainer<T> {
    private List<T> elements;

    public ListContainer() {
        this.elements = new LinkedList<>();
    }

    public void addElement(T element) {
        this.elements.add(element);
    }

    public void removeElement(T element) {
        this.elements.remove(element);
    }

    public void displayOnScreen() {
        for (T element : this.elements) {
            System.out.println(element);
        }
    }

    public void clear() {
        this.elements.clear();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }
}

public class lists1double {
    public static void main(String[] args) {
        ListContainer<String> cardIndex = new ListContainer<>();
        // Adding elements
        cardIndex.addElement("Элемент 1");
        cardIndex.addElement("Элемент 2");
        cardIndex.addElement("Элемент 3");
        System.out.println("Содержимое картотеки:");
        cardIndex.displayOnScreen();
        // Удаляем элемент
        cardIndex.removeElement("Элемент 2");
        // Проверяем на пустоту
        System.out.println("Пуста ли картотека? - " + cardIndex.isEmpty());
        // Очищаем
        cardIndex.clear();
        // Проверяем на пустоту ещё раз
        System.out.println("Пуста ли картотека? - " + cardIndex.isEmpty());
    }
}
