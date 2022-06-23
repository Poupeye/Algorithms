package less_3;

import java.util.EmptyStackException;

public class Deque<Item> {
    private int size = 0;
    private int begin = 0;
    private int end = 0;
    private Item[] arr;
    private double loadFactor = 0.75;

    public Deque() {this (10);}

    public Deque(int num) {this(num,0.75);}
    public Deque (int num, double loadFactor){
        setLoadFactor(loadFactor);
        if (num >0) {
            arr = (Item[]) new  Object [num];
        }else {
            throw new IllegalArgumentException();
        }
    }

    public void addRight(Item value) {
        size++;
        arr[end] = value;
        end = nextIndex(end);
    }

    public void addLeft(Item value) {
        size++;
        begin = lastIndex(begin);
        arr[begin] = value;
    }

    public Item removeRight() {
        Item value = peekRight();
        size--;
        arr[begin] = null;
        begin = nextIndex(begin);
        return value;
    }

    public Item removeLeft() {
        Item temp = peekLeft();
        size--;
        end = lastIndex(end);
        arr[end] = null;
        return temp;
    }

    private int nextIndex(int index) {
        return (index + 1) % arr.length;
    }

    private int lastIndex(int index) {
        return (arr.length + index - 1) % arr.length;
    }

    public Item peekLeft() {
        if (size<=0) {
            throw new EmptyStackException();
        }
        return arr[lastIndex(end)];
    }

    public Item peekRight() {
        if (size<=0) {
            throw new EmptyStackException();
        }
        return arr[begin];
    }

    public void setLoadFactor(double loadFactor) {
        this.loadFactor = loadFactor;
    }
}
