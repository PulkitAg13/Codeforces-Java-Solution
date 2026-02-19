import java.util.Scanner;

public class Codeforces1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            boolean ok = false;

            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if(x == k) {
                    ok = true;
                }
            }

            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
