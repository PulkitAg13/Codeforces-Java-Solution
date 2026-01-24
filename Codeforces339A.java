import java.util.Arrays;
import java.util.Scanner;

public class Codeforces339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] a = s.split("\\+");
        Arrays.sort(a);
        System.out.print(a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print("+" + a[i]);
        }
    }
}
