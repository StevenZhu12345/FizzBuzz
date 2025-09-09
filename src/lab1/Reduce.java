package lab1;

public class Reduce {
    public static void main(String[] args) {
        int c = reduce(2);
        System.out.println(c);

    }
    public static int reduce(int n){
        int sum = 0;
        while (n != 0){
            if (n % 2 == 1){
                n = n - 1;
            }
            else {
                n /= 2;
            }
            sum++;
        }
        return sum;
    }
}
