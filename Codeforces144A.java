import java.util.Scanner;

public class Codeforces144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxVal = a[0], minVal = a[0];
        int maxPos = 0, minPos = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > maxVal) {
                maxVal = a[i];
                maxPos = i;
            }
            if (a[i] <= minVal) {
                minVal = a[i];
                minPos = i;
            }
        }

        int moves = maxPos + (n - 1 - minPos);
        if (maxPos > minPos) moves--;

        System.out.println(moves);
    }
}
