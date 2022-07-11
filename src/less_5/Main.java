package less_5;

public class Main {
    public static void main(String[] args) {
        System.out.println(recDegreeNumber(2,8));
    }

    public static int recDegreeNumber(int num, int degree) {
        if (degree == 1) {
            return num;
        } else {
            return num * recDegreeNumber(num, degree - 1);
        }
    }



}
