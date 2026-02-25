import java.util.Arrays;
import java.util.Scanner;

public class Codeforces1722A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (n != 5) {
                System.out.println("NO");
                continue;
            }
            
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            
            if (new String(arr).equals("Timru")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
