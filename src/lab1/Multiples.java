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
    public static int multiples(){
        int b = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {
                b += 1;
            } else if (divisibleBy3) {
                b += 1;
            } else if (divisibleBy5) {
                b += 1;
            } else {
                b += 0;
            }
        }
        return b;
    }

}
