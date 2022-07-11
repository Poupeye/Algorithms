package less_5;

public class StolenGoods {
    private int weight;
    private int value;

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public StolenGoods(int weight, int value) {
        this.weight = weight;
        this.value = value;


    }
}

class Backpack {
     static final int MAX_WEIGHT = 100;

    public static void main(String[] args) {
        System.out.println(findBestRes(stolenGoods.length - 1, MAX_WEIGHT));
    }

    static StolenGoods[] stolenGoods = {new StolenGoods(25, 125),
            new StolenGoods(50, 200), new StolenGoods(80, 320)};

    private static int findBestRes(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (stolenGoods[i].getWeight() > weight) {
            return findBestRes(i - 1, weight);
        } else {
            return Math.max(findBestRes(i - 1, weight), findBestRes(i - 1, weight - stolenGoods[i].getWeight()) + stolenGoods[i].getValue());
        }
    }
}

