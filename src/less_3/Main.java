package less_3;

public class Main {
    public static void main(String[] args) {

        reversString("улыбок тебе дед макар");

    }
    public static void reversString(String s){
        MyStack<Character> stack = new MyStack(s.length());

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack.pop());
        }




    }



}
