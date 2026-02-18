import java.util.Scanner;

public class Codeforces32B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == '.') {
                System.out.print(0);
                i++;
            } 
            else {
                if (s.charAt(i + 1) == '.') {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
                i += 2;
            }
        }
    }
}
