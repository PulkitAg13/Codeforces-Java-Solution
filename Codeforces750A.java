import java.util.Scanner;

public class Codeforces750A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int totalTime = 240 - k;
        int timeSpent = 0;
        int solved = 0;

        for (int i = 1; i <= n; i++) {
            timeSpent += 5 * i;
            if (timeSpent <= totalTime) {
                solved++;
            } else {
                break;
            }
        }

        System.out.println(solved);
    }
}
