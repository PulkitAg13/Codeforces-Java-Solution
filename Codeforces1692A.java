import java.util.Scanner;

public class Codeforces1692A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int cnt = 0;

            if (b > a) cnt++;
            if (c > a) cnt++;
            if (d > a) cnt++;

            System.out.println(cnt);
        }
    }
}
