import java.util.Scanner;

public class Codeforces136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            ans[p[i] - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
