import java.util.NoSuchElementException;

public class Task8<T> {

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T value) {
        Node<T> n = new Node<>(value);
        n.next = head;
        head = n;
        if (tail == null) tail = n;
        size++;
    }

    public void addLast(T value) {
        Node<T> n = new Node<>(value);
        if (tail == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null) throw new NoSuchElementException("List is empty");
        T val = head.value;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return val;
    }

    public boolean remove(T value) {
        Node<T> prev = null;
        Node<T> cur = head;

        while (cur != null) {
            if (equalsValue(cur.value, value)) {
                if (prev == null) {
                    head = cur.next;
                    if (head == null) tail = null;
                } else {
                    prev.next = cur.next;
                    if (cur == tail) tail = prev;
                }
                size--;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }
        return false;
    }

    public T get(int index) {
        checkIndex(index);
        Node<T> cur = head;
        for (int i = 0; i < index; i++) cur = cur.next;
        return cur.value;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
        }
    }

    private boolean equalsValue(T a, T b) {
        return a == b || (a != null && a.equals(b));
    }
}
