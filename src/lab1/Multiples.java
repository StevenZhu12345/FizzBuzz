package lab1;

public class Multiples {
    public static void main(String[] args) {
        int a;
        a = multiples(1000);
        System.out.println(a);
    }
    public static int multiples(int i) {
        int b = 0;
        for (int j = 1; j <= i; j++) {
            boolean divisibleBy3 = j % 3 == 0;
            boolean divisibleBy5 = j % 5 == 0;
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
