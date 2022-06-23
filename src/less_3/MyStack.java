package less_3;

import java.util.EmptyStackException;

public class MyStack<String> {
    private int size = 0;
    private String[] list;

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity;" + capacity);
        }
        list = (String[]) new Object[capacity];
    }

    public void push(String value) {
        if (isFull()) {
            reCapasity(list.length + 1);
        }
        list[size] = value;
        size++;
    }

    public String pop() {
        String temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    public String peek() {
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
        String[] tempArr = (String[]) new Object[newCapacity];
        System.arraycopy(list, 0, tempArr, 0, size);
        list = tempArr;
    }

//    public String reversString(String s) {
//        StringBuilder sb = new StringBuilder((java.lang.String) s);
//        System.out.println(sb.reverse());
//        return s;
//    }
}


