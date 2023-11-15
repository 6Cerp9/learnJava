package lists1;

class ListNode<T> {
    T data;
    ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    private ListNode<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void addElement(T element) {
        ListNode<T> newNode = new ListNode<>(element);
        if (head == null) {
            head = newNode;
        } else {
            ListNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeElement(T element) {
        if (head == null) {
            return;
        }

        if (head.data.equals(element)) {
            head = head.next;
            return;
        }

        ListNode<T> current = head;
        while (current.next != null && !current.next.data.equals(element)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void displayOnScreen() {
        ListNode<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void clear() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}


public class LinLists1 {
    public static void main(String[] args) {
        LinkedList<String> linearList = new LinkedList<>();

        // Добавление элементов
        linearList.addElement("Element 1");
        linearList.addElement("Element 2");
        linearList.addElement("Element 3");

        // Вывод на экран
        System.out.println("Содержимое линейного списка:");
        linearList.displayOnScreen();

        // Удаление элемента
        linearList.removeElement("Element 2");

        // Проверка на пустоту
        System.out.println("Линейный список пуст: " + linearList.isEmpty());

        // Очистка списка
        linearList.clear();

        // Проверка на пустоту после очистки
        System.out.println("Линейный список пуст: " + linearList.isEmpty());
    }
}
