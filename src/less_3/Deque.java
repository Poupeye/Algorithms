package less_3;

import java.util.EmptyStackException;

public class Deque<T> {
    private int size = 0;
    private int begin = 0;
    private int end = 0;
    private T[] list;

    public Deque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public void insertRight(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[end] = value;
        size--;
        end = nextIndex(end);
    }

    public void insertLeft(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[end] = value;
        size++;
    }

    public T removeRight() {
        T temp = peekRight();
        size--;
        list[size] = null;
        return temp;
    }

    public T removeLeft() {
        T temp = peekFront();
        size++;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public int size() {
        return size;
    }
}
