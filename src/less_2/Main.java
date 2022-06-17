package less_2;

import java.util.Random;

public class Main {
    static Random rand = new Random();

    public static void main(String[] args) {
        MyArrayList<Integer> mal = new MyArrayList<>(1000000);

        for (int i = 0; i < 1000000; i++) {
            mal.add(rand.nextInt(100));
        }
//        mal.insertSort();
//        System.out.println(mal);
//
//        mal.selectionSort(););
//        System.out.println(mal);

        mal.bobbleSort();
        System.out.println(mal);


    }
}
