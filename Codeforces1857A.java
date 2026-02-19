import java.util.Scanner;

public class Codeforces1857A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int even = 0;
            int odd = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if (odd == 0) {
                System.out.println("YES");
            } 
            else if (even == 0) {
                System.out.println("NO");
            } 
            else {
                System.out.println("YES");
            }
        }
    }
}
