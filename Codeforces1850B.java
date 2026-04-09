import java.util.Scanner;

public class Codeforces1850B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int max = -1;
            int ans = -1;

            for(int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(a <= 10 && b > max) {
                    max = b;
                    ans = i;
                }
            }

            System.out.println(ans);
        }
    }
}
