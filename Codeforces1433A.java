import java.util.Scanner;

public class Codeforces1433A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int d = x % 10;
            int k = String.valueOf(x).length();
            int ans = (d - 1) * 10 + (k * (k + 1)) / 2;
            System.out.println(ans);
        }
    }
}
