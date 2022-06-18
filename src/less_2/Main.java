package less_2;

import java.util.Random;

public class Main {
    static Random rand = new Random();

    public static void main(String[] args) {
        MyArrayList<Integer> mal = new MyArrayList<>(5);
        SortedArray<Integer> mal2 = new  SortedArray<>();

        for (int i = 0; i < 5; i++) {
            mal.add(i+5);
        }
        System.out.println(mal);

//        mal.insertSort();
//        System.out.println(mal);
//
//        mal.selectionSort(););
//        System.out.println(mal);

//        mal.bobbleSort();

//        mal.remove(new Integer(99));
        mal.remove(2);
//        mal.remove(new Integer(6));



        System.out.println(mal);


    }
}
