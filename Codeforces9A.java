import java.util.Scanner;

public class Codeforces9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int W = sc.nextInt();

        int maxValue = Math.max(Y, W);

        int good = 6 - maxValue + 1;
        int total = 6;

        int g = gcd(good, total);

        System.out.println((good / g) + "/" + (total / g));
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
