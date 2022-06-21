package less_3;

public class Main {
    public static void main(String[] args) {


        MyStack<String> stack = new MyStack(6);

        stack.push("Жопа ");
        stack.push("Dota ");
        stack.push("32 ");
        stack.push("45 ");
        stack.push("53 ");
        stack.push("64 ");
        for (int i = 0; i < 6; i++) {
            System.out.print(stack.pop());
        }
        System.out.println();

        Deque<Integer> deq = new Deque<>(2);
        Deque<Integer> deq1 = new Deque<>(2);

        deq.insertLeft(1);
        deq.insertLeft(2);
        deq1.insertRight(4);
        deq1.insertRight(5);

        System.out.println(deq.removeRight());
        System.out.println(deq1.removeLeft());

    }
}
