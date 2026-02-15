import java.util.Scanner;

public class Codeforces381A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int l = 0, r = n - 1;
        int s = 0, d = 0;
        boolean turn = true;

        while (l <= r) {
            int pick;
            if (a[l] > a[r]) {
                pick = a[l];
                l++;
            } else {
                pick = a[r];
                r--;
            }

            if (turn) s += pick;
            else d += pick;

            turn = !turn;
        }

        System.out.println(s + " " + d);
    }
}
