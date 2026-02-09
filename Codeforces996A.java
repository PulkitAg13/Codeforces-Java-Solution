import java.util.Scanner;

public class Codeforces996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long count = 0;

        long[] bills = {100, 20, 10, 5, 1};

        for (int i = 0; i < bills.length; i++) {
            count += n / bills[i];
            n = n % bills[i];
        }

        System.out.println(count);
    }
}
