import java.util.Scanner;

public class Codeforces151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrink = k * l;
        int totalLime = c * d;

        int toastsByDrink = totalDrink / nl;
        int toastsByLime = totalLime;
        int toastsBySalt = p / np;

        int totalToasts = Math.min(toastsByDrink,
                           Math.min(toastsByLime, toastsBySalt));

        System.out.println(totalToasts / n);
    }
}
