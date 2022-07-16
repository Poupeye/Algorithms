package less_8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1," ");
        hm.put(2," ");
        hm.put(3," ");
        hm.put(4," ");
        hm.put(375," ");
        hm.put(6," ");
        hm.delete(375);

//        for (int i = 0; i < 10; i++) {
//            hm.put(rand.nextInt(1000), "" );
//        }
        System.out.println(hm);
    }
}
