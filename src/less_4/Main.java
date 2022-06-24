package less_4;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        LinkedStack<String> ls = new LinkedStack<>();


        ll.addFirst("Веталь");
        ll.addFirst("в");
        ll.addFirst("Шапа");
        System.out.println(ll);
        ll.add(1, "сила");

        ll.removeFirst();
        ll.remove("Веталь");

        ll.addLast("правде");
        System.out.println(ll);




        ls.enqueue("");
        ls.enqueue("Хер");
        ls.enqueue("Ебу алибабу");
        System.out.println(ls.peek());


        for (String s: ll) {
            System.out.println(s);
        }
        



    }
}
