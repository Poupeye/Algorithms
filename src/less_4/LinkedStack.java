package less_4;

import less_3.MyStack;

import java.util.Stack;

public class LinkedStack<T> extends Stack {
    private LinkedList<T> stack = new LinkedList<>();

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void enqueue( T value){
        stack.addFirst(value);
    }

    public T dequeue(){
        return stack.removeFirst();
    }

    public T peek(){
        return stack.getFirst();
    }



}
