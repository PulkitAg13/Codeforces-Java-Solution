import java.util.Scanner;

public class Codeforces263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[5][5];
        int r = 0;
        int c = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1) {
                    r = i;
                    c = j;
                }
            }
        }

        int ans = Math.abs(r - 2) + Math.abs(c - 2);
        System.out.println(ans);
    }
}


