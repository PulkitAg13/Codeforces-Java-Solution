import java.util.Arrays;
import java.util.Scanner;

public class Codeforces723A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(x);

        int meet = x[1];
        int ans = Math.abs(x[0] - meet) + Math.abs(x[2] - meet);

        System.out.println(ans);
    }
}
