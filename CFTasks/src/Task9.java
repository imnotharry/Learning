import java.util.NoSuchElementException;

public class Task9<T> {

    private static class Node<T> {
        T value;
        Node<T> prev;
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
        if (head != null) head.prev = n;
        head = n;
        if (tail == null) tail = n;
        size++;
    }

    public void addLast(T value) {
        Node<T> n = new Node<>(value);
        n.prev = tail;
        if (tail != null) tail.next = n;
        tail = n;
        if (head == null) head = n;
        size++;
    }

    public T removeFirst() {
        if (head == null) throw new NoSuchElementException("List is empty");
        T val = head.value;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        size--;
        return val;
    }

    public T removeLast() {
        if (tail == null) throw new NoSuchElementException("List is empty");
        T val = tail.value;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
        size--;
        return val;
    }

    public boolean remove(T value) {
        Node<T> cur = head;
        while (cur != null) {
            if (equalsValue(cur.value, value)) {
                unlink(cur);
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public T get(int index) {
        checkIndex(index);
        if (index < size / 2) {
            Node<T> cur = head;
            for (int i = 0; i < index; i++) cur = cur.next;
            return cur.value;
        } else {
            Node<T> cur = tail;
            for (int i = size - 1; i > index; i--) cur = cur.prev;
            return cur.value;
        }
    }

    private void unlink(Node<T> node) {
        Node<T> p = node.prev;
        Node<T> n = node.next;

        if (p != null) p.next = n;
        else head = n;
        if (n != null) n.prev = p;
        else tail = p;

        size--;
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
