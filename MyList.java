package ss10.BT.ArrayList;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private final int size = 0;
    private final Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
    }

    public E remove(int index) {
        return null;
    }

    public int size() {
        return size;
    }

    public E clone() {
        return null;
    }

    public boolean contains(E o) {
        return false;
    }

    public int indexOf(E o) {
        return -1;
    }

    public boolean add(E e) {
        return false;
    }

    public void ensureCapacity(int minCapacity) {
    }

    public E get(int i) {
        return null;
    }

    public void clear() {
    }
}
