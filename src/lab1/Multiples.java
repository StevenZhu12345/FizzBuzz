package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000,3,5);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int m = 0;
        for (int j = 1; j < n; j++) {
            boolean divisibleBya = j % a == 0;
            boolean divisibleByb = j % b == 0;
            if (divisibleBya && divisibleByb) {
                m += 1;
            } else if (divisibleBya) {
                m += 1;
            } else if (divisibleByb) {
                m += 1;
            } else {
                m += 0;
            }
        }
        return m;
    }
}
