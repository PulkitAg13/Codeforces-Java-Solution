import java.util.Scanner;

public class Codeforces1999A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int tens = n / 10;
            int ones = n % 10;

            System.out.println(tens + ones);
        }
    }
}
