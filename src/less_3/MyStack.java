package less_3;

import java.util.EmptyStackException;

public class MyStack<T> {
    private int size = 0;
    private T[] list;

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity;" + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public void push(T value) {
        if (isFull()) {
            reCapasity(list.length + 1);
        }
        list[size] = value;
        size++;
    }

    public T pop() {
        T temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    public T peek() {
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

    private void reCapasity(int newCapacity) {
        T[] tempArr = (T[]) new Object[newCapacity];
        System.arraycopy(list, 0, tempArr, 0, size);
        list = tempArr;
    }

}


