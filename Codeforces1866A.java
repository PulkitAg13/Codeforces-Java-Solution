import java.util.Scanner;

public class Codeforces1866A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x == 0) {
                System.out.println(0);
                return;
            }
            ans = Math.min(ans, Math.abs(x));
        }

        System.out.println(ans);
    }
}
