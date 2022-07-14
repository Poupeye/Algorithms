package less_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Tree<Integer, Integer> tree = new Tree<>();



        for (int i = 1; i <= 20; i++) {
            tree.add(i, rand.nextInt(200) - 100);
            System.out.println(tree.get(i));

        }

//        final int AMOUNT = 20;
//        int balanced = 0;
//        Tree arr[] = new Tree[AMOUNT];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new Tree<Integer, String>();
//            do {
//                arr[i].put((int) (((Math.random() * 2) - 1) * 100), " ");
//            } while (arr[i].height() != 6);
//
//            if (arr[i].isBalanced()) {
//                balanced++;
//            }
//
//        }

    }


}
