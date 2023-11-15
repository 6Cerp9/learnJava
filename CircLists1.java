package lists1;

class CircularListNode<T> {
    T data;
    CircularListNode<T> next;

    public CircularListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

class CircularList<T> {
    private CircularListNode<T> head;
    public CircularList() {
        this.head = null;
    }
    public void addElement(T element) {
        CircularListNode<T> newNode = new CircularListNode<>(element);
        if (head == null) {
            head = newNode;
            head.next = head; // Устанавливаем указатель на самого себя, образуя кольцо
        } else {
            newNode.next = head.next;
            head.next = newNode;
            head = newNode;
        }
    }
    public void removeElement(T element) {
        if (head == null) {
            return;
        }
        CircularListNode<T> current = head;
        while (current.next != head && !current.next.data.equals(element)) {
            current = current.next;
        }
        if (current.next != head) {
            current.next = current.next.next;
            if (head.data.equals(element)) {
                head = current;
            }
        }
    }
    public void displayOnScreen() {
        if (head == null) {
            return;
        }

        CircularListNode<T> current = head.next;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head.next);
    }
    public void clear() {
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
}

public class CircLists1 {
    public static void main(String[] args) {
        CircularList<String> circularList = new CircularList<>();
        // Добавление элементов
        circularList.addElement("Element A");
        circularList.addElement("Element B");
        circularList.addElement("Element C");
        // Вывод на экран
        System.out.println("Содержимое кольцевого списка:");
        circularList.displayOnScreen();
        // Удаление элемента
        circularList.removeElement("Element B");
        // Проверка на пустоту
        System.out.println("Кольцевой список пуст: " + circularList.isEmpty());
        // Очистка списка
        circularList.clear();
        // Проверка на пустоту
        System.out.println("Кольцевой список пуст: " + circularList.isEmpty());
    }
}
