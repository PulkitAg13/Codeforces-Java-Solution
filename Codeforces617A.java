import java.util.Scanner;                                           

public class Codeforces617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = x / 5;
        if (x % 5 != 0) ans++;
        System.out.println(ans);
    }
}

