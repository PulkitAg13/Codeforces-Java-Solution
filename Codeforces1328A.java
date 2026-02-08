import java.util.Scanner;

public class Codeforces1328A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long rem = a % b;
            long ans = (b - rem) % b;

            System.out.println(ans);
        }
    }
}
