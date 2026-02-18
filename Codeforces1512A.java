import java.util.Scanner;

public class Codeforces1512A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int same;

            if (arr[0] == arr[1] || arr[0] == arr[2]) {
                same = arr[0];
            } else {
                same = arr[1];
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] != same) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
